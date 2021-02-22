package com.suollon.coding.designpattern.structural.flyweight;

/**
 * @author hzwwl
 * @date 2019/7/19 10:19
 */
public class Test {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = Integer.valueOf(100);
        Integer c = 1000;
        Integer d = Integer.valueOf(1000);
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println("==================================");

        String[] departments = {"alibaba", "taobao", "mayi", "dingding"};
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random()*departments.length)];
            Manager manager = ManagerFactory.getManager(department);
            manager.report();
        }

    }
}
