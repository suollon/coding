package com.suollon.coding.designpattern.structural.facade;

/**
 * @author hzwwl
 * @date 2019/7/15 10:10
 */
public class Test {

    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.execute(new PointGift("钢铁侠", 68));
    }

}
