package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.*;
import com.free.wordbookserver.dto.AccountDto;
import com.free.wordbookserver.dto.SecurityQuesitionDto;
import com.free.wordbookserver.mapper.PlanMapper;
import com.free.wordbookserver.mapper.SecurityquestionMapper;
import com.free.wordbookserver.mapper.UserMapper;
import com.free.wordbookserver.mapper.VerifyCodeMapper;
import com.free.wordbookserver.myutil.BasicUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

/**
 * 账户服务
 */
@Service
public class AccountService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private VerifyCodeMapper verifyCodeMapper;
    @Resource
    private PlanMapper planMapper;
    @Resource
    private SecurityquestionMapper securityquestionMapper;

    /**
     * 通过手机号检查是否存在账户
     *
     * @param phone 手机号码
     * @return 是否存在  存在返回true
     */
    public boolean isExist(String phone) {
        UserExample example = new UserExample();
        example.createCriteria().andUserPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(example);
        return !users.isEmpty();
    }

    //账户注册模块


    /**
     * 存储验证码与更新验证码
     *
     * @param phone 手机号码
     * @param code  验证码
     */
    public void saveVerifyCode(String phone, String code, String type) {
        VerifyCode verifyCode = new VerifyCode(phone, code, type);
        VerifyCode verifyCode1 = verifyCodeMapper.selectByPrimaryKey(phone);
        //存在此号码的验证码则更新  否则保存
        if (verifyCode1 != null) {
            verifyCodeMapper.updateByPrimaryKey(verifyCode);
        } else {
            verifyCodeMapper.insert(verifyCode);
        }
        //开启线程  5分钟后自动删除这个验证码
        new Thread(() -> {
            try {
                Thread.sleep(1000 * 60 * 5);
                verifyCodeMapper.deleteByPrimaryKey(phone);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

    }


    /**
     * 传入手机号  查询
     *
     * @param phone 传入手机号码
     * @param code  传入验证码
     * @return 返回值只要不为-1,此项验证通过
     */
    public String checkVerifyCode(String phone, String code) {
        //查询验证实体
        VerifyCode verifyCode = verifyCodeMapper.selectByPrimaryKey(phone);
        if (verifyCode != null) {
            if (verifyCode.getCode().equals(code)) {
                //校验成功后删除验证码
                verifyCodeMapper.deleteByPrimaryKey(phone);
                return verifyCode.getType();
            }
        }
        return "-1";
    }


    /**
     * 注册新的账号
     *
     * @param accountDto 传入实体
     * @return 手机号码  用户名称  用户id
     */
    public AccountDto signUp(AccountDto accountDto) {

        //生成用户名称
        String name = BasicUtil.genOutOfOrder(8);
        User user = new User();
        user.setUserPhone(accountDto.getPhone());
        user.setUserName(name);
        user.setUserId(BasicUtil.genShortString(8, "0"));
        //保存用户
        userMapper.insert(user);
        accountDto.setStatus("ok");
        accountDto.setName(name);
        accountDto.setId(user.getUserId());
        return accountDto;
    }


    /**
     * 进行登录 获取登录用户信息
     *
     * @param accountDto 传入实体
     * @return 返回实体
     */
    public AccountDto signIn(AccountDto accountDto) {
        User user = userMapper.selectByPrimaryKey(accountDto.getPhone());
        accountDto.setStatus("ok");
        accountDto.setName(user.getUserName());
        accountDto.setId(user.getUserId());
        return accountDto;
    }


    /**
     * 校验用户账号和密码
     *
     * @param accountDto 手机号码  密码
     * @return 手机号码 密码  校验状态  用户名称 用户短id
     * @throws NoSuchAlgorithmException
     */
    public AccountDto verifyPassword(AccountDto accountDto) throws NoSuchAlgorithmException {
        String phone = accountDto.getPhone();
        String password = accountDto.getPassword();
        User user = userMapper.selectByPrimaryKey(phone);
        if (user != null && BasicUtil.encryptBySHA256(password).equals(user.getPassword())) {
            //校验成功后 检查此账号是否具有计划，并且添加
            accountDto.setHasPlan(obPlan(phone) != null);
            accountDto.setStatus("ok");
        } else {
            accountDto.setStatus("failed");
        }

        accountDto.setId(user.getUserId());
        accountDto.setName(user.getUserName());

        return accountDto;
    }


    /**
     * 检查此账号具有的计划
     */
    public Plan obPlan(String phone) {
        return planMapper.selectByPrimaryKey(phone);
    }

    /**
     * 根据传入的plan进行更新
     *
     * @param plan
     */
    public void updatePlan(Plan plan) {
        planMapper.updateByPrimaryKey(plan);

    }

    /**
     * 根据传入的手机号 返回User
     *
     * @return
     */
    public User queryUser(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()) return users.get(0);
        else return null;
    }


    //检查密码是否正确,然后返回是否
    public boolean checkPassword(AccountDto accountDto) throws NoSuchAlgorithmException {
        User user = userMapper.selectByPrimaryKey(accountDto.getPhone());
        if (user == null) {
            return false;
        }
        return BasicUtil.encryptBySHA256(accountDto.getPassword()).equals(user.getPassword());


    }

    /**
     * 查询是否有密保
     *
     * @param phone 传入手机号码
     * @return 返回密保dto
     */
    public SecurityQuesitionDto querySecurityQuesition(String phone) {
        SecurityQuesitionDto securityQuesitionDto = new SecurityQuesitionDto();
        //查询是否有密保
        SecurityquestionExample securityquestionExample = new SecurityquestionExample();
        securityquestionExample.createCriteria().andPhoneEqualTo(phone);
        List<Securityquestion> securityquestions = securityquestionMapper.selectByExample(securityquestionExample);
        if (securityquestions != null && securityquestions.size() > 0) {

            securityQuesitionDto.setFlag(true);
            securityQuesitionDto.setSecurityquestion(securityquestionMapper.selectByExample(securityquestionExample).get(0));
        } else {
            securityQuesitionDto.setFlag(false);
            securityQuesitionDto.setSecurityquestion(null);
        }

        return securityQuesitionDto;

    }

    /**
     * 检查是否设置密码
     *
     * @param phone 手机号码
     * @return 是否有密码
     */
    public boolean isSettingPassword(String phone) {

        User user = userMapper.selectByPrimaryKey(phone);
        if (user == null) return false;
        return user.getPassword() != null;

    }

    /**
     * @param phone 手机号码
     * @return 1 只有手机号码  2 手机号码和密码  3 手机号码   密保 4  手机号码  密码   密保
     */
    public int isSettingSecurity(String phone) {

        boolean flagPassword = isSettingPassword(phone);
        SecurityquestionExample example = new SecurityquestionExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<Securityquestion> securityquestions = securityquestionMapper.selectByExample(example);
        boolean flagSecurifyQeusetion = !securityquestions.isEmpty();
        if (!flagPassword && flagSecurifyQeusetion) return 1;
        if (flagPassword && !flagSecurifyQeusetion) return 2;

        if (!flagPassword && flagSecurifyQeusetion) return 3;
        if (flagPassword && flagSecurifyQeusetion) return 4;
        else return 1;

    }

    /**
     * @param map 三个参数
     * @return 返回是否修改成功
     */
    public boolean changePassword(@RequestBody HashMap<String, String> map) throws NoSuchAlgorithmException {
        String oldPassword = map.get("oldPassword");
        String newPassword = map.get("newPassword");
        String phone = map.get("phone");

        User user = userMapper.selectByPrimaryKey(phone);
        if (user == null) return false;

        if (BasicUtil.encryptBySHA256(oldPassword).equals(user.getPassword())) {
            user.setPassword(BasicUtil.encryptBySHA256(newPassword));
            userMapper.updateByPrimaryKey(user);
            return true;
        }


        return false;
    }


    /**
     * 至直接修改密码
     * @param map
     * @return
     * @throws NoSuchAlgorithmException
     */
    public boolean directChangePassword(HashMap<String, String> map) throws NoSuchAlgorithmException {
        String phone = map.get("phone");
        if (phone != null) {
            User user = userMapper.selectByPrimaryKey(phone);
            String password = map.get("password");
            if (password != null) {
                user.setPassword(BasicUtil.encryptBySHA256(password));
                userMapper.updateByPrimaryKey(user);
                System.out.println(3);
                return true;
            }
            System.out.println(2);
            return false;
        }

        System.out.println(1);
        return false;

    }
}
