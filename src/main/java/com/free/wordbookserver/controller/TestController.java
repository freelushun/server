package com.free.wordbookserver.controller;


import com.free.wordbookserver.domain.Test;
import com.free.wordbookserver.service.TestService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class TestController {


    @Resource
    private TestService testService;




    @GetMapping("/list")
    public List<Test> list(){
        return  testService.list();
    }

    @GetMapping("/test")
    public String test(){
        return  testService.test();
    }


}
