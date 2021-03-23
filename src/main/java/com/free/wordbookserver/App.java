package com.free.wordbookserver;

import com.free.wordbookserver.myutil.BasicUtil;
import com.free.wordbookserver.myutil.Utility;

public class App {
    public static void main(String[] args) {
        Utility.sendSms(BasicUtil.genVerifyCode(6,"0"),"13896650767",Utility.SIGNUP);
    }
}
