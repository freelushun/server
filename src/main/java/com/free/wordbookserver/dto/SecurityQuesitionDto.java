package com.free.wordbookserver.dto;


import com.free.wordbookserver.domain.Securityquestion;


/**
 * 密保DTO
 */
public class SecurityQuesitionDto {
    Securityquestion securityquestion;
    boolean flag;

    public Securityquestion getSecurityquestion() {
        return securityquestion;
    }

    public void setSecurityquestion(Securityquestion securityquestion) {
        this.securityquestion = securityquestion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "SecurityQuesitionDto{" +
                "securityquestion=" + securityquestion +
                ", flag=" + flag +
                '}';
    }
}
