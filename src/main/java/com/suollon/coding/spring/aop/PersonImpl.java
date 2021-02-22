package com.suollon.coding.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author hzwwl
 * @date 2019/7/29 17:40
 */
@Component
public class PersonImpl implements Person {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + ", 你多大了呀？");
    }
}
