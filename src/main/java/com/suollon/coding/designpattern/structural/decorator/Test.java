package com.suollon.coding.designpattern.structural.decorator;

/**
 * @author hzwwl
 * @date 2019/7/15 11:18
 */
public class Test {
    public static void main(String[] args) {
        AbstractCake cake = new Cake();
        //加一份苹果碎
        cake = new AppleDecorator(cake);
        //再加一份苹果碎
        cake = new AppleDecorator(cake);
        //加一份芒果碎
        cake = new MongoDecorator(cake);

        System.out.println(cake);
    }
}
