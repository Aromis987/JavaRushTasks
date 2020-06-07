package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> sorted = sortedArray();
        printArray(sorted);
    }

    public static ArrayList<String> initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
        return arrayList;
    }

    public static ArrayList<String> sortedArray() throws IOException {
        ArrayList<String> arrayList = initializeArray();
        ArrayList<String> sortedArray = new ArrayList<>();
        int minLength = arrayList.get(0).length();
        for (String value : arrayList) {
            if (minLength > value.length()) {
                minLength = value.length();
            }
        }
        for (String s : arrayList) {
            if (s.length() == minLength) {
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
