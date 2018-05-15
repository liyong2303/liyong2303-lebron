package com.ky.lebron.dao;

import com.ky.lebron.domain.LbjContent;
import com.ky.lebron.domain.LbjContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LbjContentMapper {
    int countByExample(LbjContentExample example);

    int deleteByExample(LbjContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LbjContent record);

    int insertSelective(LbjContent record);

    List<LbjContent> selectByExampleWithBLOBs(LbjContentExample example);

    List<LbjContent> selectByExample(LbjContentExample example);

    LbjContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LbjContent record, @Param("example") LbjContentExample example);

    int updateByExampleWithBLOBs(@Param("record") LbjContent record, @Param("example") LbjContentExample example);

    int updateByExample(@Param("record") LbjContent record, @Param("example") LbjContentExample example);

    int updateByPrimaryKeySelective(LbjContent record);

    int updateByPrimaryKeyWithBLOBs(LbjContent record);

    int updateByPrimaryKey(LbjContent record);
}