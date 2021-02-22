package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 10:54
 */
public abstract class AbstractCake {

    protected abstract String getDesc();

    protected abstract int cost();

    @Override
    public String toString() {
        return "AbstractCake{Desc:" + getDesc() + " 花费：" +  cost() + "}";
    }
}
