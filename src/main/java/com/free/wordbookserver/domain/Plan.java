package com.free.wordbookserver.domain;


/**
 * 个人的计划表
 */
public class Plan {

    private String phone;

    private String classId;

    private String wordTotal;

    private String startDay;

    private String days;

    private String average;

    private String finished;

    private String usedday;

    private String tableTitle;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getWordTotal() {
        return wordTotal;
    }

    public void setWordTotal(String wordTotal) {
        this.wordTotal = wordTotal;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    public String getUsedday() {
        return usedday;
    }

    public void setUsedday(String usedday) {
        this.usedday = usedday;
    }

    public String getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", classId=").append(classId);
        sb.append(", wordTotal=").append(wordTotal);
        sb.append(", startDay=").append(startDay);
        sb.append(", days=").append(days);
        sb.append(", average=").append(average);
        sb.append(", finished=").append(finished);
        sb.append(", usedday=").append(usedday);
        sb.append(", tableTitle=").append(tableTitle);
        sb.append("]");
        return sb.toString();
    }
}