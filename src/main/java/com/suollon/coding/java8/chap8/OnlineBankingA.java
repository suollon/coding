package com.suollon.coding.java8.chap8;

/**
 * @author hzwwl
 * @date 2019/7/17 16:58
 */
public class OnlineBankingA extends OnlineBanking {
    @Override
    public void makeUserHappy(User user) {
        System.out.println("Hello " + user.getName());
    }
}
