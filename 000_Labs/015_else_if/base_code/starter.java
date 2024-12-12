/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int rN;
		rN = (int)(Math.random()*1000);
		
		System.out.println("Guess a number between 1 and 1000");
		System.out.print("Your guess: ");
		int eV = sc.nextInt();
		
		if (eV > rN){
			System.out.println("Your guess was too high!");
		}
		else if(eV < rN){
			System.out.println("Your guess was too low!");
		}
		else{
			System.out.println("You guessed correctly!");
		}
	}
}
