package com.suollon.coding.java8.chap11;

import java.util.concurrent.*;
import java.util.stream.LongStream;

/**
 * @author hzwwl
 * @date 2019/7/18 15:40
 */
public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newCachedThreadPool();
        //callable接口是函数式接口，可以用lambda表达式代替；
        Future<Long> future = executor.submit(() -> sum());
        System.out.println(Thread.currentThread().getName() + " do soneting else !");
        try {
            Long sum = future.get(100, TimeUnit.MILLISECONDS);
            //Long sum = future.get();
            System.out.println(sum);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {

        }
    }

    private static long sum() throws InterruptedException {
        long sum = LongStream.range(0, 1_000_000).sum();
        System.out.println(Thread.currentThread().getName() + " sum()");
        //Thread.sleep(100);
        return sum;
    }
}
