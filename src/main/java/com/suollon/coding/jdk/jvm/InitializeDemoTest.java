package com.suollon.coding.jdk.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzwwl
 * @date 2019/8/16 10:19
 */
public class InitializeDemoTest {
    static {
        System.out.println("我自己先初始化一下，别急！");
    }

    public static void main(String[] args) throws InterruptedException {
        Integer i = 87789;
        System.out.println(i + "---" + Integer.MAX_VALUE + "---" + i.getClass());

        System.out.println(InitializeDemo.k);
        test(new ArrayList<>());

        System.out.println("================");

        synchronized (i) {
            i.wait();
        }

        /*i.wait();
        new Object().wait();*/
        //String.print();
        //Thread th = new Thread();
        //th.wait();
    }

    public static void test(List<String> list){
        System.out.println("test!!");
    }
}
