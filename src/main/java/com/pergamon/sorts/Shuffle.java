package com.pergamon.sorts;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ge3k on 15/4/14.
 */
public class Shuffle {
    public static void shuffleArray(Object[] Items) {
        Random random = new Random();
        for (int i = 0; i < Items.length; i++) {
            int r = (int) Math.random();
            //TODO: get random number in the range
            Object temp = Items[i];
            Items[i] = Items[r];
            Items[r] = temp;
        }
    }
}
