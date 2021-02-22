package com.suollon.coding.designpattern.structural.bridge;

/**
 * @author hzwwl
 * @date 2019/7/23 11:16
 */
public interface Account {

    /**
     * 传入姓名，身份证号开户；开户完成，返回卡号；
     */
    long openAccount(String name, String IDNumber);

    /**
     * 计算利息
     */
    long getInterest(long cardNumber);

}
