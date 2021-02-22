package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 11:13
 */
public class MongoDecorator extends AbstractDecorator {
    public MongoDecorator(AbstractCake cake) {
        super(cake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一份芒果碎";
    }

    @Override
    protected int cost() {
        return super.cost() + 8;
    }
}
