package com.suollon.coding.java8.chap7;

/**
 * @author hzwwl
 * @date 2019/7/17 10:40
 */
public class Test {
    public static void main(String[] args) {
        //获取当前运行环境处理器数量
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);
        //修改ForkJoinPool线程池大小，通常不建议修改；
        //System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "7");
    }

}
