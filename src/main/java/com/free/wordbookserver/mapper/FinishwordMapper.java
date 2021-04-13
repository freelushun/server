package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.Finishword;
import com.free.wordbookserver.domain.FinishwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinishwordMapper {
    long countByExample(FinishwordExample example);

    int deleteByExample(FinishwordExample example);

    int insert(Finishword record);

    int insertSelective(Finishword record);

    List<Finishword> selectByExample(FinishwordExample example);

    int updateByExampleSelective(@Param("record") Finishword record, @Param("example") FinishwordExample example);

    int updateByExample(@Param("record") Finishword record, @Param("example") FinishwordExample example);
}