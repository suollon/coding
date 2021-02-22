package com.suollon.coding.java8.chap11;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author hzwwl
 * @date 2019/7/18 17:23
 */
public class Test1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        AsyncShop shop = new AsyncShop();
        Future<Double> vegetablePrice = shop.getPriceAsync("vegetable");
        Future<Double> vegetablePrice2 = shop.getPriceAsync2("vegetable");
        long time = System.currentTimeMillis() - start;
        System.out.println("返回Future对象花费的时间---" + time);

        //do something else;
        try {
            Double price = vegetablePrice.get(1300, TimeUnit.MILLISECONDS);
            Double price2 = vegetablePrice.get(1300, TimeUnit.MILLISECONDS);
            System.out.println(price + "  " + price2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("取到Future中的结果花费的时间---" + (System.currentTimeMillis() - start));

    }

}
