package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = sortArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //создание массива
    public static int[] initializeArray() throws IOException {
        int[] array = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    //сортировка массива пузырьком
    public static int[] sortArray() throws IOException {
        int[] sortArray = initializeArray();
        boolean isSorted = false;
        int min;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] < sortArray[i + 1]) {
                    isSorted = false;
                    min = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = min;
                }
            }
        }
        return sortArray;
    }
}
