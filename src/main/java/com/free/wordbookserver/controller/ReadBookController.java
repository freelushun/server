package com.free.wordbookserver.controller;

import com.free.wordbookserver.dto.BookDto;
import com.free.wordbookserver.service.ReadBookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 阅读控制器
 */
@RestController
@RequestMapping("/book")
public class ReadBookController {


    @Resource
    ReadBookService service;


    /**
     * 请求书籍列表
     *
     * @return
     */
    @GetMapping("/list/{page}")
    public BookDto list(@PathVariable int page) {
        return service.list(page);
    }


    @GetMapping("/book/{id}")
    public void txt(HttpServletResponse response, @PathVariable String id) throws IOException {
        response.sendRedirect("http://127.0.0.1:9000/book/file/"+id+".txt");
    }


}
