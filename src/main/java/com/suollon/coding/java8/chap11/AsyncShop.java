package com.suollon.coding.java8.chap11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author hzwwl
 * @date 2019/7/18 17:09
 */
public class AsyncShop {

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() -> {
            try {
                double price = calculatePrice(product);
                futurePrice.complete(price);
            } catch (Exception e) {
                futurePrice.completeExceptionally(e);
            }
        }).start();
        return futurePrice;
    }

    /**
     * 与上一个方法作用完全相同；
     */
    public Future<Double> getPriceAsync2(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

    private double calculatePrice(String product) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Math.random()*1000;
    }
}
