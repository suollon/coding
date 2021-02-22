package com.suollon.coding.concurrent;

/**
 * @author hzwwl
 * @date 2019/6/19 15:18
 */
public class Synchronized {
    public static void main(String[] args) {
        synchronized (Synchronized.class) {}
        m();
    }
    public static synchronized void m() {}
}
