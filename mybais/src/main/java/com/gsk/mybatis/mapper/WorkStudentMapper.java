package com.gsk.mybatis.mapper;


import com.gsk.mybatis.Vo.WorkJoinWorkStudent;
import com.gsk.mybatis.pojo.WorkStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkStudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkStudent record);

    int insertSelective(WorkStudent record);

    WorkStudent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkStudent record);

    int updateByPrimaryKey(WorkStudent record);

    List<WorkJoinWorkStudent> selectunsubmittedList(@Param("userId") long userId);
}