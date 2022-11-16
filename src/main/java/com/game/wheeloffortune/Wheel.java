package com.game.wheeloffortune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Wheel {
    // 24 Total I'm thinking a -1 will mean Bankrupt, 0 can be losing a turn

    private static final int[] WEDGE_VALUES_OF_WHEEL = {200, 250, 300, 350, 400, 450, 500, 550, 600,
            650, 700, 750, 800, 850, 900, 950, 1000, 1050, 1100, 1150, 1200, 1250, 0, -1};

    private ArrayList<String> colorValues = new ArrayList<>(
            Arrays.asList(
                    "\u001B[31m", // RED
                    "\u001B[32m", // GREEN
                    "\u001B[33m", // YELLOW
                    "\u001B[34m", // BLUE
                    "\u001B[35m", // PURPLE
                    "\u001B[36m" // CYAN
            ));

    private ArrayList<Integer> color_Index = new ArrayList<>(50);

    // returns a random wedge on the wheel
    public static int getRandomWedgeOfTheWheel() {
        int randomPrizeValue = new Random().nextInt(WEDGE_VALUES_OF_WHEEL.length);
        return WEDGE_VALUES_OF_WHEEL[randomPrizeValue];
    }

    public String getRandomUniquePlayerColor() {

        boolean uniqueColor = false;
        int playerColorInt = new Random().nextInt(colorValues.size());
        String playerColor = "";

        while (!uniqueColor) {

            if (color_Index.contains(playerColorInt)) {
                playerColorInt = new Random().nextInt(colorValues.size());
                continue;
            } else {
                playerColor = colorValues.get(playerColorInt);
                color_Index.add(playerColorInt);
                uniqueColor = true;
            }
        }

        return playerColor;
    }

}
