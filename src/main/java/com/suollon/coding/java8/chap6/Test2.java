package com.suollon.coding.java8.chap6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * @author hzwwl
 * @date 2019/7/16 17:10
 */
public class Test2 {
    public static void main(String[] args) {
        //6.4 分区
        List<Dish> vegetarians1 = Dish.menu.stream().filter(Dish::isVegetarian).collect(toList());
        Map<Boolean, List<Dish>> vegetarians2 = Dish.menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println(vegetarians1 + "======" + vegetarians2);
        Map<Boolean, Map<Dish.Type, List<Dish>>> partMap = Dish.menu.stream().collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
        System.out.println(partMap);

        Map<Boolean, List<Integer>> primeList = IntStream.range(1, 1000).boxed().collect(partitioningBy(i -> isPrime(i)));
        System.out.println(primeList);
        //传入自定义的收集器，参数一，供应源；参数二，累加器；参数三，组合器（第三个参数内部使用了Fork/Join框架）。
        ArrayList<Object> userDefined = Dish.menu.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(userDefined);
    }

    private static boolean isPrime(int n) {
        return IntStream.range(2, (int) Math.sqrt(n)).boxed().anyMatch(i -> n % i == 0);
    }
}
