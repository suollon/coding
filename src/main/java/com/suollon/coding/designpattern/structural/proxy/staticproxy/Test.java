package com.suollon.coding.designpattern.structural.proxy.staticproxy;

/**
 * @author hzwwl
 * @date 2019/7/25 10:26
 */
public class Test {

    public static void main(String[] args) {
        SingStar jayChou = new JayChou();
        jayChou.sing();
        jayChou.dance();
        System.out.println("==============================");

        SingStar jayChouProxy = new SingStarProxy(new JayChou());
        jayChouProxy.sing();
        jayChouProxy.dance();
        System.out.println("==============================");

        SingStar mj = new MachealJackson();
        mj.sing();
        mj.dance();
        System.out.println("==============================");

        SingStar mjProxy = new SingStarProxy(new MachealJackson());
        mjProxy.sing();
        mjProxy.dance();
    }

}
