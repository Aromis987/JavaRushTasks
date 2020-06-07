package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("мама");
        stringArrayList.add("мыла");
        stringArrayList.add("раму");
        for (int i = 0; i < stringArrayList.size(); i = i + 2) {
            stringArrayList.add(i + 1, "именно");
        }

        for (String s : stringArrayList) {
            System.out.println(s);
        }
    }
}
