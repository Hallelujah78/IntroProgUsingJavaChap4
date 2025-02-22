/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

import java.util.HexFormat;

/**
 *
 * @author gavan
 */
public class HexValue {

    // hex value 'FADE'
    // F = 15
    // A = 10
    // D = 13
    // E = 14
    // value of FADE (base 16) is:
    // 0*16+15
    // 15*16+10 = 250
    // 250*16 + 13 = 4013 - is (15*16+10) x 16 + 13 is 15 x 16^2 + 10 x 16^1 + 13
    // 4013*16 + 14 = 64222 base 10 - is (15 x 16^2 + 10 x 16^1 + 13) x 16 + 14 - is 15x16^3 + 10 x 16^2 + 13 x 16^1 + 14 x 16^0
    /* Standard way:
    15x16^3 + 10x16^2 + 13 x 16^1 + 14x16^0
     */
    public static int hexStringToInt(String value) {

        // Store the cumulative value.
        int cumValue = 0;

        for (int i = 0; i < value.length(); i++) {

            // Value of char at i.
            int charVal = hexValue(value.charAt(i));

            // If hexValue returns -1 then value is not a valid hex string.
            if (charVal == -1) {

                return -1;
            }

            cumValue = cumValue * 16 + charVal;

        }
        return cumValue;

    }

    public static int hexValue(char character) {

        // Normalize input - we consider a-f to have same hex values as A-F.
        char tempCharacter = Character.toUpperCase(character);

        // 0-9 plus A-F
        return switch (tempCharacter) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' ->
                HexFormat.fromHexDigit(tempCharacter);
            default ->
                -1;
        };

    }

}
