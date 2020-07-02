package com.gsk.mybatis.mapper;


import com.gsk.mybatis.pojo.Work;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);
}