package com.free.wordbookserver.domain;

public class Finishword {
    private String phone;

    private String word;

    private String finished;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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
        sb.append(", word=").append(word);
        sb.append(", finished=").append(finished);
        sb.append("]");
        return sb.toString();
    }
}