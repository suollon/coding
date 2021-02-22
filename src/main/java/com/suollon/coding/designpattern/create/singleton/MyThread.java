package com.suollon.coding.designpattern.create.singleton;

/**
 * @author hzwwl
 * @date 2019/7/9 12:43
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + System.identityHashCode(Hungry.getInstance()));
    }
}
