package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    public int compare(JavaRushMentor mentor1, JavaRushMentor menor2) {
        return mentor1.getName().length() - menor2.getName().length();
    }//напишите тут ваш код
}
