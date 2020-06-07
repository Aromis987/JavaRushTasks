package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        zerg1.name = "cdas";
        zerg2.name = "cdas1";
        zerg3.name = "cdas2";
        zerg4.name = "cdas3";
        zerg5.name = "cda4s";
        protoss1.name = "frwefwerq";
        protoss2.name = "frwefwerq1";
        protoss3.name = "frwefwerq2";
        terran1.name = "dfsafaas";
        terran2.name = "dfsafaas1";
        terran3.name = "dfsafaas2";
        terran4.name = "dfsafaas3";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
