package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.Tword;
import com.free.wordbookserver.domain.TwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TwordMapper {
    long countByExample(TwordExample example);

    int deleteByExample(TwordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tword record);

    int insertSelective(Tword record);

    List<Tword> selectByExample(TwordExample example);

    Tword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tword record, @Param("example") TwordExample example);

    int updateByExample(@Param("record") Tword record, @Param("example") TwordExample example);

    int updateByPrimaryKeySelective(Tword record);

    int updateByPrimaryKey(Tword record);
}