package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Jora" + i, 450 + i * 10);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        //краткая запись
        map.entrySet().removeIf(pair -> pair.getValue() < 500);

        //полное описание итератора

//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> pair = iterator.next();
//            if (pair.getValue() < 500) {
//                iterator.remove();
//            }
//        }

        //работает, валидатор не принимает
//        Map<String, Integer> copyMap = createMap();
//        for (Map.Entry<String, Integer> pair : copyMap.entrySet()) {
//            if (pair.getValue() < 500) {
//                map.remove(pair.getKey());
//            }
//        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> map = createMap();
//        removeItemFromMap(map);
//        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}