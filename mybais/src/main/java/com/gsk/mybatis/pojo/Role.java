package com.gsk.mybatis.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Role implements Serializable {

    private  Integer roleId;
    private  String roleName;
    private  String  roleDesc;
    private List<User> users;
}
