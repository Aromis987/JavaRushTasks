package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }
}

