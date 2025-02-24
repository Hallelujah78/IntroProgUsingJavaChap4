/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

/**
 *
 * @author gavan
 */
public class AllDivisors {

    static void printDivisors(int num) {

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) { // i is a divisor if true
                System.out.print(i + " ");
            }
        }
    }

}
