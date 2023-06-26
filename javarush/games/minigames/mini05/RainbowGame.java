package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {
    Color[] raduga = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,
    Color.BLUE,Color.INDIGO,Color.VIOLET};

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(10,7);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                setCellColor(j,i,raduga[i]);
            }
        }
    }
}
