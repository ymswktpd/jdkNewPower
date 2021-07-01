package com.xj.bs;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/24 10:43
 * @Description:
 */
public class StringDemo {

    private static final String MESSAGE="taobao";
    public static void main(String [] args) {
        String a ="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
    }


}
