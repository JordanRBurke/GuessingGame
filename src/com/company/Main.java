package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Allow user input of a number (guess)
        //2. Tell the user if their guess is too high or too low.
        //3. Allow for 5 chances, if the number isn't guessed tell them what it is
        //4. if the number is guessed, congratulate them
        //5. Allow the user to play again if they would like.

        Scanner input = new Scanner(System.in);
//        System.out.println("You have 5 tries to guess the number :)");
//        int userGuess = input.nextInt();

        //________________________GameTestingPersonal______________________
//        int guesses = 0;
//
//
////        System.out.println(Math.round(Math.random() * 10));
//        long randomNumber = (int) (Math.round(Math.random() * 100));
//        int amountGuess = 5;
//        String responceOne = ("The number was: " + randomNumber);
//        while (userGuess < randomNumber || userGuess > randomNumber)
//
//
//            if (userGuess > randomNumber) {
//                System.out.println("Nope, too big the number was: " + randomNumber);
//            } else if (userGuess < randomNumber) {
//                System.out.println("The number you have put in is too small, try again! The number was:" + randomNumber);
//            } else if (userGuess == randomNumber) {
//                System.out.println("Congrats! You have chosen the correct answer!!!");
//            } else if (guesses == 4) {
//                System.out.println("You have reached 4 guesses");
//            } else {
//                System.out.println("Uknown variable detected");
//            }
//        guesses = guesses + 1;


        //_____________________TestingWhileLoop__________________________


        //_______________________GameTesting4Class____________________________

//        System.out.println("Enter your guess: ");
//        int userGuess = input.nextInt();
//
//        int generatedNumber = (int) Math.ceil(Math.random() * 100);
//
//        if (userGuess > generatedNumber) {
//            System.out.println("Your number is too high!");
//
//
//
//
//} else if (userGuess < generatedNumber) System.out.println("Your number is too low!");


        //_________________DoWhileTesting_____________________

        long randomNumber = (int) (Math.round(Math.random() * 100));
//        int userGuess = input.nextInt();


        System.out.println("You have 5 chances to guess a random generated number, your fustration begins now!");
        try {
            int userGuess = input.nextInt();
            int counterTest = 0;

            do {
                counterTest++;
                if (userGuess > randomNumber) {
                    System.out.println("Sorry, the number " + userGuess + " Was too high");

                } else if (userGuess < randomNumber) {
                    System.out.println("Sorry, the number " + userGuess + " Was too low");
                } else if (userGuess == randomNumber) {
                    System.out.println("Congrats! " + userGuess + " Matched the correct answer " + randomNumber);
                } else if (counterTest == 4) {
                    System.out.println("You have reached the maximum amount of guesses");

                } else {
                    System.out.println("Sorry, that variable isn't reconized");

                }
                input.nextLine();

            } while (counterTest < 4);



        } catch (InputMismatchException ime) {
            System.out.println("I'm sorry that is not a recognized response, try again!");
        }
    }
}








