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
    }
}
