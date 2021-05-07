package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.StudyTime;
import com.free.wordbookserver.domain.StudyTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyTimeMapper {
    long countByExample(StudyTimeExample example);

    int deleteByExample(StudyTimeExample example);

    int deleteByPrimaryKey(String phone);

    int insert(StudyTime record);

    int insertSelective(StudyTime record);

    List<StudyTime> selectByExample(StudyTimeExample example);

    StudyTime selectByPrimaryKey(String phone);

    int updateByExampleSelective(@Param("record") StudyTime record, @Param("example") StudyTimeExample example);

    int updateByExample(@Param("record") StudyTime record, @Param("example") StudyTimeExample example);

    int updateByPrimaryKeySelective(StudyTime record);

    int updateByPrimaryKey(StudyTime record);
}