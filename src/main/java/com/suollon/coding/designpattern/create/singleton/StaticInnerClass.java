package com.suollon.coding.designpattern.create.singleton;

/**
 * @author hzwwl
 * @date 2019/7/9 14:39
 */
public class StaticInnerClass {

    private StaticInnerClass(){}

    private static class Inner {
        static StaticInnerClass instance = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance (){
        return Inner.instance;
    }
}
