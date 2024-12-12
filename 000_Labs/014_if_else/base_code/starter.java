/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int randomNumber;
		randomNumber = (int)(Math.random()*1000);
		
		System.out.println("Guess a number between 1 and 1000");
		System.out.print("Your guess: ");
		int EnteredValue = sc.nextInt();
		
		if ((randomNumber > EnteredValue)||(randomNumber < EnteredValue)){
			System.out.println("You guessed incorrectly!");
			System.out.println(randomNumber + " was the correct number.");
		}
		else
		{
			System.out.println("You guessed it!");
		}
	}
}
