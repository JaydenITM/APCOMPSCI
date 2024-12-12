/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter test = new myCharacter();
		
		Scanner sc = new Scanner(System.in);
		//Character wizard = new Character();
		
		System.out.print("Enter Role (wizard|warrior|rogue): ");
		String role = sc.nextLine();
		
		System.out.print("Strength Value: ");
		int str = sc.nextInt();
		
		System.out.print("Dexterity Value: ");
		int dex = sc.nextInt();
		
		System.out.print("Intelligence Value: ");
		int intell = sc.nextInt();
		
		System.out.print("Charisma Value: ");
		int charis = sc.nextInt();
		
		String ha = test.Role(role);
		int la = test.printStats(str, dex, intell, charis);
		
	//	System.out.println("Role: "+ha);
	//	System.out.println(la);
	}
}
