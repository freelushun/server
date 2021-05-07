package com.free.wordbookserver.service;

import com.free.wordbookserver.domain.Music;
import com.free.wordbookserver.mapper.MusicMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ListenService {

    @Resource
    MusicMapper musicMapper;


    //返回列表
    public List<Music> list() {

        return musicMapper.selectByExample(null);
    }
}
