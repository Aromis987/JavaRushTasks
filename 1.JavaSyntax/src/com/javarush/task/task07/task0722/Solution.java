package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String word = null;
        while (true) {
            word = reader.readLine();
            if (word.equals("end")){
                break;
            }
            arrayList.add(word);
        }
        for(String s : arrayList) {
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}