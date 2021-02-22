package com.suollon.coding.arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author hzwwl
 * @date 2019/6/27 12:58
 */
public class BinarySearch {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list = buildData(100);
        int want = 3;
        int search = binarySearch(want);
        System.out.println(search);
    }

    private static List buildData(int size) {
        for (int i = 6; i < 85; i++) {
            list.add(i);
        }
        return list;
    }

    private static int binarySearch(int want) {
        if (want < list.get(0) || want > list.get(list.size() -1 )) {
            throw new NoSuchElementException();
        }
        int small = 0,large = list.size() -1;
        while (small <= large) {
            int mid = (small + large)/2;
            int guess = list.get(mid);
            if (guess == want) {
                return mid;
            }
            if (guess > want) {
                large = mid -1;
            } else {
                small = mid + 1;
            }
        }
        throw new NoSuchElementException();
    }
}
