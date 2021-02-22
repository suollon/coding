package com.suollon.coding.java8.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hzwwl
 * @date 2019/7/10 15:19
 */
public class SerialAndConcurrent {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random()*100000));
        }
        System.out.println("list size = " + list.size());

        long startFor = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            if (list.get(i) > 50000){
                result1.add(list.get(i));
            }
        }
        System.out.println("for循环          耗时 = " + (System.currentTimeMillis() - startFor) + "  size = "+ result1.size());

        long startStream = System.currentTimeMillis();
        result2 = list.stream().filter(i -> i > 50000).collect(Collectors.toList());
        System.out.println("stream()         耗时 = " + (System.currentTimeMillis() - startStream)+ "  size = "+ result2.size());

        long startParallelStream = System.currentTimeMillis();
        result3 = list.parallelStream().filter(i -> i > 50000).collect(Collectors.toList());
        System.out.println("parallelStream() 耗时 = " + (System.currentTimeMillis() - startParallelStream)+ "  size = "+ result3.size());
    }

}

/**
 * java8
 */
interface te {

    void test();

    default String my() {
        return "rrrr";
    }
}