package com.suollon.coding.java8.chap3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author hzwwl
 * @date 2019/7/15 15:23
 */
public class Test {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("red", 150));
        list.add(new Apple("red", 148));
        list.add(new Apple("green", 148));
        list.add(new Apple("green", 170));
        list.add(new Apple("green", 130));

        //先按重量排序，重量相同，再按颜色排序
        list.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(list);

        list.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(list);

        Function<Integer, Integer> f = x -> x + 3;
        Function<Integer, Integer> g = x -> x * 2;
        //复合两个现有函数；
        Function<Integer, Integer> fg = f.andThen(g);     //先计算f，再计算g
        Function<Integer, Integer> gf = f.compose(g);     //先计算g，再计算f
        Function<Integer, Integer> ff = x -> (x + 3) * 2;

        System.out.println(fg.apply(4));
        System.out.println(gf.apply(4));
        System.out.println(ff.apply(4));


    }
}
