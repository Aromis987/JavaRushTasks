package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && a != c) {
            System.out.println(3);
        } else if (a == c && a != b) {
            System.out.println(2);
        } else if (b == c && b != a) {
            System.out.println(1);
        }
    }
}
/*
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int numberArray(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] != array[i + 1]) {
                num++;
            } else num = 0;
        }
        return num;
    }
}*/
