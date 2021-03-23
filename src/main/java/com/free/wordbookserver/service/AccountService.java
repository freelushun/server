package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.User;
import com.free.wordbookserver.domain.UserExample;
import com.free.wordbookserver.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账户服务
 */
@Service
public class AccountService {

    @Resource
   private   UserMapper userMapper ;


    /**
     * 通过手机号检查是否存在账户
     * @param phone  手机号码
     * @return 是否存在  存在返回true
     */
    public boolean isExist(String phone){
        UserExample example = new UserExample();
          example.createCriteria().andUserPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(example);

        return !users.isEmpty();
    }

    //账户注册模块


}
