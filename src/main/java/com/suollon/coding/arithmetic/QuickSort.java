package com.suollon.coding.arithmetic;

/**
 * @author hzwwl
 * @date 2019/7/2 19:18
 */
public class QuickSort {
    static int[] list;

    public static void main(String[] args) {
        int n = 100;
        list = new int[n];
        list = buildData(n);
        System.out.println(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println();
        quickSort(list, 0, list.length-1);
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    private static int[] buildData(int size) {
        for (int i = 0; i < size; i++) {
            list[i] = (int)(Math.random() * 100);
        }
        return list;
    }

    private static void quickSort(int[] list, int originLow, int originHigh) {
        if(originLow > originHigh){
            return;
        }
        int low = originLow;
        int high = originHigh;
        int flag = list[originLow];
        int temp;
        while (low < high) {
            while (list[low] <= flag && low < high) {
                low++;
            }
            while (list[high] >= flag && low < high) {
                high--;
            }
            if (low < high) {
                temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }
        list[low] = flag;
        list[originLow] = list[low];

        quickSort(list, originLow, high - 1);
        quickSort(list, high + 1, originHigh);
    }

    public static void quickSortDemo(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSortDemo(arr, low, j-1);
        //递归调用右半数组
        quickSortDemo(arr, j+1, high);
    }

}
