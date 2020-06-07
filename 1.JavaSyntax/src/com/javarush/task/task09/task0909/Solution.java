package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    private static void method1() {
        int[] m = new int[2];
        m[8] = 5;
    }
}
