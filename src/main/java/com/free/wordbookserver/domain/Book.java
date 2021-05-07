package com.free.wordbookserver.domain;

public class Book {
    private String id;

    private String entitle;

    private String cntitle;

    private String enauthorname;

    private String cnauthorname;

    private String intro;

    private String content;

    private String picsrc;

    private byte[] picdata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntitle() {
        return entitle;
    }

    public void setEntitle(String entitle) {
        this.entitle = entitle;
    }

    public String getCntitle() {
        return cntitle;
    }

    public void setCntitle(String cntitle) {
        this.cntitle = cntitle;
    }

    public String getEnauthorname() {
        return enauthorname;
    }

    public void setEnauthorname(String enauthorname) {
        this.enauthorname = enauthorname;
    }

    public String getCnauthorname() {
        return cnauthorname;
    }

    public void setCnauthorname(String cnauthorname) {
        this.cnauthorname = cnauthorname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicsrc() {
        return picsrc;
    }

    public void setPicsrc(String picsrc) {
        this.picsrc = picsrc;
    }

    public byte[] getPicdata() {
        return picdata;
    }

    public void setPicdata(byte[] picdata) {
        this.picdata = picdata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", entitle=").append(entitle);
        sb.append(", cntitle=").append(cntitle);
        sb.append(", enauthorname=").append(enauthorname);
        sb.append(", cnauthorname=").append(cnauthorname);
        sb.append(", intro=").append(intro);
        sb.append(", content=").append(content);
        sb.append(", picsrc=").append(picsrc);
        sb.append(", picdata=").append(picdata);
        sb.append("]");
        return sb.toString();
    }
}