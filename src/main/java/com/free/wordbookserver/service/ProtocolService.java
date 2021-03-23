package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.Protocol;
import com.free.wordbookserver.mapper.ProtocolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProtocolService {

    @Resource
    private ProtocolMapper mapper;

    public Protocol queryById(int id){
        return mapper.selectByPrimaryKey(id);
    }

}
