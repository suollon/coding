package com.suollon.coding.designpattern.structural.bridge;

/**
 * @author hzwwl
 * @date 2019/7/23 11:41
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    long openAccount(String name, String IDNumber) {
        System.out.print("开通一个工商银行账户   ");
        return account.openAccount(name, IDNumber);
    }

    @Override
    long getInterest(long cardNumber) {
        return account.getInterest(cardNumber);
    }
}
