package com.suollon.coding.designpattern.structural.bridge;

/**
 * @author hzwwl
 * @date 2019/7/23 11:35
 */
public class FixedAccount implements Account {

    @Override
    public long openAccount(String name, String IDNumber) {
        System.out.println("为" + name + "开通定期账户，卡号为" + name.length() + IDNumber.length());
        return name.length() + IDNumber.length();
    }

    @Override
    public long getInterest(long cardNumber) {
        System.out.println("定期利息20");
        return 20;
    }
}
