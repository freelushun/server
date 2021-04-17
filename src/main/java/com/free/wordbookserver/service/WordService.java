package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.*;
import com.free.wordbookserver.mapper.*;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.sun.org.apache.xml.internal.resolver.CatalogManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WordService {

    //查询总表
    @Resource
    TwordMapper twordMapper;

    //单词书目录表
    @Resource
    CatalogueMapper catalogueMapper;

    //个人计划表
    @Resource
    PlanMapper planMapper;
    //个人计划单词表
    @Resource
    PlanWordMapper planWordMapper;


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

        if (planMapper.selectByPrimaryKey(plan.getPhone()) != null) {
            planMapper.updateByPrimaryKey(plan);
        } else planMapper.insert(plan);

        return "success";

    }


    /**
     * 根据传入的表id  返回对应的单词列表  优化索引 查询熟读较快  表规模不大
     *
     * @param classId 单词表id
     * @return 单词列表
     */
    public List<PlanWord> table(String classId) {
        PlanWordExample example = new PlanWordExample();
        example.createCriteria().andClassidEqualTo(classId);
        return planWordMapper.selectByExample(example);
    }
}
