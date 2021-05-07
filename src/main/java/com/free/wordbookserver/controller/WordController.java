package com.free.wordbookserver.controller;

import com.free.wordbookserver.domain.*;

import com.free.wordbookserver.dto.QueryWord;
import com.free.wordbookserver.myutil.ConvertUtil;
import com.free.wordbookserver.service.WordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Arrays;
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
    public String insertPlan(@RequestBody Plan plan) {
        return service.insertPlan(plan);
    }


    /**
     * 去人单词表id后 返回对应的单词表
     *
     * @param classId 单词表id
     * @return 具体的单词表
     */
    @GetMapping("/word/plan/table/{classId}")
    public List<PlanWord> table(@PathVariable String classId) {

        return service.table(classId);
    }


    /**
     * 增阿个人已经学过的单词
     *
     * @param personPlanwords
     * @return
     */
    @PostMapping("/word/plan/table/list")
    public String insertList(@RequestBody List<PersonPlanword> personPlanwords) {

        return String.valueOf(service.insertList(personPlanwords));

    }

    @PostMapping("/time/studydays")
    public String saveStudyDayse(@RequestBody StudyTime studyTime ){
        return service.saveStudyDays(studyTime);
    }

}
