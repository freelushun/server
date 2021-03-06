package com.free.wordbookserver.domain;

/**
 * 记录用户信息
 */
public class User {
    private String userPhone;

    private String userId;

    private String userName;

    private String comment;

    private String sex;

    private String password;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", comment=").append(comment);
        sb.append(", sex=").append(sex);
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }
}