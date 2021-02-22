package com.suollon.coding.java8.chap8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author hzwwl
 * @date 2019/7/17 16:55
 */
public class Test {
    public static void main(String[] args) {
        //原来的方式，需要继承使子类表现不同的行为；
        OnlineBanking banking1 = new OnlineBankingA();
        banking1.processUser(3);
        OnlineBanking banking2 = new OnlineBankingB();
        banking2.processUser(3);

        //Lambda方式，传入一个lambda表达式，实现不同的行为；更为灵活；
        new OnlineBankingLambda().processUser(3, user -> System.out.println("Hello" + user.getName()));
        new OnlineBankingLambda().processUser(3, user -> System.out.println("Getaway" + user.getName()));

        //四个主要函数式接口, 主要区别是返回值不同
        User kikixi = new User(5, "kai");
        //Consumer，不返回；
        Consumer<User> consumer1 = user -> System.out.println(user.getName());
        Consumer<User> consumer2 = user -> System.out.println("===");
        consumer1.accept(kikixi);
        //Predicate，返回一个boolean值；
        Predicate<User> predicate = user -> user.getId() > 10;
        System.out.println("Predicate----->" + predicate.test(kikixi));
        //Supplier，供应商。不接受参数，返回一个指定的类型；
        Supplier<User> supplier = () -> new User(5, "kai");
        //Function，接受一个A类型的参数，返回一个B类型的对象；
        Function<User, Object> function = user -> new Object();

    }

}
