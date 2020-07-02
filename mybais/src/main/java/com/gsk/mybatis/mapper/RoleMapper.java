package com.gsk.mybatis.mapper;


import com.gsk.mybatis.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {



    List<Role>  findAll();
}
