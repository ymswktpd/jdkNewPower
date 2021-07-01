package com.xj.bs;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/7/1 23:32
 * @Description:
 */
public class LamdaDemo {
    /**
     * lamda表达式
     * @param args
     */
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(2);
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        }).start();
    }
}
