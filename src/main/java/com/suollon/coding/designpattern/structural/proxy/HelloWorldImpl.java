package com.suollon.coding.designpattern.structural.proxy;

/**
 * @author hzwwl
 * @date 2019/7/22 10:37
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
