package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s = "SSSSSSSSSS";
        int a = 0;
        while (a < 10) {
            System.out.println(s);
            a++;
        }
    }

    // рабочий цикл, валидадор не принимает
 /*       String s = "S";
        int a = 0;
        while (a < 10) {
            for (int i = 0; i < 10; i++) {
                System.out.print(s);
            }
            System.out.println();
            a++;
        }
    }*/
}

