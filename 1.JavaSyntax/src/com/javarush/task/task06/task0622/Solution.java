package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        printArray(sortArray());
    }

    //создание массива
    public static ArrayList<Integer> initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        return array;
    }

    //сортировка в возрастающем порядке
    public static ArrayList<Integer> sortArray() throws IOException {
        ArrayList<Integer> arrayList = initializeArray();
        int min;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    isSorted = false;
                    min = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, min);
                }
            }
        }
        return arrayList;
    }

    //вывод массива на экран
    public static void printArray(ArrayList<Integer> array) {
        for (int volume : array) {
            System.out.println(volume);
        }
    }
}
