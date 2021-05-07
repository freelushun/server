package com.free.wordbookserver.myutil;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;

public class Utility {
    //登录
    public final static String SIGNIN = "834525";
    //注册
    public final static String SIGNUP = "834523";
    //修改密码
    public final static String MODIFY = "834527";
    //修改手机号绑定
    public final static String BOUND = "834528";
    //错误提示
    public final static String ERROR = "835728";


    public static String sendSms(String verifyCode, String phoneNumber, String sendType) {
        SendSmsResponse resp;
        try {

            Credential cred = new Credential("AKIDVu531pKON5MPD3u9vTkV0ELCJA6pqVx9", "MxLRS5pV0GNNKPTnuleDblmX21Qq9BF7");
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("sms.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            SmsClient client = new SmsClient(cred, "", clientProfile);

            SendSmsRequest req = new SendSmsRequest();
            phoneNumber = "+86" + phoneNumber;
            String[] phoneNumberSet1 = {phoneNumber};
            req.setPhoneNumberSet(phoneNumberSet1);
            req.setSign("卢顺个人代码展示");
//            req.setSign("顺个人代码展示");

            //模板id  需要改变
            req.setTemplateID(sendType);


            //短信模板 验证码  验证码有效时间
            String[] templateParamSet1 = {verifyCode, "5"};
            req.setTemplateParamSet(templateParamSet1);

            req.setSmsSdkAppid("1400469092");

            resp = client.SendSms(req);

            return "ok";
//            return resp.getSendStatusSet()[0].getCode();
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
        return "no";
    }
}
