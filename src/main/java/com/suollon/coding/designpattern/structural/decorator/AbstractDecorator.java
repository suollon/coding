package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 10:58
 */
public class AbstractDecorator extends AbstractCake {
    private AbstractCake cake;

    public AbstractDecorator (AbstractCake cake){
        this.cake = cake;
    }

    @Override
    protected String getDesc() {
        return cake.getDesc();
    }

    @Override
    protected int cost() {
        return cake.cost();
    }
}
