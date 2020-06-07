package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat catTom = new Cat("Tom", 34, 12);
        Dog dogGarry = new Dog("Garry", 12, 34);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        int tail;

        public Dog(String name, int age, int tail) {
            this.name = name;
            this.age = age;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int age;

        public Cat(String name, int height, int age) {
            this.name = name;
            this.height = height;
            this.age = age;
        }
    }

    //напишите тут ваш код
}
