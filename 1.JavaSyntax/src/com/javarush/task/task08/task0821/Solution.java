package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            stringMap.put("Losyasha" + random.nextInt(6), "Leshik" + random.nextInt(6));
        }

        return stringMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
