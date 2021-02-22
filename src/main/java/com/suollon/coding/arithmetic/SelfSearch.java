package com.suollon.coding.arithmetic;

/**
 * @author hzwwl
 * @date 2019/7/2 15:56
 */
public class SelfSearch {

    public static void main(String[] args) {
        int n = 50;
        long start = System.currentTimeMillis();
        System.out.println(fbnq(n));
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start);
        System.out.println(circle(n));
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - end1);

    }

    private static int circle(int n){
        if (n <= 2) {
            return 1;
        }
        int xn = 0;
        int n1 = 1,n2 = 1;
        for (int i = 0; i < n - 2; i++) {
            xn = n1 + n2;
            n1 = n2;
            n2 = xn;
        }
        return xn;
    }

    private static int fbnq(int n){
        if (n <= 2) {
            return 1;
        } else {
            return fbnq(n - 1) + fbnq(n - 2);
        }
    }
}
