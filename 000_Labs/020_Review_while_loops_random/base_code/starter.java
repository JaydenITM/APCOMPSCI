/*
 *	Author:  jayden Lee
 *  Date: 10/1/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		int guessingNum = (int)(Math.random()*1000);
		int secretNum = 223;
		
		System.out.println("Guess the number between 1 and 1000");
		System.out.print("Your guess: ");
		int guess = sc.nextInt();
		
		int noG;
		noG = 1;
		
		int soG;
		soG = 0;
		
		while ((guess != guessingNum)||(guess == secretNum)){
			if (guess > guessingNum){
				System.out.println("Too high!");
				System.out.print("Your guess: ");
				guess = sc.nextInt();
				noG = noG + 1;
			}
			if (guess < guessingNum){
				System.out.println("Too low!");
				System.out.print("Your guess: ");
				guess = sc.nextInt();
				noG = noG + 1;
			}
			
			if (guess == secretNum){
				System.out.print("You guessed the secret number!");
				soG = soG + 1;
				
				if ((guess == secretNum)&&(guess > guessingNum)){
					System.out.println(" But your guess is still too high.");
					System.out.print("Your guess: ");
					guess = sc.nextInt();
					noG = noG + 1;
					soG = soG + 1;
				}
				if ((guess == secretNum)&&(guess < guessingNum)){
					System.out.println("You guessed the secret number! But your guess is still too low.");
					System.out.print("Your guess: ");
					guess = sc.nextInt();
					noG = noG + 1;
					soG = soG + 1;
				}
				if ((guess == secretNum)&&(guess == guessingNum)){
					System.out.println("And you guessed the right number!");
					System.out.println("You took " + noG +" guesse(s) to get the right number");
					System.out.println("You took " + soG +" guesse(s) to get the secret number");
					return;
				}
			}
			if (guess == guessingNum){
				break;
			}
			
		}
		
		System.out.println("You guessed the right number!");
		System.out.println("You took " + noG +" guesse(s) to get the right number");
		if (soG > 0){
			System.out.println("You took " + soG +" guesse(s) to get the secret number");
		}
	}
}
