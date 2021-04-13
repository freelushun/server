package com.free.wordbookserver.dto;

import com.free.wordbookserver.domain.Finishword;
import com.free.wordbookserver.domain.Plan;
import com.free.wordbookserver.domain.PlanFinish;

import java.util.List;

/**
 * 计划表
 * 个人计划完成情况
 */
public class PlanDto {
    Plan plan;
    List<PlanFinish> planFinishes;
    List<Finishword> finishwords;

    public List<Finishword> getFinishwords() {
        return finishwords;
    }

    public void setFinishwords(List<Finishword> finishwords) {
        this.finishwords = finishwords;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<PlanFinish> getPlanFinishes() {
        return planFinishes;
    }

    public void setPlanFinishes(List<PlanFinish> planFinishes) {
        this.planFinishes = planFinishes;
    }
}
