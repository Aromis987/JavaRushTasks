package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int count = countArray(array);
        System.out.println(count);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int countArray(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                count++;
            }
        }
        return count;
    }
}
