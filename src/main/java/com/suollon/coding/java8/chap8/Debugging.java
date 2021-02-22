package com.suollon.coding.java8.chap8;

import java.util.Arrays;
import java.util.List;

/**
 * @author hzwwl
 * @date 2019/7/17 19:30
 */
public class Debugging {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User(3, "kikixi"), null);
        users.stream().map(u -> u.getName()).forEach(System.out::println);
    }
}
