package com.suollon.coding.java8.chap6;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * @author hzwwl
 * @date 2019/7/16 14:51
 */
public class Test1 {
    public static void main(String[] args) {
        Optional<Dish> max = Dish.menu.stream().collect(maxBy(comparingInt(Dish::getCalories)));
        System.out.println(max.get());
        Integer sum1 = Dish.menu.stream().collect(summingInt(Dish::getCalories));
        Integer sum2 = Dish.menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println(sum1 + "  " + sum2);
        Double averagingDouble = Dish.menu.stream().collect(averagingDouble(Dish::getCalories));
        Double averagingInt = Dish.menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(averagingDouble + "  " + averagingInt);
        //概括统计
        IntSummaryStatistics summary = Dish.menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(summary);
        //连接字符串
        String joining1 = Dish.menu.stream().map(Dish::getName).collect(joining());
        String joining2 = Dish.menu.stream().map(Dish::getName).collect(joining("==="));
        System.out.println(joining1);
        System.out.println(joining2);
        //普通归约
        Integer reducingSum = Dish.menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
        Optional<Dish> maxCaloriesDish = Dish.menu.stream().collect(reducing((i, j) -> i.getCalories() > j.getCalories() ? i : j));
        System.out.println(reducingSum + "  " + maxCaloriesDish.get());
        //6.3 分组
        Map<Dish.Type, List<Dish>> typeListMap = Dish.menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(typeListMap);
        Map<CaloricLevel, List<Dish>> levelListMap = Dish.menu.stream().collect(groupingBy(d -> {
            if (d.getCalories() <= 400) { return CaloricLevel.DIET; }
            else if (d.getCalories() <= 700) { return CaloricLevel.NORMAL; }
            else { return CaloricLevel.FAT; } }));
        System.out.println(levelListMap);
        Map<Dish.Type, Long> typeCount = Dish.menu.stream().collect(groupingBy(Dish::getType, counting()));
        System.out.println(typeCount);
        Map<Dish.Type, Dish> collect = Dish.menu.stream().collect(groupingBy(Dish::getType, collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(collect);
        //groupingBy两个参数时，第一个参数是分类条件，第二个参数是对分类后结果的处理函数；
        Map<Dish.Type, Integer> collect1 = Dish.menu.stream().collect(groupingBy(Dish::getType, summingInt(Dish::getCalories)));
        System.out.println(collect1);
    }

    public enum CaloricLevel {DIET, NORMAL, FAT}
}
