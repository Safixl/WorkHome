package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        try {
            Path path = Path.of(str1).relativize(Path.of(str2));
            System.out.println(path);
        } catch (Exception e) {
        }
    }
}

