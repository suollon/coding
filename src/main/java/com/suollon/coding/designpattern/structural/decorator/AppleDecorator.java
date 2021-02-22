package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 11:10
 */
public class AppleDecorator extends AbstractDecorator {

    public AppleDecorator(AbstractCake cake) {
        super(cake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一份苹果碎";
    }

    @Override
    protected int cost() {
        return super.cost() + 10;
    }
}
