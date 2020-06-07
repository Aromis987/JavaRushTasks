package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            while (number > 0) {
                arrayList.add(Integer.parseInt(reader.readLine()));
                number--;
            }

            Collections.sort(arrayList);
            int maximum = arrayList.get(arrayList.size() - 1);
            System.out.println(maximum);
        }
    }
}
