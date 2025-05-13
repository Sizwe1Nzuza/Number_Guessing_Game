/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguesinggame;

import java.util.Scanner ;
import java.util.Random ;

/**
 *
 * @author 4nzuz
 */
public class NumberGuesingGame {

    public static void main(String[] args) {
        //Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in) ;
        //Create Random object to generate a random number
        Random random = new Random() ;
        //Generate a random number between 1 and 100 (inclusive)
        int numberToGuess = random.nextInt(100)+1 ;
        //Counter to keep track of the number of guesses the user makes
        int numberOfTries = 0;
        //Variable to store user's guess
        int guess;
        //Boolean flag to determine if the user has guessed correctly
        boolean hasWon = false;
        
        //Welcom messsage to the user
        System.out.println("Welcom to the number guessing game!!!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        
        //Loop continues until the user guesses the correct number
        while (!hasWon) { //i.e: Is not False = is true
              //Prompt the user to enter a guess
              System.out.println("What is your gues...");
             guess = scanner.nextInt() ; //Read the guess of the user
             numberOfTries++ ; //Increment the number of tries (numberOfTries = numberOfTries+1)
             
             //Check if the guess is lower than the target number
             if (guess<numberToGuess) {
                 System.out.println("Too Low!! (!!WOMP WOMP!!)\nTry a higher number this time...");
             }
             //Check if the guess is higher than the targer number
             else if (guess>numberToGuess){
                 System.out.println("Too High!! (!!WOMP WOMP!!)\nTry a lower number this time...");
             }
             //If the guess is spot on (correct)
             else {
                 System.out.println("Nice JOB!!!!  \n You got in in "+ numberOfTries+ " tries!!!");
             }

         }
           }
             
             } 
              
        
        
        
    

