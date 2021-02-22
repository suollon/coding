package com.suollon.coding.java8.chap9;

/**
 * @author hzwwl
 * @date 2019/7/18 11:35
 */
public class C implements A, B {

    @Override
    public int test() {
        return 0;
    }

    /**
     * 如果实现的接口中，有同名的默认方法，子类必须覆盖重写；
     * 如果不同名，则不需要重写；
     */
    @Override
    public void hello() {
        //java8的新语法
        A.super.hello();
    }
}
