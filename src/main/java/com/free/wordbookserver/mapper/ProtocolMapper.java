package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.Protocol;
import com.free.wordbookserver.domain.ProtocolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolMapper {
    long countByExample(ProtocolExample example);

    int deleteByExample(ProtocolExample example);

    int deleteByPrimaryKey(Integer protocolId);

    int insert(Protocol record);

    int insertSelective(Protocol record);

    List<Protocol> selectByExampleWithBLOBs(ProtocolExample example);

    List<Protocol> selectByExample(ProtocolExample example);

    Protocol selectByPrimaryKey(Integer protocolId);

    int updateByExampleSelective(@Param("record") Protocol record, @Param("example") ProtocolExample example);

    int updateByExampleWithBLOBs(@Param("record") Protocol record, @Param("example") ProtocolExample example);

    int updateByExample(@Param("record") Protocol record, @Param("example") ProtocolExample example);

    int updateByPrimaryKeySelective(Protocol record);

    int updateByPrimaryKeyWithBLOBs(Protocol record);

    int updateByPrimaryKey(Protocol record);
}