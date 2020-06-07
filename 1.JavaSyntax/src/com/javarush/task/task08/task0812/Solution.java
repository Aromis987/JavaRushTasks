package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> maxNumArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;

        for (int i = 0; i < integerArrayList.size() - 1; i++) {
            if (integerArrayList.get(i).equals(integerArrayList.get(i + 1))) {
                count++;
            } else {
                maxNumArray.add(count);
                count = 1;
            }
        }
        maxNumArray.add(count);

        int max = 0;
        for (Integer integer : maxNumArray) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println(max);
    }
}