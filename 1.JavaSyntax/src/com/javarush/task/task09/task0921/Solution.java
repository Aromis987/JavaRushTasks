package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            while (true) {
                arrayList.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException | IOException ignored) {

        } finally {
            for (Integer a : arrayList) {
                System.out.println(a);
            }
        }
    }
}
