package com.gsk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description: TODO
 * @date: 2020/6/24 10:37
 * @author: ShangKun
 * @version: 2.0.0
 */
public class ForEach {

    public static void main(String[] args) {
        List<String> list = Collections.EMPTY_LIST;
        list = Arrays.asList("awg","weg","wweg","wegwe");
        list.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++");
        list.forEach(str -> {
            if("awg".equals(str)){
                return;
            }
            System.out.println(str);
        });
    }


}
