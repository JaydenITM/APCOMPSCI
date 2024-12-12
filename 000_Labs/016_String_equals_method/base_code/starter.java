/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose to be a.. Wizard | Warrior | Rogue");
		System.out.print("Enter: ");
		String Char = sc.nextLine();
		//System.out.println(joe.equals("pizza"));
		if((Char.equals("wizard"))||(Char.equals("warrior"))||(Char.equals("rogue"))||(Char.equals("Wizard"))||(Char.equals("Warrior"))||(Char.equals("Rogue"))){
			System.out.println("Great choice! You are now a "+ Char);
			
		}
		else{
			System.out.print("You have entered an INVALID character");
		}
	}
}
