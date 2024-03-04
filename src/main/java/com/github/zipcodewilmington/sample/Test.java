package com.github.zipcodewilmington.sample;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Let's Play Word Guess version 1.0");

            ArrayList<String> words = new ArrayList<>();
            words.add("have");
            words.add("car");
            words.add("apple");
            words.add("banana");

            // Generate a random number to select a word from the list
            Random random = new Random();
            int index = random.nextInt(words.size());
            String word = words.get(index);
            char[] wordArray = word.toCharArray();
            char[] guessWord = new char[wordArray.length];

            // Initialize the guess word with underscores
            for (int i = 0; i < word.length(); i++) {
                guessWord[i] = '_';
            }

            int tries = word.length(); // Number of allowed tries
            boolean gameWon = false; // Flag to indicate if the game is won

            while (tries > 0) {
                // Display the current state of the guess word
                System.out.println("Current guesses: " + String.valueOf(guessWord));

                // Prompt the user to enter a single character
                System.out.println("Enter a single character:");
                char ch = scan.next().charAt(0);

                if (word.contains(String.valueOf(ch))) {
                    // If the character is in the word, update the guess word
                    for (int i = 0; i < wordArray.length; i++) {
                        if (wordArray[i] == ch && guessWord[i] == '_') {
                            guessWord[i] = ch;
                            break;
                        }
                    }
                } else {
                    // Decrement the number of tries if the character is not in the word
                    tries--;
                    System.out.println("Incorrect guess! Tries left: " + tries);
                }

                // Check if the word is completely guessed
                if (String.valueOf(guessWord).equals(word)) {
                    gameWon = true;
                    break;
                }
            }

            // Display the final result
            if (gameWon) {
                System.out.println("Congratulations! You won!");
            } else {
                System.out.println("Game over! You ran out of tries.");
            }

            scan.close();
        }
    }


