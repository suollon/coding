package com.suollon.coding.designpattern.structural.facade;

/**
 * @author hzwwl
 * @date 2019/7/15 9:46
 */
public class PointExchangeService {
    public boolean execute(PointGift pointGift){
        System.out.println(pointGift.getName() + "积分支付成功");
        return true;
    }
}
