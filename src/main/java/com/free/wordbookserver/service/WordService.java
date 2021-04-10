package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.Catalogue;
import com.free.wordbookserver.domain.CatalogueExample;
import com.free.wordbookserver.domain.T11;
import com.free.wordbookserver.domain.Tword;
import com.free.wordbookserver.mapper.CatalogueMapper;
import com.free.wordbookserver.mapper.T11Mapper;
import com.free.wordbookserver.mapper.TwordMapper;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.sun.org.apache.xml.internal.resolver.CatalogManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WordService {


    @Resource
    TwordMapper twordMapper;

    @Resource
    CatalogueMapper catalogueMapper;

    /**
     * 查询单词总表
     *
     * @return 单词总表中的所有单词  用于查询
     */
    public List<Tword> list() {
        return twordMapper.selectByExample(null);
    }


    /**
     * 根据类别返回系列的单词书
     *
     * @param type 类别
     * @return 对应系列的单词书
     */
    public List<Catalogue> booklist(String type) {
        List<Catalogue> catalogues;
        //如果类别为0返回所有的表格
        if (type.equals("0"))
            return catalogueMapper.selectByExample(null);

        CatalogueExample catalogueExample = new CatalogueExample();
        catalogueExample.createCriteria().andTypeEqualTo(type);
        return catalogueMapper.selectByExample(catalogueExample);

    }
}
