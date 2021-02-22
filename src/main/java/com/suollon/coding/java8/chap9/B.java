package com.suollon.coding.java8.chap9;

/**
 * @author hzwwl
 * @date 2019/7/18 11:33
 */
public interface B {
    int test();

    default void hello() {
        System.out.println("Hello from B !");
    }
}
