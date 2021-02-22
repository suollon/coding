package com.suollon.coding.designpattern.behavioral.strategy;

/**
 * @author hzwwl
 * @date 2019/7/29 13:59
 */
public class VipZheKouPromotionStrategy implements PromotionStrategy {
    @Override
    public double doPromotion(int spend) {
        //VIP会员，优享88折！
        return spend * 0.88;
    }
}
