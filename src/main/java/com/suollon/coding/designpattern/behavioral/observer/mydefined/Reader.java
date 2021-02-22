package com.suollon.coding.designpattern.behavioral.observer.mydefined;

/**
 * @author hzwwl
 * @date 2019/7/29 15:54
 */
public class Reader implements Observer {

    private String name;

    Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("用户" + name + "收到了最新的消息" + message);
    }
}
