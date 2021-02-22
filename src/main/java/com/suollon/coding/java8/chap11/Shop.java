package com.suollon.coding.java8.chap11;

import java.util.Random;

/**
 * @author hzwwl
 * @date 2019/7/18 20:00
 */
public class Shop {

    private Random random;
    private String name;

    public Shop(String name) {
        this.name = name;
        random = new Random(name.charAt(0) * name.charAt(1) * name.charAt(2));
    }

    public String getPrice(String product) {
        double price = calculatePrice(product);
        Discount.Code code = Discount.Code.values()[random.nextInt(Discount.Code.values().length)];
        return String.format("%s==%.2f==%s", name, price, code);
    }

    private double calculatePrice(String product) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }
}
