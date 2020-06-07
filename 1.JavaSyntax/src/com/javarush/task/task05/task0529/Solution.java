package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String word = reader.readLine();
            if (word.equals("сумма")) {
                break;
            }
            int num = Integer.parseInt(word);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
