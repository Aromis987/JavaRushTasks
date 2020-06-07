package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон3", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон6", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Сталлон9", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сталлон8", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлон10", dateFormat.parse("MAY 1 2012"));

//        for (int i = 0; i < 9; i++) {
//            map.put("Сталлоне" + i, dateFormat.parse("JUNE 1 201" + i));
//        }
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                iterator.remove();
            }
        }
//        for (Map.Entry<String, Date> pair : newMap.entrySet()) {
//            if (pair.toString().contains("Jun") || pair.toString().contains("Jul") || pair.toString().contains("Aug")) {
//            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
//                    map.remove(pair.getKey());
//                }
//            }
    }

    public static void main(String[] args) throws ParseException {
//        Map<String, Date> map = createMap();
//        removeAllSummerPeople(map);
//        map.forEach((k, v) -> System.out.println(k + " " + v));

//        for (Map.Entry<String, Date> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
    }
}
