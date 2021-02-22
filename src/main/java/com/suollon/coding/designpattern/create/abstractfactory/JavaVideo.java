package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/8 17:50
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制JAVA课程");
    }
}
