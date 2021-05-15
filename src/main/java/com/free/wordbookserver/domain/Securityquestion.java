package com.free.wordbookserver.domain;

public class Securityquestion {
    private String phone;

    private String questionone;

    private String answerone;

    private String quesiontwo;

    private String answertwo;

    private String quesionthree;

    private String answerthree;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuestionone() {
        return questionone;
    }

    public void setQuestionone(String questionone) {
        this.questionone = questionone;
    }

    public String getAnswerone() {
        return answerone;
    }

    public void setAnswerone(String answerone) {
        this.answerone = answerone;
    }

    public String getQuesiontwo() {
        return quesiontwo;
    }

    public void setQuesiontwo(String quesiontwo) {
        this.quesiontwo = quesiontwo;
    }

    public String getAnswertwo() {
        return answertwo;
    }

    public void setAnswertwo(String answertwo) {
        this.answertwo = answertwo;
    }

    public String getQuesionthree() {
        return quesionthree;
    }

    public void setQuesionthree(String quesionthree) {
        this.quesionthree = quesionthree;
    }

    public String getAnswerthree() {
        return answerthree;
    }

    public void setAnswerthree(String answerthree) {
        this.answerthree = answerthree;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", questionone=").append(questionone);
        sb.append(", answerone=").append(answerone);
        sb.append(", quesiontwo=").append(quesiontwo);
        sb.append(", answertwo=").append(answertwo);
        sb.append(", quesionthree=").append(quesionthree);
        sb.append(", answerthree=").append(answerthree);
        sb.append("]");
        return sb.toString();
    }
}