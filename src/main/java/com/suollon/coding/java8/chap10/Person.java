package com.suollon.coding.java8.chap10;

import java.util.Optional;

/**
 * @author hzwwl
 * @date 2019/7/18 14:15
 */
public class Person {
    private Optional<Car> car = Optional.empty();

    public Optional<Car> getCar() {
        return car;
    }
}
