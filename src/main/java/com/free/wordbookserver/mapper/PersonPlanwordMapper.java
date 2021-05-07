package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.PersonPlanword;
import com.free.wordbookserver.domain.PersonPlanwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonPlanwordMapper {
    long countByExample(PersonPlanwordExample example);

    int deleteByExample(PersonPlanwordExample example);

    int insert(PersonPlanword record);

    int insertSelective(PersonPlanword record);

    List<PersonPlanword> selectByExample(PersonPlanwordExample example);

    int updateByExampleSelective(@Param("record") PersonPlanword record, @Param("example") PersonPlanwordExample example);

    int updateByExample(@Param("record") PersonPlanword record, @Param("example") PersonPlanwordExample example);

    int insertList(List<PersonPlanword> list);

    int deleteAll();



}