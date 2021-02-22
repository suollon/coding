package com.suollon.coding.jdk.collection;

import java.util.*;

/**
 * @author hzwwl
 * @date 2019/8/6 20:42
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("name1", 18);
        hashMap.put("name2", 18);
        hashMap.put("name3", 18);
        hashMap.put("name4", 18);

        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name1", 18);
        linkedHashMap.put("name2", 18);
        linkedHashMap.put("name3", 18);
        linkedHashMap.put("name4", 18);

        printMap(hashMap);
        printMap(linkedHashMap);

        // LinkedHashMap 存储数据是有序的，分为两种：插入顺序和访问顺序。
        // accessOrder 默认为false，即插入顺序；当 accessOrder 为true时，按访问顺序排序；
        Map<String, Object> map = new LinkedHashMap<>(16, 0.75F, true);
        map.put("name1", 18);
        map.put("name2", 18);
        map.put("name3", 18);
        map.put("name4", 18);
        printMap(map);
        map.get("name3");
        map.get("name3");
        map.get("name2");
        //最近访问的排在最后，最久没访问的，排在最前。
        printMap(map);
    }

    private static void printMap(Map<String, Object> map) {
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();
        System.out.print("{");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println("}");
    }
}
