package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] daysWeek = new String[]{"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        int dayNum = Integer.parseInt(reader.readLine());

        if (dayNum > 0 && dayNum < 8) {
            System.out.println(daysWeek[dayNum - 1]);
        } else System.out.println("такого дня недели не существует");
    }
}