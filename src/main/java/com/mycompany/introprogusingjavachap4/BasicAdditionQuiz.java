/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogusingjavachap4;

import java.util.Scanner;

/**
 *
 * @author gavan
 */
public class BasicAdditionQuiz {

    private static final int[] num1 = new int[10];
    private static final int[] num2 = new int[10];
    private static final int[] userAnswer = new int[10];

    // 10 questions
    // each question is a simple addition: 17+42
    // numbers chosen at random and not too big
    // ask all questions and get each answer
    // at end
    // print each question
    // indicate if user was right or wrong
    // give the right answer
    // a correct answer is 10 points, give score/100
    // 3 subroutines - one to create quiz, one to administer quiz, one to grade quiz
    // use 3 global arrays: 1st num, 2nd num, 3rd user's answer
    /**
     * Initialize the arrays with random numbers
     */
    static void createQuiz() {
        for (int i = 0; i < num1.length; i++) {
            // Add a random integer to num1
            num1[i] = (int) (Math.random() * 100);
            // Add a random integer to num2
            num2[i] = (int) (Math.random() * 100);
        }

    }

    /**
     * Administer a quiz to the user. Prompt the user with simple addition
     * questions such as 5 + 24. Get the answer from the user and store in an
     * array.
     */
    static void administerQuiz() {

        // Create a scanner to get user input.
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Simple Addition Quiz!");
        System.out.println("Please enter your answer for each question.");
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i] + " + " + num2[i]);
            String userInput = scan.nextLine();
            userAnswer[i] = Integer.parseInt(userInput); // while loop here to handle exception
        } // end of for loop.

    }

    public static void main(String[] args) {

        createQuiz();
        administerQuiz();
    }

}
