package com.suollon.coding.designpattern.create.singleton;

/**
 * @author hzwwl
 * @date 2019/7/9 12:40
 */
public class Lazy {

    private static Lazy instance;

    private Lazy (){}

    public static Lazy getInstance (){
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
