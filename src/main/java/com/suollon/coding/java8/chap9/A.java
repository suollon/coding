package com.suollon.coding.java8.chap9;

/**
 * @author hzwwl
 * @date 2019/7/18 11:32
 */
public interface A {
    int test();

    default void hello() {
        System.out.println("Hello from A !");
    }
}
