package com.free.wordbookserver.domain;

public class Catalogue {
    private String classId;

    private String tableName;

    private String courseNum;

    private String wordNum;

    private String type;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getWordNum() {
        return wordNum;
    }

    public void setWordNum(String wordNum) {
        this.wordNum = wordNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classId=").append(classId);
        sb.append(", tableName=").append(tableName);
        sb.append(", courseNum=").append(courseNum);
        sb.append(", wordNum=").append(wordNum);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}