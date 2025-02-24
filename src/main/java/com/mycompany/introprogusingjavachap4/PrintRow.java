/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

/**
 *
 * @author gavan
 */
public class PrintRow {

    /**
     * Prints a character N times, where N is equal to numChars.
     * If N <= 0, an empty line is output.
     *
     * @param character The char to print.
     * @param numChars The number of times to print the character.
     */
    static void printRow(char ch, int numChars) {

        // Output the characters. If numChars <= 0, body of for never executed.
        for (int i = 0; i < numChars; i++) {
            System.out.print(ch);
        }
        // a new line is always output.
        System.out.println();
    }

    /**
     * Prints 25 copies of each character in the string on a separate line.
     *
     * @param str The string containing the characters to be printed.
     */
    static void printRowsFromString(String str) {
        for (int i = 0; i < str.length(); i++) {
            printRow(str.charAt(i), 25);
        }
    }

}
