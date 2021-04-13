package com.free.wordbookserver.controller;

import com.free.wordbookserver.domain.Catalogue;
import com.free.wordbookserver.domain.Plan;
import com.free.wordbookserver.domain.PlanWord;
import com.free.wordbookserver.dto.QueryWord;
import com.free.wordbookserver.myutil.ConvertUtil;
import com.free.wordbookserver.service.WordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单词服务控制器
 */
@RestController
public class WordController {

    @Resource
    private WordService service;


    /**
     * 查询单词总表  tableName tword
     * 所有的单词
     *
     * @return 单词总表
     */
    @GetMapping("/word")
    public List<QueryWord> wordList() {
        List<QueryWord> words = ConvertUtil.convert(service.list(), QueryWord.class);
        return words;
    }

    /**
     * 根据传入的单词书类型id
     * 返回列表
     */
    @GetMapping("/word/book/{type}")
    public List<Catalogue> booklist(@PathVariable String type) {
        return service.booklist(type);
    }

    /**
     * 传入个人的计划  并进行保存
     */
    @PostMapping("/word/plan/save")
    public boolean insertPlan(@RequestBody Plan plan) {
        return service.insertPlan(plan);
    }


    /**
     * 传入表id  进行单词列表的查询 优化数据库索引 查询时间大概为1s
     * @param classId  列表id
     * @return 单词列表
     */
    @GetMapping("/word/plan/queryPlanwordList/{classid}")
    public List<PlanWord> queryPlanwordList (@PathVariable String classId){
        return service.queryPlanWordList(classId);
    }



}
