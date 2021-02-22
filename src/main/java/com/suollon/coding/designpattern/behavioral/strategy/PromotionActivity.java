package com.suollon.coding.designpattern.behavioral.strategy;

/**
 * @author hzwwl
 * @date 2019/7/29 14:10
 */
public class PromotionActivity {

    private PromotionStrategy strategy;

    public PromotionActivity(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public double doPromotion(int spend) {
        return strategy.doPromotion(spend);
    }
}
