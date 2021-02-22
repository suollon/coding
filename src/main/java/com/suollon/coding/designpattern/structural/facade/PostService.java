package com.suollon.coding.designpattern.structural.facade;

/**
 * @author hzwwl
 * @date 2019/7/15 9:47
 */
public class PostService {
    public String execute(PointGift pointGift){
        System.out.println(pointGift.getName() + "进入物流系统");
        return "物流订单号458743645489";
    }
}
