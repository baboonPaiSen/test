package com.gsk.mybatis.mapper;


import com.gsk.mybatis.pojo.School;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolMapper {
    int deleteByPrimaryKey(Long id);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}