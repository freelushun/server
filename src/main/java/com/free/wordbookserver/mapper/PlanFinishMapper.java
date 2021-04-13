package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.PlanFinish;
import com.free.wordbookserver.domain.PlanFinishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanFinishMapper {
    long countByExample(PlanFinishExample example);

    int deleteByExample(PlanFinishExample example);

    int insert(PlanFinish record);

    int insertSelective(PlanFinish record);

    List<PlanFinish> selectByExample(PlanFinishExample example);

    int updateByExampleSelective(@Param("record") PlanFinish record, @Param("example") PlanFinishExample example);

    int updateByExample(@Param("record") PlanFinish record, @Param("example") PlanFinishExample example);
}