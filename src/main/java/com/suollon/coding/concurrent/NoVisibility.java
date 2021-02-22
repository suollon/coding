package com.suollon.coding.concurrent;

/**
 * @author hzwwl
 * @date 2019/6/11 17:40
 */
public class NoVisibility {

    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            System.out.println("while");
            System.out.println(ready + "===" +!ready);
            while (!ready) {
                Thread.yield();
                System.out.println("number");
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ready);
        number = 42;
        new ReaderThread().start();
        ready = true;
    }
}
