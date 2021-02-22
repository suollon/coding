package com.suollon.coding.arithmetic;

/**
 * @author hzwwl
 * @date 2019/7/2 17:43
 */
public class QuickSearch {
    public static void main(String[] args) {
        double longSide = 57;
        double shortSide = 43;
        double side = side(longSide, shortSide);
        System.out.println(side);
    }

    private static double side(double longSide, double shortSide) {
        if (longSide % shortSide == 0) {
            return shortSide;
        }
        boolean b = true;
        while (b) {
            double leave = longSide % shortSide;
            longSide = shortSide;
            shortSide = leave;
            if (longSide % shortSide == 0) {
                return shortSide;
            }
        }
        return shortSide;
    }

}
