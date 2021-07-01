package com.xj.bs.service.lambda;
import com.xj.bs.UserService;
import com.xj.bs.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
//        new Thread(()->{
//            System.out.println(2);
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        }).start();
//        goShow(()->{
//            System.out.println(1111);
//        });

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("周杰伦",18));
        personList.add(new Person("张学友",32));

//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Collections.sort(personList,(Person o1,Person o2)->{
            return o1.getAge() - o2.getAge();
        });
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static void goShow(UserService userService){
        userService.show();
    }
}
