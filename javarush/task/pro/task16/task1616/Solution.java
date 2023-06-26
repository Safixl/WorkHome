package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> result = new TreeSet<>();
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        for(String s: zoneId.getAvailableZoneIds())
            result.add(s);
        return result;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zone = ZonedDateTime.now(zoneId);

        return zone;
    }
}
