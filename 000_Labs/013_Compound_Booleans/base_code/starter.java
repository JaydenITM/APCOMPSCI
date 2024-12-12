/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three different values:");
		
		System.out.print("First value:");
		int numberOne = sc.nextInt();
		System.out.print("Second value:");
		int numberTwo = sc.nextInt();
		System.out.print("Third value:");
		int numberThree = sc.nextInt();
		
		if ((numberOne > numberTwo)&&(numberOne > numberThree)){
			System.out.println(numberOne + " is your greatest value.");
		}
		if ((numberOne < numberTwo)&&(numberTwo > numberThree)){
			System.out.println(numberTwo + " is your greatest value.");
		}
		if ((numberOne < numberThree)&&(numberTwo < numberThree)){
			System.out.println(numberThree + " is your greatest value.");
		}
		
		if ((numberOne < numberTwo)&&(numberOne < numberThree)){
			System.out.println(numberOne + " is your smallest value.");
		}
		if ((numberOne > numberTwo)&&(numberTwo < numberThree)){
			System.out.println(numberTwo + " is your smallest value.");
		}
		if ((numberOne > numberThree)&&(numberTwo > numberThree)){
			System.out.println(numberThree + " is your smallest value.");
		}
		
	}
}
