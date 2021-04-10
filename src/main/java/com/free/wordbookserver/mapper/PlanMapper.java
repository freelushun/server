package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.Plan;
import com.free.wordbookserver.domain.PlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanMapper {
    long countByExample(PlanExample example);

    int deleteByExample(PlanExample example);

    int insert(Plan record);

    int insertSelective(Plan record);

    List<Plan> selectByExample(PlanExample example);

    int updateByExampleSelective(@Param("record") Plan record, @Param("example") PlanExample example);

    int updateByExample(@Param("record") Plan record, @Param("example") PlanExample example);
}