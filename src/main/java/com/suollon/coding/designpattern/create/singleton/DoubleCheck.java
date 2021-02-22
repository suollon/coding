package com.suollon.coding.designpattern.create.singleton;

/**
 * instance = new DoubleCheck();可以细分为是三个步骤
 * 1，给instance分配内存空间
 * 2，初始化对象，即new DoubleCheck()
 * 3，将instance指向内容空间
 * 如果不使用volatile，2和3可能发生指令冲排序，1-3-2，导致某些方法调用到未初始化成功的单例对象。
 * @author hzwwl
 * @date 2019/7/9 14:32
 */
public class DoubleCheck {
    private DoubleCheck (){}

    private static volatile DoubleCheck instance;

    public static DoubleCheck getInstance(){
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
