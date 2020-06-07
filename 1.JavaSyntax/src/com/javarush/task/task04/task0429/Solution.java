package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int countMin = 0;
        int countMax = 0;

        for (int value : array) {
            if (value > 0) {
                countMax++;
            } else if (value < 0) {
                countMin++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countMin);
        System.out.println("количество положительных чисел: " + countMax);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}
