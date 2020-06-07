package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Leshka", true, 15);
        Human child2 = new Human("Lashka", true, 18);
        Human child3 = new Human("Loshka", true, 17);
        Human mother = new Human("Ninka", false, 55, child1, child2, child3);
        Human father = new Human("Kolka", true, 45, child1, child2, child3);
        Human grandfather1 = new Human("Vaska", true, 78, father);
        Human grandfather2 = new Human("Petka", true, 79, mother);
        Human grandmother1 = new Human("Luska", false, 89, father);
        Human grandmother2 = new Human("Galka", false, 93, mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = Arrays.asList(children);
        }
    }
}
