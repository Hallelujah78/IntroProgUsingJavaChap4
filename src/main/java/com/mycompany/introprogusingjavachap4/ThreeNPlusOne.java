/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

/**
 *
 * @author gavan
 */
public class ThreeNPlusOne {

    public static void threeNPlusOne(int n) {
        // until N is 1
        // if N odd, print 3N+1
        // if N is even, print N/2
        int currentN = n;
        while (n != 1) {
            if (n % 2 == 0) { // it is even
                n /= 2;
            } else { // n is odd
                n = 3 * n + 1;
            }
            if (n != 1) {
                System.out.print(n + ", ");
            } else {
                System.out.print(n);
            }
        }

    }
}
