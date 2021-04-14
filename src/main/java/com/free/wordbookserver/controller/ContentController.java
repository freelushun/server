package com.free.wordbookserver.controller;



import com.free.wordbookserver.service.ProtocolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 协议文本控制器
 */
@RestController
public class ContentController {

    @Resource
    private ProtocolService protocolService;



    @GetMapping("/protocol/{id}")
    public String protocol(@PathVariable int id){
        return  protocolService.queryById(id).getProtocolContent();
    }




}
