package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 10:56
 */
public class Cake extends AbstractCake {
    @Override
    protected String getDesc() {
        return "蛋糕";
    }

    @Override
    protected int cost() {
        return 80;
    }

}
