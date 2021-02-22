package com.suollon.coding.designpattern.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author hzwwl
 * @date 2019/7/24 16:20
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(User.class);
        enhancer.setCallback(new PrintInfoMethodIntecepter());
        User user = (User) enhancer.create();
        System.out.println("user----->" + user);
        System.out.println(user.getAddress("kikixi"));
        System.out.println("address------------------------------------");
        user.setName("kikixi");
        System.out.println("setname------------------------------------");
        System.out.println(user.getName());
    }

}
