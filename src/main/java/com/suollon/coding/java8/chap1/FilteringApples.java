package com.suollon.coding.java8.chap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * @author hzwwl
 * @date 2019/7/10 11:42
 */
public class FilteringApples {

    static List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(165, "green"), new Apple(120, "red"));

    public static void main(String[] args) {
        List<Apple> result = inventory.stream().filter(a -> a.getColor().equals("green")).collect(Collectors.toList());
        System.out.println(result);
        List<Apple> result2 = inventory.stream().filter(a -> a.getWeight() > 100).collect(Collectors.toList());
        System.out.println(result2);

        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);
    }

    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
