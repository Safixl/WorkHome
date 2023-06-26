package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
    public int compare(Student st1, Student st2){

        return ((st1.getAge() - st2.getAge()) == 0 ? 0 : (st1.getAge()-st2.getAge() > 0) ? -1 : 1) ;
    }
}
