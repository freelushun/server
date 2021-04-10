package com.free.wordbookserver.mapper;

import com.free.wordbookserver.domain.Catalogue;
import com.free.wordbookserver.domain.CatalogueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatalogueMapper {
    long countByExample(CatalogueExample example);

    int deleteByExample(CatalogueExample example);

    int insert(Catalogue record);

    int insertSelective(Catalogue record);

    List<Catalogue> selectByExample(CatalogueExample example);

    int updateByExampleSelective(@Param("record") Catalogue record, @Param("example") CatalogueExample example);

    int updateByExample(@Param("record") Catalogue record, @Param("example") CatalogueExample example);
}