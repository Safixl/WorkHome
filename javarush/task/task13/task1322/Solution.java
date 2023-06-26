package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }
    static class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

}
