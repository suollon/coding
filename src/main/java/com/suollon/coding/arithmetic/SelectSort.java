package com.suollon.coding.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * 快速排序
 * @author hzwwl
 * @date 2019/7/2 15:22
 */
public class SelectSort {
    static List<Integer> list = new ArrayList<>();
    static List<Integer> result = new ArrayList<>();
    static List<Integer> index = new ArrayList<>();

    public static void main(String[] args) {
        list = buildData(100);
        System.out.println(list);
        for (int i = 0; i < 100; i++) {
            int largest = findLargest(list);
            result.add(largest);
            int in = list.indexOf(largest);
            index.add(in);
            list.remove(in);
        }
        System.out.println(result);
        System.out.println(index);
        int sum = 0;
        for (int i = 0; i < index.size(); i++) {
            sum += index.get(i);
        }
        System.out.println(sum);
    }

    private static List buildData(int size) {
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 100));
        }
        return list;
    }

    private static int findLargest(List<Integer> list) {
        int largest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (largest < list.get(i)) {
                largest = list.get(i);
            }
        }
        return largest;
    }
}
