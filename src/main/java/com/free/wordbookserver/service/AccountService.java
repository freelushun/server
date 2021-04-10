package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.*;
import com.free.wordbookserver.dto.AccountDto;
import com.free.wordbookserver.mapper.PlanMapper;
import com.free.wordbookserver.mapper.UserMapper;
import com.free.wordbookserver.mapper.VerifyCodeMapper;
import com.free.wordbookserver.myutil.BasicUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
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
     * @return 返回信息
     */
    public AccountDto signUp(AccountDto accountDto) {

        String name = BasicUtil.genOutOfOrder(8);

        User user = new User();
        user.setUserPhone(accountDto.getPhone());
        user.setUserName(name);
        user.setUserId(BasicUtil.genShortString(8, "0"));
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
     */
    public AccountDto verifyPassword(AccountDto accountDto) throws NoSuchAlgorithmException {
        String phone = accountDto.getPhone();
        String password = accountDto.getPassword();
        User user = userMapper.selectByPrimaryKey(phone);
        if (BasicUtil.encryptBySHA256(password).equals(user.getPassword())) {
            //校验成功后 检查此账号是否具有计划，并且添加
            accountDto.setHasPlan(!obPlan(phone).isEmpty());
            accountDto.setStatus("ok");
        } else {
            accountDto.setStatus("failed");
        }

        return accountDto;
    }


    /**
     * 检查此账号具有的计划
     */
    public List<Plan> obPlan(String phone) {
        List<Plan> plans;
        PlanExample example = new PlanExample();
        example.createCriteria().andPhoneEqualTo(phone);
        plans = planMapper.selectByExample(example);
        return plans;
    }


    /**
     * 向账号添加计划
     */
    public boolean insertPlan() {
        return false;
    }


}
