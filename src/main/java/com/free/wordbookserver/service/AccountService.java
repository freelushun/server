package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.User;
import com.free.wordbookserver.domain.UserExample;
import com.free.wordbookserver.domain.VerifyCode;
import com.free.wordbookserver.mapper.UserMapper;
import com.free.wordbookserver.mapper.VerifyCodeMapper;
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
    @Resource
    private VerifyCodeMapper verifyCodeMapper;

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


    /**
     * 存储验证码与更新验证码
     * @param phone  手机号码
     * @param code  验证码
     */
    public void   saveVerifyCode(String phone,String code){
        VerifyCode verifyCode = new VerifyCode(phone,code);
        VerifyCode verifyCode1 =  verifyCodeMapper.selectByPrimaryKey(phone);
        //存在此号码的验证码则更新  否则保存
        if (verifyCode1!=null){
            verifyCodeMapper.updateByPrimaryKey(verifyCode);
        }else {
            verifyCodeMapper.insert(verifyCode);
        }






    }

}
