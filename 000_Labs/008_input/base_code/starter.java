/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String text = sc.nextLine();
		
		System.out.println("Hello " + text + ", how old are you?");
		int ageNumber = sc.nextInt();
		
		System.out.println(ageNumber + " years old? How young! What is your Birthday month?");
		sc.nextLine();
		String month = sc.nextLine();
		
		System.out.println(month + "? What day?");
		int Bday = sc.nextInt();
		
		System.out.println(month + " " + Bday + "? What year were you born?");
		int BdayYear = sc.nextInt();
		
		System.out.println(month + " " +Bday + ", " + BdayYear + "? Wow I know a friend with the same birthday as you.");
		System.out.println("Now, how much is a buck fifty?");
		double value = sc.nextDouble();
		
		System.out.println(value + " is a great choice!");
		
		
	}
}
