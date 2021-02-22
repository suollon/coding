package com.suollon.coding.designpattern.structural.bridge;

/**
 * @author hzwwl
 * @date 2019/7/23 11:38
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract long openAccount(String name, String IDNumber);

    abstract long getInterest(long cardNumber);

    /**
     * 传入卡号存钱，存后，返回存钱后的总金额；
     */
    public long saveMoney(long cardNumber, long money) {
        //通过cardNumber获取当前余额，累加上money，返回最新余额；
        return money + 100;
    }

    /**
     * 根据卡号取完钱后，返回余额；
     */
    public long takeMoney(long cardNumber, long money) {
        //通过cardNumber获取当前余额，减去money，返回最新余额；
        if (100 - money < 0) {
            throw new IllegalArgumentException("没有这么多钱可以取");
        }
        return 100 - money;
    }
}
