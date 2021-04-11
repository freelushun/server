package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.Plan;
import com.free.wordbookserver.domain.PlanWord;
import com.free.wordbookserver.domain.Test;
import com.free.wordbookserver.domain.TestExample;
import com.free.wordbookserver.mapper.PlanWordMapper;
import com.free.wordbookserver.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.Arrays;
import java.util.List;


@Service
public class TestService {

    @Resource
    private TestMapper testMapper;
    @Resource
    PlanWordMapper planWordMapper;

    public List<Test> list() {
        return testMapper.selectByExample(new TestExample());
    }


    public String test() {


        return "success";
    }
}
