package com.suollon.coding.java8.chap5;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author hzwwl
 * @date 2019/7/16 9:41
 */
public class Test3 {
    public static void main(String[] args) {
        //5.6 数值流
        Optional<Integer> reduceSum = Dish.menu.stream().map(Dish::getCalories).reduce(Integer::sum);
        int sum = Dish.menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("reduceSum = " + reduceSum.get() + "  sum = " + sum);

        OptionalInt max = Dish.menu.stream().mapToInt(Dish::getCalories).max();
        OptionalDouble average = Dish.menu.stream().mapToInt(Dish::getCalories).average();
        System.out.println(max.getAsInt() + "  " + average.getAsDouble());

        long count1 = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).count();
        long count2 = IntStream.range(1, 100).filter(n -> n % 2 == 0).count();
        System.out.println(count1 + "   " + count2);
        //求直角边在1到100之间的所有符合勾股定理的整数对，
        Stream<int[]> pairs = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(1, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );
        pairs.forEach(p -> System.out.println(p[0] + ", " + p[1] + ", " + p[2]));

        //5.7 构建流
        Stream.of("Java 8 ", "Lambda ", "In ", "Action").map(String::toUpperCase).forEach(System.out::println);
        Stream<Object> empty = Stream.empty();
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum1 = Arrays.stream(numbers).sum();
        System.out.println(sum1);
        //由函数生成流：创建无限流
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[0] + a[1], a[0] + a[1] + a[1]}).limit(10).forEach(a -> System.out.println(a[0] + ", " + a[1]));
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        IntStream.generate(() -> 1).limit(10).forEach(System.out::println);

    }
}
