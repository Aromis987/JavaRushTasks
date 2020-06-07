package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Vaska", true, 77);
        Human grandFather2 = new Human("Kolka", true, 74);
        Human grandMother1 = new Human("Tanka", false, 79);
        Human grandMother2 = new Human("Ninka", false, 81);
        Human father = new Human("Petka", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Leska", false, 48, grandFather2, grandMother2);
        Human child1 = new Human("Ritka", false, 13, father, mother);
        Human child2 = new Human("Senka", true, 30, father, mother);
        Human child3 = new Human("Vovka", true, 23, father, mother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}