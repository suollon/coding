package com.suollon.coding.java8.chap8;

/**
 * @author hzwwl
 * @date 2019/7/17 17:01
 */
public class OnlineBankingB extends OnlineBanking {
    @Override
    public void makeUserHappy(User user) {
        System.out.println("Getaway " + user.getName());
    }
}
