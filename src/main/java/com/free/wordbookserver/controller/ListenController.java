package com.free.wordbookserver.controller;

import com.free.wordbookserver.domain.Music;
import com.free.wordbookserver.dto.BookDto;
import com.free.wordbookserver.mapper.MusicMapper;
import com.free.wordbookserver.service.ListenService;
import com.free.wordbookserver.service.ReadBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * 阅读控制器
 */
@RestController
@RequestMapping("/music")
public class ListenController {


    @Resource
    ListenService service;


    /**
     * 请求听力文件列表
     */
    @RequestMapping("/list")
    public List<Music> list(){
        return  service.list();
    }



}
