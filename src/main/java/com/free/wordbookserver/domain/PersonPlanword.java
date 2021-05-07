package com.free.wordbookserver.domain;

public class PersonPlanword {
    private String word;

    private String soundmark;

    private String href;

    private String means;

    private String status;

    private String phone;

    private Integer classid;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSoundmark() {
        return soundmark;
    }

    public void setSoundmark(String soundmark) {
        this.soundmark = soundmark;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getMeans() {
        return means;
    }

    public void setMeans(String means) {
        this.means = means;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", word=").append(word);
        sb.append(", soundmark=").append(soundmark);
        sb.append(", href=").append(href);
        sb.append(", means=").append(means);
        sb.append(", status=").append(status);
        sb.append(", phone=").append(phone);
        sb.append(", classid=").append(classid);
        sb.append("]");
        return sb.toString();
    }
}