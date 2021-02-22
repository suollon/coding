package com.suollon.coding.spring.aop;

import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author hzwwl
 * @date 2019/7/30 9:36
 */
@Component
public class Test {

    public static void main(String[] args) {
        boolean b1 = Proxy.class.isAssignableFrom(Person.class);
        boolean b2 = Proxy.class.isAssignableFrom(PersonImpl.class);
        boolean b3 = Proxy.class.isAssignableFrom(Test.class);
        boolean b4 = Proxy.class.isAssignableFrom(Object.class);
        boolean b5 = Proxy.class.isAssignableFrom(String.class);

        System.out.println(b1 + "===" + b2 + "==="  + b3 + "==="  + b4 + "==="  + b5);
        boolean b6 = Proxy.class.isAssignableFrom(Proxy.class);
        System.out.println(b6);
    }

    public void test() {
        System.out.println("调用Test.test()");
    }

}
