package com.suollon.coding.designpattern.behavioral.chainofbresponsibility;

/**
 * 主管审核者
 * @author hzwwl
 * @date 2019/7/31 9:48
 */
public class ChargeHandler extends Handler{

    @Override
    public void handle(Holiday holiday) {
        if (holiday.getDays() <= 5) {
            System.out.println("通过-----主管审核通过");
            if (getNextHandler() != null) {
                getNextHandler().handle(holiday);
            } else {
                System.out.println("审核流程结束！");
            }
        } else {
            System.out.println("拒绝-----超过5天的假期不批 ！！");
        }
    }
}
