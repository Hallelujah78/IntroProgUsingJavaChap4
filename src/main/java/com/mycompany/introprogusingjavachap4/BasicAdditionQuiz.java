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

    private static final int MAX_SCORE = 100;
    private static int[] num1;
    private static int[] num2;
    private static int[] userAnswer;

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
    static void createQuiz(int numQuestions) {

        num1 = new int[numQuestions];
        num2 = new int[numQuestions];
        userAnswer = new int[numQuestions];

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
            System.out.print(num1[i] + " + " + num2[i] + ": ");
            String userInput = scan.nextLine();
            userAnswer[i] = Integer.parseInt(userInput); // while loop here to handle exception
        } // end of for loop.

    }

    /**
     * Grade the quiz and provide feedback to user.
     */
    static void gradeQuiz() {

        // Store the user score.
        double userScore = 0.0;

        for (int i = 0; i < num1.length; i++) {

            int correctAnswer = num1[i] + num2[i];

            String answerStatus = correctAnswer == userAnswer[i] ? "Correct" : "Incorrect";

            System.out.println("Question: " + num1[i] + " + " + num2[i]);
            System.out.println("Your answer: " + userAnswer[i] + ". " + answerStatus);
            if (answerStatus.equals("Incorrect")) {
                System.out.println("Correct Answer: " + correctAnswer);
                continue;
            }
            // Answer was correct, increment user score.
            userScore += MAX_SCORE / num1.length;
        }
        // Output grade.
        System.out.println("Your score: " + userScore + " / " + MAX_SCORE);
    }

    public static void main(String[] args) {

        createQuiz(10);
        administerQuiz();
        gradeQuiz();
    }

}
