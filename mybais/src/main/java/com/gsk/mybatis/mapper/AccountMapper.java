package com.gsk.mybatis.mapper;


import com.gsk.mybatis.pojo.Account;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface AccountMapper extends Mapper<Account> {
    //
    List<Account> findAll();

    List<Account> findAccountByUid(Integer uid);
}
