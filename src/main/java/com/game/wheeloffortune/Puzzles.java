package com.game.wheeloffortune;

import java.util.HashMap;
import java.util.Map;

public class Puzzles {
    Map<String, String> hintPuzzles = new HashMap<>() {{
        hintPuzzles.put("Objects In Memory", "REFERENCE VARIABLE");
        hintPuzzles.put("Data Type", "PRIMITIVE");
        hintPuzzles.put("Food", "HOT DOGS ARE NOT TACOS");
        hintPuzzles.put("Something Thrown", "EXCEPTIONS");
    }};

    // TODO method public static Map.Entry<K,V> getRandomPuzzle()
}
