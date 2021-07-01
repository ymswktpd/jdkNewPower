package com.xj.bs;
class A {
    private static B b = new B();
    //构造代码块
    {
        System.out.println("父类A构造代码块");
    }
    //构造方法
    A(){
        System.out.println("父类A构造方法");
    }

    //静态代码块
    static {
        System.out.println("父类A静态代码块");
    }
}

class B extends A{
    //构造方法
    B(){
        System.out.println("子类B构造方法");
    }
    //构造代码块
    {
        System.out.println("子类B构造代码块");
    }
    //静态代码块
    static {
        System.out.println("子类B静态代码块");
    }
}

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/23 19:58
 * @Description:
 */
public class BsDemo {
    public static void main(String[] args) {
        B b = new B();
    }

}
