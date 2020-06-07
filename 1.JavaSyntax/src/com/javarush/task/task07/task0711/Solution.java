package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringArrayList.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            stringArrayList.add(0, stringArrayList.get(stringArrayList.size() - 1));
            stringArrayList.remove(stringArrayList.size() - 1);
        }
        for (String s : stringArrayList) {
            System.out.println(s);
        }
    }
}
