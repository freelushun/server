package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.T11;
import com.free.wordbookserver.domain.T11Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T11Mapper {
    long countByExample(T11Example example);

    int deleteByExample(T11Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(T11 record);

    int insertSelective(T11 record);

    List<T11> selectByExample(T11Example example);

    T11 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T11 record, @Param("example") T11Example example);

    int updateByExample(@Param("record") T11 record, @Param("example") T11Example example);

    int updateByPrimaryKeySelective(T11 record);

    int updateByPrimaryKey(T11 record);
}