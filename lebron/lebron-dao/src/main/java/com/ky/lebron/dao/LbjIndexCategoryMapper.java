package com.ky.lebron.dao;

import com.ky.lebron.domain.LbjIndexCategory;
import com.ky.lebron.domain.LbjIndexCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LbjIndexCategoryMapper {
    int countByExample(LbjIndexCategoryExample example);

    int deleteByExample(LbjIndexCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LbjIndexCategory record);

    int insertSelective(LbjIndexCategory record);

    List<LbjIndexCategory> selectByExample(LbjIndexCategoryExample example);

    LbjIndexCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LbjIndexCategory record, @Param("example") LbjIndexCategoryExample example);

    int updateByExample(@Param("record") LbjIndexCategory record, @Param("example") LbjIndexCategoryExample example);

    int updateByPrimaryKeySelective(LbjIndexCategory record);

    int updateByPrimaryKey(LbjIndexCategory record);
}