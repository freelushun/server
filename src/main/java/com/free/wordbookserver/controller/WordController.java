package com.free.wordbookserver.controller;

import com.free.wordbookserver.domain.Catalogue;
import com.free.wordbookserver.domain.T11;
import com.free.wordbookserver.dto.MyWord;
import com.free.wordbookserver.myutil.ConvertUtil;
import com.free.wordbookserver.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
     *所有的单词
     * @return 单词总表
     */
    @GetMapping("/word")
    public List<MyWord> wordList() {
        List<MyWord> words = ConvertUtil.convert(service.list(), MyWord.class);
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
}
