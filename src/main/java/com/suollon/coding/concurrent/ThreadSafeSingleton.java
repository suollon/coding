package com.suollon.coding.concurrent;

/**
 * 双重检查机制 + volatile
 * @author hzwwl
 * @date 2019/6/17 9:19
 */
public class ThreadSafeSingleton {

    private volatile static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
