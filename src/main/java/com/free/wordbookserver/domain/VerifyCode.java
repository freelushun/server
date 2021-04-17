package com.free.wordbookserver.domain;

/**
 * 验证码表
 */
public class VerifyCode {
    private String phone;

    private String code;

    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VerifyCode(String phone, String code, String type) {
        this.phone = phone;
        this.code = code;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", code=").append(code);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}