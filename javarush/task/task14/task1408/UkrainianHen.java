package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    public String getDescription() {
        String res = super.getDescription() + " Моя страна - "
                + Country.UKRAINE + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
        return res;
    }
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
}
