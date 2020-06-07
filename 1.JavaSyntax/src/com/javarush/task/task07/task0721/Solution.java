package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayList = new int[20];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = arrayList[0];
        int minimum = arrayList[0];

        for (int value : arrayList) {
            if (maximum < value) {
                maximum = value;
            } else if (minimum > value) {
                minimum = value;
            }
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
