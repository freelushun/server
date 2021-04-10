package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.*;
import com.free.wordbookserver.mapper.CatalogueMapper;
import com.free.wordbookserver.mapper.PlanMapper;
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

    @Resource
    PlanMapper planMapper;

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
        CatalogueExample catalogueExample = new CatalogueExample();

        //如果类别为0返回所有的表格
        if (type.equals("0"))
            return catalogueMapper.selectByExample(catalogueExample);
        catalogueExample.createCriteria().andTypeEqualTo(type);
        return catalogueMapper.selectByExample(catalogueExample);

    }


    /**
     * 根据传入的plan写入库
     *
     * @param plan
     * @return
     */
    public String insertPlan(Plan plan) {
        int a = planMapper.insert(plan);
        return a > -1?"success":"false";
    }
}
