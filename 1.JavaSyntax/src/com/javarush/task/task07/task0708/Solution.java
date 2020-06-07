package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        Solution.strings = new ArrayList<>();
        ArrayList<String> sorted = sortedArray();
        printArray(sorted);
    }

    public static ArrayList<String> initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        return strings;
    }

    public static ArrayList<String> sortedArray() throws IOException {
        ArrayList<String> arrayList = initializeArray();
        ArrayList<String> sortedArray = new ArrayList<>();
        int maxLength = 0;
        for (String value : arrayList) {
            if (maxLength < value.length()) {
                maxLength = value.length();
            }
        }
        for (String s : arrayList) {
            if (s.length() == maxLength) {
                sortedArray.add(s);
            }
        }
        return sortedArray;
    }

    public static void printArray(ArrayList<String> arrayList) {
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
