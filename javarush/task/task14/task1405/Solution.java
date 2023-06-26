package com.javarush.task.task14.task1405;

/* 
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onEat();
        food.onSelect();//тут добавьте вызов методов для переменной food
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();
        //тут добавьте вызов методов для переменной selectable
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }

        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
