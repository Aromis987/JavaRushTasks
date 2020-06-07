package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrayList = initializeArray();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).length() > arrayList.get(i + 1).length()) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    private static ArrayList<String> initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        return list;
    }


}

