package com.suollon.coding.designpattern.behavioral.strategy;

/**
 * @author hzwwl
 * @date 2019/7/29 14:12
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity zheKou = new PromotionActivity(new ZheKouPromotionStrategy());
        System.out.println("原价300，折扣后" + zheKou.doPromotion(300));
        System.out.println("原价500，折扣后" + zheKou.doPromotion(500));

        PromotionActivity manJian = new PromotionActivity(new ManJianPromotionStrategy());
        System.out.println("原价300，满减后" + manJian.doPromotion(300));
        System.out.println("原价500，满减后" + manJian.doPromotion(500));

        PromotionActivity vip = new PromotionActivity(new VipZheKouPromotionStrategy());
        System.out.println("原价300，VIP折扣后" + vip.doPromotion(300));
        System.out.println("原价500，VIP折扣后" + vip.doPromotion(500));

    }

}
