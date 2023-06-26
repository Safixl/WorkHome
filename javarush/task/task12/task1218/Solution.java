package com.javarush.task.task12.task1218;

public class Solution {
    public interface CanFly{
        void fly();
    }
    public interface CanEat{
        void eat();
    }
    public interface CanMove{
        void move();
    }
    public class Dog implements CanMove,CanEat {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
    public class Duck implements CanEat,CanFly,CanMove{
        @Override
        public void fly() {

        }

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }
    public class Airplane implements CanFly,CanMove{
        @Override
        public void move() {

        }

        @Override
        public void fly() {

        }
    }
    public class Car implements CanMove{
        @Override
        public void move() {

        }
    }
}
