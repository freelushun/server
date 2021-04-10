package com.free.wordbookserver.controller;


import com.free.wordbookserver.dto.AccountDto;
import com.free.wordbookserver.myutil.BasicUtil;
import com.free.wordbookserver.myutil.Utility;
import com.free.wordbookserver.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

/**
 * 账号服务控制器
 */
@RestController
@RequestMapping("/account")
public class AccountController {


    @Resource
    private AccountService service;

    //短信请求接口
    @PostMapping("/sms")
    public AccountDto send(@RequestBody AccountDto accountDto) {
        //根据请求的请求类型 进行控制器选择
        //请求类型  1.账号注册或者登录   2、修改账号密码  3、进行手机号绑定的修改
        String type = accountDto.getType();
        String phone = accountDto.getPhone();
        /**
         * 后端校验手机号是否合理
         */
        if (!BasicUtil.validatePhoneNumber(phone)) {
            accountDto.setStatus("failed");
            return accountDto;
        }

        String verifyCodeUse = "";
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
                    verifyCodeUse = "01";
                } else {
                    //发送注册短信
                    status = Utility.sendSms(verifyCode, phone, Utility.SIGNUP);
                    verifyCodeUse = "00";
                }
                break;
            case "1":

                break;
            case "2":
                break;
            default:
                break;

        }
        //将验证码写入验证码表,验证码表由手机号作为唯一主键
        service.saveVerifyCode(phone, verifyCode, verifyCodeUse);

        //短信发送状态返回给用户
        accountDto.setStatus(status);
        accountDto.setVerifyCode(verifyCode);


        /**************后期需要删除的代码**************/
        /**************start***********************/

        accountDto.setVerifyCode(verifyCode);

        /**************end*************************/


        return accountDto;
    }

    /**
     * 账号操作控制器  登录/注册
     */
    @PostMapping("/ctrlAccount")
    public AccountDto ctrlAccount(@RequestBody AccountDto accountDto) throws NoSuchAlgorithmException {
        String phone = accountDto.getPhone();

        String code = accountDto.getVerifyCode();
        //验证码 如果没有验证按 代表着使用密码进行验证
        if (code==null) {
            //账号密码登录
            String password = accountDto.getPassword();

            /**************后期需要删除的代码**************/
            /**************start***********************/

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            /**************end*************************/

            return service.verifyPassword(accountDto);
        } else {
            if (!(BasicUtil.validateNumber(code, 6) && BasicUtil.validatePhoneNumber(phone))) {
                accountDto.setStatus("failed");
                return accountDto;
            }
            //校验验证码  并且判断类型  进行业务的分流
            switch (service.checkVerifyCode(phone, code)) {
                //注册新账号
                case "00":
                    accountDto = service.signUp(accountDto);

                    break;
                //登录账号:
                case "01":
                    accountDto = service.signIn(accountDto);
                    break;

            }
        }


        /**************后期需要删除的代码**************/
        /**************start***********************/
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        /**************end*************************/

        return accountDto;
    }


}
