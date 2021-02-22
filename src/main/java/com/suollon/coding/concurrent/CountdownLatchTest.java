package com.suollon.coding.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hzwwl
 * @date 2019/8/21 16:54
 */
public class CountdownLatchTest {

    private final static int THREAD_NUM = 10;
    public static void main(String[] args) {
        CountDownLatch lock = new CountDownLatch(THREAD_NUM);
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 12; i++) {
            exec.submit(new CountdownLatchTask(lock, "Thread-"+i));
        }
        exec.shutdown();
    }

    static class CountdownLatchTask implements Runnable{
        private final CountDownLatch lock;
        private final String threadName;
        CountdownLatchTask(CountDownLatch lock, String threadName) {
            this.lock = lock;
            this.threadName = threadName;
        }
        @Override public void run() {
            //循环多次是为了证明，CountdownLatch只会阻挡一次
            for (int i = 0; i < 1; i++) {
                System.out.println(threadName + " 准备完成");
                lock.countDown();
                try {
                    lock.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadName + " ---执行完成");
            }

        }
    }

}
