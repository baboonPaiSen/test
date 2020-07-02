package com.gsk.mybatis.mapper;


import com.gsk.mybatis.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> findAll();

}
