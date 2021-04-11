package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.PlanWord;
import com.free.wordbookserver.domain.PlanWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanWordMapper {
    long countByExample(PlanWordExample example);

    int deleteByExample(PlanWordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlanWord record);

    int insertSelective(PlanWord record);

    List<PlanWord> selectByExample(PlanWordExample example);

    PlanWord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlanWord record, @Param("example") PlanWordExample example);

    int updateByExample(@Param("record") PlanWord record, @Param("example") PlanWordExample example);

    int updateByPrimaryKeySelective(PlanWord record);

    int updateByPrimaryKey(PlanWord record);
}