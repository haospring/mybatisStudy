package com.haospring.utils;

import java.util.UUID;

/**
 * @author 14727
 * 获取一个随机的id
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args) {
        System.out.println(IDUtils.getId());
    }
}
