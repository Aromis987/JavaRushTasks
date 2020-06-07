package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    private static void method1() {
        int a = 42 / 0;
    }
}
