package com.free.wordbookserver.domain;

public class VerifyCode {
    private String phone;

    private String code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public VerifyCode() {
    }

    /**
     *
     * @param phone 电话
     * @param code  验证码
     */
    public VerifyCode(String phone, String code) {
        this.phone = phone;
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }
}