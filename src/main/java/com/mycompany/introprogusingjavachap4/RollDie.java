/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

import java.util.function.Function;

/**
 *
 * @author gavan
 */
public class RollDie {

    /**
     * Finds the number of times a pair of dice is rolled until a given number
     * is rolled.
     *
     */
    public static int getNumRolls(int desiredNum) {
        // The desired number must be achieveable when rolling two dice.
        if (desiredNum <= 1 || desiredNum > 12) {
            throw new IllegalArgumentException("It is not possible to roll " + desiredNum + " with two dice. Invalid argument.");
        }

        int diceOne = 0;
        int diceTwo = 0;

        // Count the number of dice rolls taken.
        int count = 0;

        while ((diceOne + diceTwo) != desiredNum) {

            diceOne = (int) (Math.random() * 6) + 1;
            diceTwo = (int) (Math.random() * 6) + 1;
            count++;
        }

        return count;

    }

    public static double monteCarlo(int iterations, int desiredNum) {

        int total = 0;

        for (int i = 0; i < iterations; i++) {
            total += getNumRolls(desiredNum);
        }

        return total / (double) iterations;
    }
;

}
