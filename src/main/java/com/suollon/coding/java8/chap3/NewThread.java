package com.suollon.coding.java8.chap3;

import java.util.function.Function;

/**
 * @author hzwwl
 * @date 2019/7/10 17:59
 */
public class NewThread {
    private static int f = 3;
    private static final int sf = 5;

    public static void main(String[] args) {
        int pf = 3;
        final int ff = 5;

        //如果局部被赋值多次，则不能被Lambda表达式引用，如果只被赋值一次（事实上是final的），或是final变量，则lambda可以引用。
        //pf = 7;

        new Thread(() -> System.out.println(f)).start();
        new Thread(() -> System.out.println(sf)).start();
        new Thread(() -> System.out.println(pf)).start();
        new Thread(() -> System.out.println(ff)).start();

        new Thread(() -> System.out.println(f)).start();
        new Thread(() -> System.out.println(sf)).start();
        new Thread(() -> System.out.println(pf)).start();
        new Thread(() -> System.out.println(ff)).start();

        //lambda可以作为函数式接口的实现。
        Thread th = new Thread(() -> System.out.println("it is a new thread"));
        Runnable r1 = () -> System.out.println("it is a new runnable");

        Function<String, Integer> stringToInt = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInte = Integer::parseInt;
        Integer a = stringToInte.apply("12");
        System.out.println(a);
    }
}
