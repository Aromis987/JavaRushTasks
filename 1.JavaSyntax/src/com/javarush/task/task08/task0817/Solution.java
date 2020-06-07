package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            stringMap.put("Losyash" + i, "Aleshka" + i);
        }
        return stringMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> stringSet = new HashSet<>();
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            for (Map.Entry<String, String> pair2 : map.entrySet()) {
                if (pair.getValue().equals(pair2.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                stringSet.add(pair.getValue());
            }
            count = 0;
        }
        for (String s : stringSet) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
