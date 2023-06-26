package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();
    ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNext()){
            if(value%2 == 0){
                arrayList.add(value);
            }
        }
        Collections.sort(arrayList);
        for(var el: arrayList){
            System.out.println(el);
        }
        sc.close();
    }
}
