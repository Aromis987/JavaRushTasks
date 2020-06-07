package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> mainArray = initializeArray();
        checkArray(mainArray, min(mainArray), max(mainArray));
    }

    public static ArrayList<String> initializeArray() throws IOException {
        ArrayList<String> stringArrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            stringArrayList.add(reader.readLine());
        }
        return stringArrayList;
    }

    public static int min(ArrayList<String> arrayList) {
        int min = arrayList.get(0).length();
        for (String s : arrayList) {
            if (min > s.length()) {
                min = s.length();
            }
        }
        return min;
    }

    public static int max(ArrayList<String> arrayList) {
        int max = arrayList.get(0).length();
        for (String s : arrayList) {
            if (max < s.length()) {
                max = s.length();
            }
        }
        return max;
    }

    public static void checkArray(ArrayList<String> array, int min, int max) {
        boolean isSorted = true;
        while (isSorted) {
            for (String s : array) {
                if (s.length() == min) {
                    System.out.println(s);
                    isSorted = false;
                    break;
                } else if (s.length() == max) {
                    System.out.println(s);
                    isSorted = false;
                    break;
                }
            }
        }
    }
}
