package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
     /*   int s1, res;
        if (c < d) {
            s1 = c;
        } else s1 = d;

        if (s1 < min(a, b)) {
            res = s1;
        } else  res = min(a, b);
        return res;
    */
        int resMax = Math.min(Math.min(c, d), min(a, b));
        return resMax;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int resMin = Math.min(a, b);
        return resMin;
      /*  int res;
        if (a < b) {
            res = a;
        } else res = b;
        return res;
    */
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}