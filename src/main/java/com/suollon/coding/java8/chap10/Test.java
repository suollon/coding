package com.suollon.coding.java8.chap10;

import com.suollon.coding.java8.chap8.User;

import java.util.Optional;

/**
 * @author hzwwl
 * @date 2019/7/18 14:15
 */
public class Test {

    public static void main(String[] args) {
        User user1 = new User();
        String name1 = Optional.ofNullable(user1).map(User::getName).orElse("namei");
        String name3 = user1 != null ? user1.getName() : "namei";
        String name5 = user1 != null ? user1.getName() != null ? user1.getName() : "namei" : "namei";
        System.out.println(name1 + "  " + name3 + "  " + name5);

        User user2 = new User(1, "lufei");
        //在这种情况下，类似一个三目运算符的用法；
        String name2 = Optional.ofNullable(user2).map(User::getName).orElse("namei");
        String name4 = user2 != null ? user2.getName() : "namei";
        System.out.println(name2 + "  " + name4);

        Person person = new Person();
        String unkown = Optional.ofNullable(person)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unkown");
        System.out.println(unkown);

    }

}
