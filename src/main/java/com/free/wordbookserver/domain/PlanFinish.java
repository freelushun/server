package com.free.wordbookserver.domain;

public class PlanFinish {
    private String phone;

    private Integer classid;

    private String date;

    private String finished;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", classid=").append(classid);
        sb.append(", date=").append(date);
        sb.append(", finished=").append(finished);
        sb.append("]");
        return sb.toString();
    }
}