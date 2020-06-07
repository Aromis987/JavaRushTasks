package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = 8;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
