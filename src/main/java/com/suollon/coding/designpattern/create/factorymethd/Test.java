package com.suollon.coding.designpattern.create.factorymethd;

/**
 * 工厂模式测试类
 * 如需拓展新的课程，只需要新加Video的子类实体类，和VideoFactory的子类实现。
 * @author hzwwl
 * @date 2019/7/8 17:56
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        factory.getInstance().produce();
    }
}
