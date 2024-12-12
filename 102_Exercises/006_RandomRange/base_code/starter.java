/*
 *	Author: Jayden Lee
 *  Date: 9/16
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number"); 
		System.out.print("Please enter an integer: ");
		int Fn = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int Sn = sc.nextInt();
		
		System.out.println("Your range is "+Fn+" to "+Sn+".");
		System.out.println("Here are 5 numbers generated in that range");
		
		int randomNum1 = (int)((Fn)+(Math.random()*(Sn-Fn)));
		int randomNum2 = (int)((Fn)+(Math.random()*(Sn-Fn)));
		int randomNum3 = (int)((Fn)+(Math.random()*(Sn-Fn)));
		int randomNum4 = (int)((Fn)+(Math.random()*(Sn-Fn)));
		int randomNum5 = (int)((Fn)+(Math.random()*(Sn-Fn)));
		
		System.out.println(randomNum1+", "+randomNum2+", "+randomNum3+", "+randomNum4+", "+randomNum5);
	}
}
