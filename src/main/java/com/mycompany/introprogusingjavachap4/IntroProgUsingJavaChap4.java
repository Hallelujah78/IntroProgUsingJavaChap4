/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.introprogusingjavachap4;

import java.util.Scanner;

/**
 *
 * @author gavan
 */
public class IntroProgUsingJavaChap4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt for input.
        System.out.print("Please enter some text content:\t");

        String input = scan.nextLine();
        //
        Capitalize.printCapitalized(input);

        // Exercise 2 - get the hex value from a char
        int intValOfHexValue = HexValue.hexValue('G');
        System.out.println("\nThe int val: " + intValOfHexValue);

        // Exercise 2 part deux: calculate the integer value of a hex string.
        // Get input from user.
        System.out.println("Enter a hex string:\t");
        String hexString = scan.nextLine();

        int intVal = HexValue.hexStringToInt(hexString);
        if (intVal == -1) {
            // Print error.
            System.out.println(hexString + " is not a valid hex string.");
        } else {
            // It is a valid hex string, print the integer value.
            System.out.println("The integer value of " + hexString + " is " + intVal);
        }

    }
}
