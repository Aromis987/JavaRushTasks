package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numString = reader.readLine();
        int number = Integer.parseInt(numString);

        if (number > 0 && number < 1000) {
            if (numString.length() == 1) {
                if (number % 2 == 0) {
                    System.out.println("четное однозначное число");
                } else System.out.println("нечетное однозначное число");
            }
            if (numString.length() == 2) {
                if (number % 2 == 0) {
                    System.out.println("четное двузначное число");
                } else System.out.println("нечетное двузначное число");
            }
            if (numString.length() == 3) {
                if (number % 2 == 0) {
                    System.out.println("четное трехзначное число");
                } else System.out.println("нечетное трехзначное число");
            }
        }
    }
}
