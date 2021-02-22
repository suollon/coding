package com.suollon.coding.designpattern.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author hzwwl
 * @date 2019/7/29 14:47
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("用户" + name + "收到了最新的消息" + arg);
    }
}
