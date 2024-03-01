package com.github.zipcodewilmington.sample;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** Asan Ahmadli */
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
        String word = words.get(number);
        char[] wordArray = word.toCharArray();

        for(int i=0;i<wordArray.length;i++){
            System.out.println("Current Guesses:");
            System.out.println("Enter a single character: ");
            char character = scan.next().charAt(0);
            if(wordArray[i]==character){
                System.out.println(wordArray);
            }

        }


    }




}