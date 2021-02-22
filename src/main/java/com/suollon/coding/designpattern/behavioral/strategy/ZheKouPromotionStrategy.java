package com.suollon.coding.designpattern.behavioral.strategy;

/**
 * @author hzwwl
 * @date 2019/7/29 14:07
 */
public class ZheKouPromotionStrategy implements PromotionStrategy {
    @Override
    public double doPromotion(int spend) {
        //打九五折
        return spend*0.95;
    }
}
