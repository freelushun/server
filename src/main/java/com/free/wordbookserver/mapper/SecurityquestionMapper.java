package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.Securityquestion;
import com.free.wordbookserver.domain.SecurityquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityquestionMapper {
    long countByExample(SecurityquestionExample example);

    int deleteByExample(SecurityquestionExample example);

    int insert(Securityquestion record);

    int insertSelective(Securityquestion record);

    List<Securityquestion> selectByExample(SecurityquestionExample example);

    int updateByExampleSelective(@Param("record") Securityquestion record, @Param("example") SecurityquestionExample example);

    int updateByExample(@Param("record") Securityquestion record, @Param("example") SecurityquestionExample example);
}