package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String result = null;
        if (o instanceof Cow) {
            result = "Корова";
        }
        if (o instanceof Dog) {
            result = "Собака";
        }
        if (o instanceof Whale) {
            result = "Кит";
        }
        if (o instanceof Pig) {
            result = "Неизвестное животное";
        }
        return result;
    }


    public static class Cow {

    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
