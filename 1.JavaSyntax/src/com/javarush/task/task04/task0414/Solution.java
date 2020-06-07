package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numYear = Integer.parseInt(reader.readLine());

        if (numYear % 400 == 0 || (numYear % 400) % 100 != 0 && numYear % 4 == 0) {
            System.out.println("количество дней в году: 366");
        } else System.out.println("количество дней в году: 365");
    }
}
