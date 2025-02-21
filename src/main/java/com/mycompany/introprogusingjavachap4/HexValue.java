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
