package com.free.wordbookserver.controller;


import com.free.wordbookserver.dto.SmsDto;
import com.free.wordbookserver.myutil.BasicUtil;
import com.free.wordbookserver.myutil.Utility;
import com.free.wordbookserver.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {


    @Resource
    private AccountService service;

    //短信请求接口
    @PostMapping("/account/sms")
    public SmsDto send(@RequestBody SmsDto smsDto) {
        //根据请求的请求类型 进行控制器选择
        //请求类型  1.账号注册或者登录   2、修改账号密码  3、进行手机号绑定的修改
        String type = smsDto.getType();
        String phone = smsDto.getPhone();
        //1。账号注册或者登录  根据手机号码是否存在于user表中进行鉴别
        String status = "";
        String verifyCode = BasicUtil.genShortString(6, "0");
        switch (type) {
            case "0":
                //查询user表中是否存在词条数据
                boolean isExist = service.isExist(phone);
                if (service.isExist(phone)) {
                    //发送登录短信
                    status = Utility.sendSms(verifyCode, phone, Utility.SIGNIN);

                } else {
                    //发送注册短信
                    status = Utility.sendSms(verifyCode, phone, Utility.SIGNUP);
                }
            break;
            case  "1":

                break;
            case "2":
                break;
            default:
                break;

        }
        //将验证码写入验证码表,验证码表由手机号作为唯一主键
        smsDto.setSuccess(status);


//        String status = Utility.sendSms(BasicUtil.genVerifyCode(6,"1"),smsDto.getPhone(), smsDto.getType());
//        smsDto.setSuccess(status);
//        return smsDto;

        return smsDto;
    }

    ;

}
