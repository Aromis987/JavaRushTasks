package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 13;
        this.weight = 34;
        this.address = null;
        this.color = "Green";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "Yellow";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 34;
        this.address = null;
        this.color = "Red";
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.age = 12;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.age = 54;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
