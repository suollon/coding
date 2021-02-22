package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 11:14
 */
public class MilkDecorator extends AbstractDecorator {

    public MilkDecorator(AbstractCake cake) {
        super(cake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一份奶油";
    }

    @Override
    protected int cost() {
        return super.cost() + 5;
    }
}
