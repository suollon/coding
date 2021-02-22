package com.suollon.coding.java8.chap11;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * @author hzwwl
 * @date 2019/7/18 18:59
 */
public class Discount {

    private static final DecimalFormat formatter = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));

    public static String applyDiscount(Quote quote) {
        return quote.getShopName() + " price is " + quote.getPrice() + Discount.apply(quote.getPrice(), quote.getDiscountCode());
    }

    private static double apply(double price, Code code) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return format(price * (100 - code.discount) / 100);
    }

    public static double format(double number) {
        synchronized (formatter) {
            return new Double(formatter.format(number));
        }
    }

    public enum Code{
        NONE(0), SILVER(5), GOLG(10), PLATINUM(15), DIAMOND(20);

        private int discount;

        Code(int discount) {
            this.discount = discount;
        }
    }
}
