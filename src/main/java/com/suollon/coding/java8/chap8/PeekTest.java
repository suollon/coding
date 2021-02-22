package com.suollon.coding.java8.chap8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author hzwwl
 * @date 2019/7/17 19:41
 */
public class PeekTest {

    /**
     * peek设计的初衷就是流的每个元素恢复运行之前，插入执行一个动作；
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<Integer> integers = numbers.stream()
                .peek(n -> System.out.println("from stream : " + n))
                .map(n -> n + 7)
                .peek(n -> System.out.println("from map : " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("from filter : " + n))
                .limit(3)
                .peek(n -> System.out.println("from limit : " + n))
                .collect(toList());
        System.out.println(integers);
    }

}
