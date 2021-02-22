package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/8 17:50
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制PYTHON课程");
    }
}
