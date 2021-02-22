package com.suollon.coding.java8.chap4;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author hzwwl
 * @date 2019/7/15 16:23
 */
public class Test {
    public static void main(String[] args) {
        List<Dish> list = Dish.menu;
        List<String> strings1 = list.stream().filter(d -> d.getCalories() < 400).sorted(comparing(Dish::getCalories)).map(Dish::getName).collect(toList());
        System.out.println(strings1);
        List<String> strings2 = list.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).limit(3).collect(toList());
        System.out.println(strings2);

    }
}
