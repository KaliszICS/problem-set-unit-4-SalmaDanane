/*

    Author: Salma Danane
    File: Problem Set Unit 4 - High-Low Guessing Game
    Date Created: April 17th, 2026 
    Date Last Modified: April 27th, 2026

*/

import java.util.Scanner;
import java.util.Random;

public class MyClass {
    
  public static void main(String args[]) {
      
      Scanner input = new Scanner(System.in);  // Input function
      Random r = new Random();  // Creating a new random number 
      
      // My variables 
	  
      int score = 0;   // users starting score (increases or remains the same based off of how many points the user scores)    
      int rounds = 0;  // number of rounds the user wants to play 
      int guess;       // guess the user inputs
      int num;         // number user has to guess (this will become the random number)
      
      System.out.println("Welcome to the High-Low Guessing Game!");
      System.out.print("Input your number of rounds to play: ");
      
      rounds = input.nextInt();
      
      while (rounds <= 0) {  // if the user enters a value than is less than or equal to 0 its invalid and they must re-enter their value (until they give a valid input)
          System.out.println("Invalid Input!");
          System.out.print("Input a valid number of rounds to play: ");
          rounds = input.nextInt();
      }

    for (int i = 1; i <= rounds; i++) { // couting user rounds and displaying their round number
         System.out.println("Round " + i);
         
         System.out.println("Please select High, Low or Even: ");
         System.out.println(" 1) High (11 - 20)\n 2) Low (0 - 9)\n 3) Even (10)"); 
         guess = input.nextInt();
		
         while (guess < 1 || guess > 3) {  // checks to see if the user entered a valid input (can't be less than 1 or greater to 3) if not, code repeats util they enter a vilid input
          
			System.out.println("Invalid Input!");

            System.out.println("Please select High, Low or Even: ");
            System.out.println(" 1) High (11 - 20)\n 2) Low (0 - 9)\n 3) Even (10)");
            
            guess = input.nextInt();
         }
         
         num = r.nextInt(21);  // random number between 1-20 inclusive
        
         System.out.println("The number was " + num); // displaying random number to user

         // if/else block to see if user was right and gets the point
		
    if (guess == 1 && num >= 11 && num <= 20) { // if they guess high and the random number is high
            System.out.println("You were correct.");
            score++; // adds one point to their score
		
    } else if (guess == 2 && num >= 0 && num <= 9) { // if they guess low and the number is low
            System.out.println("You were correct.");
            score++; // adds to their point
		
    } else if (num == 10 && guess == 3) {  // if they guess 3/even and the number is even
            System.out.println("You were correct.");
		    score++; // adds to their score
		
    } else { // if all their previous guesses were wrong
            System.out.println("You were incorrect."); 
		
         }
        
         System.out.println("Current score: " + score); // displays score
    } 

int bore = score; 
int bounds = rounds;

if (bore != 0) {  // checks if users score is not 0, then they get the positive message
	System.out.println("Woohoo! Congrats! You got " + bore + " out of " + bounds + " right! Great job!"); // uplifting text
}
else { // if user score is equal to 0, they get the negative message
System.out.println("You got " + score + " out of " + rounds + " correct. Better luck next time."); // low score text
}
    input.close();
   }
}

// end of code
