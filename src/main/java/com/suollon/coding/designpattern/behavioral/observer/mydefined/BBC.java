package com.suollon.coding.designpattern.behavioral.observer.mydefined;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzwwl
 * @date 2019/7/29 15:57
 */
public class BBC extends Observable{

    //需要考虑线程安全，此处未考虑；
    List<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String messgae) {
        list.stream().forEach(o -> o.update(messgae));
    }
}
