package com.free.wordbookserver.domain;

public class PersonPlanword {
    private Integer id;

    private String word;

    private String soundmark;

    private String href;

    private String means;

    private String classid;

    private String statu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", word=").append(word);
        sb.append(", soundmark=").append(soundmark);
        sb.append(", href=").append(href);
        sb.append(", means=").append(means);
        sb.append(", classid=").append(classid);
        sb.append(", statu=").append(statu);
        sb.append("]");
        return sb.toString();
    }
}