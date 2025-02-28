/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

/**
 *
 * @author gavan
 */
public class Stars {

    /**
     * Print a number of stars to standard output. If the parameter is less than
     * or equal to zero, an empty line is output.
     *
     * @param value The number of stars to print.
     */
    public static void stars(int value) {

        for (int i = 0; i < value && value > 0; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Count the number of times that a given character occurs in a given
     * string. 'A' is treated as 'a' - the method is case insensitive.
     *
     * @param str A string of text.
     * @param ch The character we want to count the occurrences for in the
     * string.
     * @return Returns the number of times the character occurs in the string.
     */
    public static int countChars(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            // if lowercase ch is equal to lowercase char at position i in string.
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                // Increment count.
                count++;
            }
        }
        return count;
    }

    /**
     * Find and return the smallest of 3 integers passed as parameters.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @param z The third integer.
     * @return The integer with the smallest value.
     */
    public static int findSmallest(int x, int y, int z) {
        int[] args = {x, y, z};
        int smallestVal = x; // initialize smallestVal

        for (int i = 0; i < args.length; i++) {
            smallestVal = args[i] < smallestVal ? args[i] : smallestVal;
        }

        return smallestVal;
    }

    public static void main(String[] args) {
        // Print 10 lines of stars.
        for (int i = 0; i < 10; i++) {
            // Each line has i+1 stars (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).
            stars(i + 1);
        }

        // Test countChars.
        System.out.println(countChars("The fox jumped over the lazy moon.", 'o')); // expect 4
        System.out.println(countChars("The fox jumped over the lazy moon.", 'T')); // expect 2

        System.out.println(countChars("", 'T')); // expect 0
        System.out.println(countChars("************", '*')); // expect 12

        // test findSmallest
        System.out.println("The smallest val: " + findSmallest(1, 3, 99)); // 1
        System.out.println("The smallest val: " + findSmallest(55, 2, -60)); // -60
        System.out.println("The smallest val: " + findSmallest(1999, 3999, 999)); // 999
        System.out.println("The smallest val: " + findSmallest(-1, -3, -99)); // -99
        System.out.println("The smallest val: " + findSmallest(99, 3, -99)); // -99

    }
}
