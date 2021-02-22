package com.suollon.coding.java8.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * @author hzwwl
 * @date 2019/7/15 17:28
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        //去重
        numbers.stream().distinct().forEach(System.out::println);
        //跳过前几个元素
        List<Integer> skipList = numbers.stream().skip(2).collect(toList());
        System.out.println(skipList);
        //映射
        List<Integer> integers = Dish.menu.stream().map(Dish::getName).map(String::length).collect(toList());
        System.out.println(integers);
        //流的扁平化——取出一组单词中，不重复的字母集合
        //flatMap可以理解为for循环嵌套
        List<String> letters = Dish.menu.stream().map(Dish::getName).map(n -> n.split("")).flatMap(Arrays::stream).distinct().collect(toList());
        System.out.println(letters);

        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(7, 8);
        List<int[]> pairs = num1.stream().flatMap(i -> num2.stream().map(j -> new int[]{i, j})).collect(toList());
        pairs.stream().forEach(p -> {System.out.println("{" + p[0] + ", " + p[1] + "}"); });

        Dish.menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(d -> System.out.println(d.getName()));
        //归约
        Integer sum1 = numbers.stream().reduce(0, Integer::sum);
        Optional<Integer> op = numbers.stream().reduce(Integer::sum);
        Integer sum2 = op.get();
        System.out.println("sum1 = " + sum1 + ",  sum2 = " + sum2);
        //numbers = new ArrayList<>();
        int max = numbers.stream().reduce(Integer::max).get();
        int min = numbers.stream().reduce(Integer::min).get();
        System.out.println("max = " + max + "  min = " + min);

    }
}
