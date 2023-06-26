package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    public String getDescription() {
        String res = super.getDescription() + " Моя страна - "
                + Country.MOLDOVA + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
        return res;
    }
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
}
