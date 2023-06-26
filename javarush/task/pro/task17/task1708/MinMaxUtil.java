package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxUtil {
    public static int min (int q, int w){
        return Math.min(q, w);
    }
    public static int min (int q, int w, int e){
        return min(q,min(w,e));
    }
    public static int min (int q, int w, int e,int r){
        return min(q,min(w,e,r));
    }
    public static int min (int q, int w, int e, int r, int t){
        return min(q,min(w,e,r,t));
    }
    public static int max (int q, int w){
        return Math.max(q, w);
    }
    public static int max (int q, int w, int e){
        return max(q,max(w,e));
    }
    public static int max (int q, int w, int e, int r){
        return max(q,max(w,e,r));
    }
    public static int max (int q, int w, int e, int r, int t){
        return max(q,max(w,e,r,t));
    }


}
