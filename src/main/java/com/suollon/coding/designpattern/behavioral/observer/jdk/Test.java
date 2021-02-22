package com.suollon.coding.designpattern.behavioral.observer.jdk;

import java.util.Observable;

/**
 * @author hzwwl
 * @date 2019/7/29 15:18
 */
public class Test {

    public static void main(String[] args) {
        Reader reader1 = new Reader("小张");
        Reader reader2 = new Reader("小明");
        Reader reader3 = new Reader("小红");

        Observable bbc = new BBC();
        bbc.addObserver(reader1);
        bbc.addObserver(reader2);
        bbc.addObserver(reader3);
        bbc.notifyObservers("孙杨又拿了世锦赛冠军！");
        System.out.println("==================================");

        bbc.deleteObserver(reader1);
        bbc.notifyObservers("中国人两百米跑进20秒啦！！！");
    }

}
