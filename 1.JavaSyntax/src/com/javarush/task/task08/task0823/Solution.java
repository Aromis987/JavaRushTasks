package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character letter = chars[i];
            chars[0] = Character.toUpperCase(chars[0]);
            if (letter.equals(' ')) {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        System.out.println(chars);
    }
}
