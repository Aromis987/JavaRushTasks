package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainArrayList = initializeArray();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        for (Integer integer : mainArrayList) {
            if (integer % 3 == 0 && integer % 2 == 0) {
                List1.add(integer);
                List2.add(integer);
            } else if (integer % 3 == 0 && integer % 2 != 0) {
                List1.add(integer);
            } else if (integer % 3 != 0 && integer % 2 == 0) {
                List2.add(integer);
            } else List3.add(integer);
        }
        printList(List1);
        printList(List2);
        printList(List3);
    }

    private static ArrayList<Integer> initializeArray() throws IOException {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }
        return integerArrayList;
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
