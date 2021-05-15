package com.free.wordbookserver.controller;


import com.free.wordbookserver.domain.Plan;
import com.free.wordbookserver.domain.Securityquestion;
import com.free.wordbookserver.domain.User;
import com.free.wordbookserver.dto.AccountDto;
import com.free.wordbookserver.dto.SecurityQuesitionDto;
import com.free.wordbookserver.myutil.BasicUtil;
import com.free.wordbookserver.myutil.Utility;
import com.free.wordbookserver.service.AccountService;
import com.free.wordbookserver.service.SecurityquestionService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * 账号服务控制器
 */
@RestController
@RequestMapping("/account")
public class AccountController {


    @Resource
    private AccountService service;
    @Resource
    private SecurityquestionService securityquestionService;


    /**
     * 短信请求接口
     *
     * @param accountDto 传输dto  手机号码  请求类型
     * @return 返回dto    手机号码 请求类型   操作结果状态
     */
    @PostMapping("/sms")
    public AccountDto send(@RequestBody AccountDto accountDto) {
        //根据请求的请求类型 进行控制器选择
        //请求类型  0.账号注册或者登录   2、修改账号密码  3、进行手机号绑定的修改
        String type = accountDto.getType();
        String phone = accountDto.getPhone();

        /**
         * 校验手机号是否合理
         * 不合理直接返回  前端有手机号码校验  此步为防止不按规则直接调用接口
         */
        if (!BasicUtil.validatePhoneNumber(phone)) {
            accountDto.setStatus("failed");
            return accountDto;
        }

        String verifyCodeUse = "";

        String status = "";


        //生成6位验证码
        String verifyCode = BasicUtil.genShortString(6, "0");


        switch (type) {
            case "0":
                //0。账号注册或者登录  根据手机号码是否存在于user表中进行鉴别
                //查询user表中是否存在词条数据
                boolean isExist = service.isExist(phone);
                if (isExist) {
                    //发送登录短信
                    status = Utility.sendSms(verifyCode, phone, Utility.SIGNIN);
                    //设置验证码类型为  登录验证码
                    verifyCodeUse = "01";
                } else {
                    //发送注册短信
                    status = Utility.sendSms(verifyCode, phone, Utility.SIGNUP);
                    //设置验证码类型为注册验证码
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

        //根据是否传入验证码 进行判断  用户是使用手机验证码登录   还是使用手机密码登录
        String phone = accountDto.getPhone();

        String code = accountDto.getVerifyCode();
        //验证码 如果没有验证按 代表着使用密码进行验证
        if (code == null) {
            //账号密码登录
            return service.verifyPassword(accountDto);
        } else {
            //验证码格式错误 或者手机号码格式错误
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
            //设置用户是否含有个人计划
            accountDto.setHasPlan(service.obPlan(phone) != null);
            if (service.obPlan(phone) != null) {
                accountDto.setMsg(service.obPlan(phone).getClassId());
            }


        }


        return accountDto;
    }


    /**
     * 根据传入的手机号码 返回个人的计划安排表
     *
     * @param phone 手机号码
     * @return 计划安排表
     */
    @GetMapping("/person/plan/{phone}")
    public Plan queryPersonPlan(@PathVariable String phone) {
        return service.obPlan(phone);
    }


    @PostMapping("/person/plan/update")
    public String updatePlan(@RequestBody Plan plan) {
        System.out.println(plan);
        service.updatePlan(plan);
        return "success";
    }

    //查询用户信息
    @RequestMapping("/user/{phone}")
    public User queryUser(@PathVariable String phone) {
        return service.queryUser(phone);
    }


    //查询用户的密保信息
    @RequestMapping("/user/securityQestion/{phone}")
    public Securityquestion querySecurityQuestion(@PathVariable String phone) {

        return securityquestionService.querySecurityQuestion(phone);
    }


    /**
     * 校验用户密保是否 正确
     */
    @RequestMapping("/user/checkQuestion/{phone}")
    public boolean checkQuestion(@RequestBody Securityquestion securityquestion){
        return  securityquestionService.checkQuestion(securityquestion);
    }



    /**
     * 检查密码是否正确
     */
    @PostMapping("/user/checkPassword")
    public boolean verifyPassword(@RequestBody AccountDto accountDto) throws NoSuchAlgorithmException {
        return service.checkPassword(accountDto);
    }

    /**
     * 查询是否有密保
     */
    @RequestMapping("/user/querySecurityQuesition/{phone}")
    public SecurityQuesitionDto querySecurityQuesition(@PathVariable String phone) {
        return service.querySecurityQuesition(phone);
    }

    /**
     * 保存密保
     */
    @RequestMapping("/user/saveSecurityQuesition")
    public boolean saveSecurityQuesition(@RequestBody Securityquestion securityquestion) throws NoSuchAlgorithmException {
        securityquestionService.saveSecurityQuesition(securityquestion);

        return true;
    }

    @RequestMapping("/user/isSettingPassword/{phone}")
    public boolean isSettingPassword(@PathVariable String phone) {
        return service.isSettingPassword(phone);
    }


    /**
     * @param phone 手机号码
     * @return 1 只有手机号码  2 手机号码和密码  3  手机号码  密码   密保
     */
    @RequestMapping("/user/isSettingSecurity/{phone}")
    public int isSettingSecurity(@PathVariable String phone) {
        return service.isSettingSecurity(phone);
    }


    @RequestMapping("/user/changePassword")
    public boolean changePassword(@RequestBody String s) throws NoSuchAlgorithmException {
        HashMap<String, String> map = new Gson().fromJson(s, HashMap.class);
        return service.changePassword(map);


    }

}
