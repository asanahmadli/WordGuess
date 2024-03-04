package com.github.zipcodewilmington.sample;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 * Asan Ahmadli
 */
public class Person {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's Play Word guess version 1.0");

        //given sample words
        ArrayList<String> words = new ArrayList<>();
        words.add("have");
        words.add("car");
        words.add("apple");
        words.add("banana");

        //create a random numbers
        Random random = new Random();

        //arrange range
        int number = random.nextInt(4);
        String word = words.get(number);

        //convert choosen word to charArray
        char[] wordArray = word.toCharArray();
        char[] guessWord = new char[wordArray.length];

        boolean flag = true;
        while (flag) {
            //fill char array with underscore
            for (int a = 0; a < word.length(); a++) {
                guessWord[a] = '_';
            }


            //assign word length to variable for counting tries
            int count = word.length() - 1;
            int key = word.length();
            int rep = 0;


            for (int i = 0; i < word.length(); i++) {
                System.out.println("Current guesses");
                //first time print guess array
                for (char r : guessWord) {
                    System.out.print(r);
                }

                System.out.println();
                System.out.println("Enter a single character");
                char ch = scan.next().charAt(0);
                if (ch == '-') {
                    System.out.println("Game over");
                    break;
                } else {
                    for (int m = 0; m < wordArray.length; m++) {
                        if (wordArray[m] == ch) {
                            guessWord[m] = ch;
                            rep++;
                        } else {
                            rep = 1;
                        }

                    }
                    count -= rep;
                    rep = 0;

                    if (count >= 0) {
                        if (count == 0) {
                            System.out.println("You have " + (count + 1) + " try left.");
                        } else {
                            System.out.println("You have " + (count + 1) + " try left.");
                        }
                    } else {
                        break;
                    }
                }

            }


            for (int k = 0; k < wordArray.length; k++) {
                if (wordArray[k] == guessWord[k]) {
                    key--;
                }
            }

            for (char r : guessWord) {
                System.out.print(r);
            }

            System.out.println();

            if (key == 0) {
                System.out.println("Congratulations, You Won! ");
            } else {
                System.out.println(":-( :-( :-(");
                System.out.println("You Lost! You ran out of guesses.");
            }

            System.out.println("Would you like to play again? (yes/no)");
            String str = scan.next();

            if (str.equalsIgnoreCase("yes")) {
                flag = true;
            } else {
                flag = false;
                System.out.println("See you next time!");
                break;
            }
        }
    }//main

}//class





    


