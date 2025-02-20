/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

/**
 *
 * @author gavan
 */
public class Capitalize {

    public static void printCapitalized(String str) {

        // Iterate over every character of the string.
        for (int i = 0; i < str.length(); i++) {

            // If it is the first character AND it is a letter.
            if (i == 0 && Character.isLetter(str.charAt(i))) {
                // Capitalize it and print out.
                System.out.print(Character.toUpperCase(str.charAt(i)));
                // Start from next item in string.
                continue;
            }

            // If we're not at the first character AND the character is a letter AND the preceding character
            // is NOT a letter
            if (i > 0 && Character.isLetter(str.charAt(i)) && !Character.isLetter(str.charAt(i - 1))) {
                // Capitalize the letter and print it out.
                System.out.print(Character.toUpperCase(str.charAt(i)));
                // Continue iteration from next item.
                continue;
            }
            // We're neither at the first character, and we're also not at the start of a word.
            // Simply print out whatever the character is in the original string.
            System.out.print(str.charAt(i));
        }

    }

}
