package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<>();
    //напишите тут ваш код

    public Cat() {

    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            Cat.cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
