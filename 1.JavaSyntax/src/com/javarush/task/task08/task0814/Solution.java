package com.javarush.task.task08.task0814;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() throws IOException {
        // напишите тут ваш код
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            integerSet.add(i);
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(num -> num > 10);
        return set;
    }

    public static void main(String[] args) {

    }
}
