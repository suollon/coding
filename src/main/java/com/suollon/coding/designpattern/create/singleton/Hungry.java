package com.suollon.coding.designpattern.create.singleton;

import java.io.Serializable;

/**
 * 恶汉式
 * @author hzwwl
 * @date 2019/7/11 9:23
 */
public class Hungry implements Serializable {
    private static final Hungry instance = new Hungry();

    private Hungry () {
        //if (instance != null) {
        //    throw new RuntimeException("单例构造器不允许外部调用");
        //}
    }

    public static Hungry getInstance() {
        return instance;
    }

    private Object readResolve (){
        return instance;
    }
}
