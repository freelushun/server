package com.free.wordbookserver.controller;


import com.free.wordbookserver.domain.T11;
import com.free.wordbookserver.service.ProtocolService;
import com.free.wordbookserver.service.WordService;
import com.tencentcloudapi.tci.v20190318.models.Word;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


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
