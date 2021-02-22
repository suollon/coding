package com.suollon.coding.designpattern.structural.composite;

/**
 * @author hzwwl
 * @date 2019/7/24 10:54
 */
public abstract class AbstractCompany {

    public String name;

    public AbstractCompany(String name) {
        this.name = name;
    }

    public abstract void add(AbstractCompany company);
    public abstract void remove(AbstractCompany company);
    public abstract void display(int n);
}
