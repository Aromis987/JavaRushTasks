package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            while (number > 0) {
                System.out.println(word);
                number--;
            }
        }
    }
}
