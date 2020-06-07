package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println(e);
        }


        //напишите тут ваш код
    }

    private static void method1() {
        String s = null;
        String m = s.toLowerCase();
    }
}
