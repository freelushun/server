package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.VerifyCode;
import com.free.wordbookserver.domain.VerifyCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerifyCodeMapper {
    long countByExample(VerifyCodeExample example);

    int deleteByExample(VerifyCodeExample example);

    int deleteByPrimaryKey(String phone);

    int insert(VerifyCode record);

    int insertSelective(VerifyCode record);

    List<VerifyCode> selectByExample(VerifyCodeExample example);

    VerifyCode selectByPrimaryKey(String phone);

    int updateByExampleSelective(@Param("record") VerifyCode record, @Param("example") VerifyCodeExample example);

    int updateByExample(@Param("record") VerifyCode record, @Param("example") VerifyCodeExample example);

    int updateByPrimaryKeySelective(VerifyCode record);

    int updateByPrimaryKey(VerifyCode record);
}