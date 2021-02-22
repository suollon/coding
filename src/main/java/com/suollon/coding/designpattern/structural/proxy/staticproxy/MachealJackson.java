package com.suollon.coding.designpattern.structural.proxy.staticproxy;

/**
 * @author hzwwl
 * @date 2019/7/25 10:15
 */
public class MachealJackson implements SingStar {
    @Override
    public void sing() {
        System.out.println("《Dangerous》, 《Beat it》, 《We are the world》");
    }

    @Override
    public void dance() {
        System.out.println("迈克尔的太空步！");
    }
}
