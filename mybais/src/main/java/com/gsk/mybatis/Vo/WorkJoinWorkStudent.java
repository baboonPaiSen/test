package com.gsk.mybatis.Vo;


import lombok.Data;
import com.gsk.mybatis.pojo.Work;
import com.gsk.mybatis.pojo.WorkStudent;

/**
 * @description: TODO
 * @date: 2020/5/15 19:57
 * @author: ShangKun
 * @version: 2.0.0
 */
@Data
public class WorkJoinWorkStudent extends Work {

    private WorkStudent workStudent;
}
