package com.suollon.coding.designpattern.behavioral.observer.jdk;

import java.util.Observable;

/**
 * @author hzwwl
 * @date 2019/7/29 14:56
 */
public class BBC extends Observable{
    @Override
    public void notifyObservers(Object arg) {
        super.setChanged();
        super.notifyObservers(arg);
    }
}
