package com.suollon.coding.designpattern.structural.composite.v1;

/**
 * @author hzwwl
 * @date 2019/7/23 14:41
 */
public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void romove(Company company);

    protected abstract void display(int depth);

}
