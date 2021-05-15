package com.free.wordbookserver.service;

import com.free.wordbookserver.domain.Securityquestion;
import com.free.wordbookserver.domain.SecurityquestionExample;
import com.free.wordbookserver.mapper.SecurityquestionMapper;
import com.free.wordbookserver.myutil.BasicUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.List;


@Service
public class SecurityquestionService {


    @Resource
    SecurityquestionMapper mapper;

    /**
     * 查询密保问题
     * @param phone 手机号
     * @return 密保
     */
    public Securityquestion querySecurityQuestion(String phone) {
        Securityquestion securityquestion = new Securityquestion();
        SecurityquestionExample example = new SecurityquestionExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<Securityquestion> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            securityquestion = list.get(0);
            securityquestion.setAnswerone("");
            securityquestion.setAnswerthree("");
            securityquestion.setAnswertwo("");
            return securityquestion;
        } else return null;

    }





    /**
     * 保存密保问题
     * @param securityquestion
     * @throws NoSuchAlgorithmException
     */
    public void saveSecurityQuesition(Securityquestion securityquestion) throws NoSuchAlgorithmException {
        String answer1 = BasicUtil.encryptBySHA256(securityquestion.getAnswerone().trim());
        String answer2 = BasicUtil.encryptBySHA256(securityquestion.getAnswertwo().trim());
        String answer3 = BasicUtil.encryptBySHA256(securityquestion.getAnswerthree().trim());
        securityquestion.setAnswerone(answer1);
        securityquestion.setAnswertwo(answer2);
        securityquestion.setAnswerthree(answer3);

        mapper.insert(securityquestion);
    }


    /**
     * 校验密保是否正确
     * @param securityquestion 传入
     * @return boolean
     */
    public boolean checkQuestion(Securityquestion securityquestion) {


        return  false;
    }
}
