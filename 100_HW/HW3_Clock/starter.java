/*
 *	Author:Jayden Lee
 *  Date:9/20/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What day is it?");
		System.out.println("Input a value 1-7 that correlates to Monday thorugh Sunday");
		int day = sc.nextInt();
		if ((day <= 5)&&(day > 0)){
			System.out.println("It is a weekday!");
			System.out.println("Wake up at 7:00AM!");
		}
		else if ((day >= 6)&&(day < 8)){
			System.out.println("It is a weekend!");
			System.out.println("Wake up at 10:00AM!");
		}
		else{
			System.out.println("No day that corrilates to ");
		}
	}
}
