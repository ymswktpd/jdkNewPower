package com.xj.bs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/24 10:44
 * @Description:
 */
public class SzDemo {

//    public static void main(String[] args) throws MalformedURLException {
////        System.out.println(AccountType.FIXED);
////        URL u =new URL("http://www.123sfsfgsdfgsdfgsfgs.com");
////        System.out.println(u.getPath());
//        char chr = 127;
//        int sum = 200;
//        chr += 1;
//        sum += chr;
//        System.out.println(sum);
//    }

    //    public static void main(String[] args){
//        Integer var1=new Integer(1);
//        Integer var2=var1;
//        doSomething(var2);
//        System.out.print(var1.intValue());
//        System.out.print(var1==var2);
//    }
//    public static void doSomething(Integer integer){
//        integer=new Integer(2);
//    }
//    public static void main(String[] args) {
//    StringBuffer a = new StringBuffer("A");
//    StringBuffer b = new StringBuffer("B");
//    operator(a, b);
//    System.out.println(a + "," + b);
//}
//    public static void operator(StringBuffer x, StringBuffer y) {
//        x.append(y); y = x;
//    }


//    }

//    enum AccountType {
//        SAVING, FIXED, CURRENT;
//
//        private AccountType() {
//            System.out.println("It is a account type");
//        }
//    }

//    public static void main(String [] args){
//        float f=42.0f;
//        float f1[]=new float[2];
//        float f2[]=new float[2];
//        float[] f3=f1;
//        long x=42;
//        f1[0]=42.0f;
//        System.out.println(x == f1[0]);
////        Scanner sc = new Scanner(System.in);
////        int p1 = sc.nextInt();
////        System.out.println(p1);
//
//        Stack stack = new Stack();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//        System.out.println(stack.peek());
//        System.out.println(stack.push(1111));
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//    }

    public static void main(String args[]) {
        String s = "tommy";
        Object o = s;
        sayHello(o); //语句1
        sayHello(s); //语句2
    }
    public static void sayHello(String to) {
        System.out.println(String.format("Hello, %s", to));
    }
    public static void sayHello(Object to) {
        System.out.println(String.format("Welcome, %s", to));
    }
}
