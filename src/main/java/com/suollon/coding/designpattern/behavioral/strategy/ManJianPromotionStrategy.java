package com.suollon.coding.designpattern.behavioral.strategy;

/**
 * @author hzwwl
 * @date 2019/7/29 14:01
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public double doPromotion(int spend) {
        //每满300减30活动
        return spend - (spend / 300) * 30;
    }
}
