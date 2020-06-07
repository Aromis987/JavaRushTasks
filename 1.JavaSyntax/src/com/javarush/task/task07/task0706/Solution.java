package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arrayList = initializeArray();
        sortedList(arrayList);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayList = new int[15];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = Integer.parseInt(reader.readLine());
        }
        return arrayList;
    }

    public static void sortedList(int[] arrayList) {
        int sumEven = 0;
        int sunOdd = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (i % 2 == 0) {
                sumEven += arrayList[i];
            } else sunOdd += arrayList[i];
        }
        if (sumEven > sunOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
