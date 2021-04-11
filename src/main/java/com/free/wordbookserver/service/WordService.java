package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.*;
import com.free.wordbookserver.mapper.*;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.sun.org.apache.xml.internal.resolver.CatalogManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class WordService {


    @Resource
    TwordMapper twordMapper;

    @Resource
    CatalogueMapper catalogueMapper;

    @Resource
    PlanMapper planMapper;
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
     * @param plan 传入的计划
     * @return 返回对应的classId的单词列表  耗时操作
     */
    public boolean insertPlan(Plan plan) {

        return planMapper.insert(plan) > 0;
    }


    /**
     * 根据传入的classid 进行返回对应的单词表
     *
     * @param classId 表id
     * @return 单词列表 List<PlanWord>
     */
    public List<PlanWord> queryPlanWordList(String classId) {
        PlanWordExample planWordExample = new PlanWordExample();
        planWordExample.createCriteria().andClassidEqualTo(classId);
        List<PlanWord> planWords = planWordMapper.selectByExample(planWordExample);
        System.out.println("id:" + classId);
        System.out.println("size:" + planWords.size());
        System.out.println(Arrays.toString(planWords.toArray()));
        return planWordMapper.selectByExample(planWordExample);

    }


}
