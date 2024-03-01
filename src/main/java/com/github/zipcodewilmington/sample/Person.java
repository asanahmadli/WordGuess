package com.github.zipcodewilmington.sample;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Asan Ahmadli
 */
public class Person {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's Play Word guess version 1.0");

        ArrayList<String> words = new ArrayList<>();
        words.add("have");
        words.add("car");
        words.add("apple");
        words.add("banana");

        //create a random numbers
        Random random = new Random();
        int number = random.nextInt(4);
        String word = words.get(1);
        char[] wordArray = word.toCharArray();
        char[] guessWord = new char[wordArray.length];


        //System.out.println("Your secret word is " + word.length() + " character!");
        //fill guess word with underscore
        for (int i = 0; i < guessWord.length; i++) {
            guessWord[i] = '_';
        }

        //current word state
        System.out.println("Current Guesses:");
        for (int j = 0; j < guessWord.length; j++) {
            System.out.print(guessWord[j]);
        }
        //adding new line to start from next line
        System.out.println();

        //this count of player tries to add single characters and additional one more chance
        int count = word.length() + 1;
        for (int i = 0; i < wordArray.length; i++) {


            System.out.println("Enter a single character: ");
            char character = scan.next().charAt(0);
            System.out.println(character);

            if (word.contains(character + "")) {

                //replace underscores with guessed characters
                for (int j = 0; j < wordArray.length; j++) {
                    if (wordArray[i] == character) {
                        guessWord[i] = character;
                    }
                }

                for (int m = 0; m < guessWord.length; m++) {
                    System.out.print(guessWord[m]);
                }

                System.out.println();
            } else {
                System.out.println("Current Guesses:");
                for (int j = 0; j < guessWord.length; j++) {
                    System.out.print(guessWord[j]);
                }
                System.out.println();
                count--;
                if (count == 0) {
                    System.out.println("You Lost! You ran out of guesses.");
                } else {
                    System.out.println("You have " + count + " tries left");
                }

            }

        }


    }


}