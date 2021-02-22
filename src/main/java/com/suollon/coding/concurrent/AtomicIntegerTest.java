package com.suollon.coding.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author hzwwl
 * @date 2019/6/28 10:28
 */
public class AtomicIntegerTest {

    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
        ai.lazySet(5);
        System.out.println(ai);
        int[] arr = {1, 2, 3, 4, 5};
        AtomicIntegerArray array = new AtomicIntegerArray(arr);
        array.addAndGet(1, 10);
        System.out.println(array.get(1));
        System.out.println(arr[1]);
    }

}
