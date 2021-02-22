package com.suollon.coding.java8.chap10;

import java.util.Optional;

/**
 * @author hzwwl
 * @date 2019/7/18 14:14
 */
public class Car {
    private Optional<Insurance> insurance = Optional.empty();

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
