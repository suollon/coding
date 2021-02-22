package com.suollon.coding.designpattern.behavioral.observer.mydefined;

/**
 * 被观察者
 */
public abstract class Observable {

    public abstract void add(Observer observer);
    public abstract void remove(Observer observer);
    public abstract void notify(String messgae);
}
