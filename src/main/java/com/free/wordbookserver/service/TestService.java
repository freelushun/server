package com.free.wordbookserver.service;

import com.free.wordbookserver.domain.Test;
import com.free.wordbookserver.domain.TestExample;
import com.free.wordbookserver.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class TestService {

    @Resource
    private TestMapper  testMapper;

    public List<Test> list(){
        return testMapper.selectByExample(new TestExample());
    }


}
