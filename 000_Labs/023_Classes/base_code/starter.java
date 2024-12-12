/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class myCharacter{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public int CharacterStats(int strength, int dexterity, int intelligence, int charisma){
		
		int s = strength;
		int d = dexterity;
		int i = intelligence;
		int c = charisma;
		
		return s+d+i+c;

	}
	
	public String Role(String Role){
		System.out.println("----------------------------------");
		System.out.println("Role: "+Role);
		
		return Role;
	}
	
	public static int printStats(int a, int b, int c, int d){
		System.out.println("Strength: "+a);
		System.out.println("Dexterity: "+b);	
		System.out.println("Intelligence: "+c);
		System.out.println("Charisma: "+d);
		
		return a+b+c+d;
	}
}

class starter {
		
	public static void main(String args[]) {
		// Your code goes below here
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
		
		myCharacter myStats = new myCharacter();
		
		myStats.Role(role);
		myStats.CharacterStats(str, dex, intell, charis);
		myStats.printStats(str, dex, intell, charis);

		
	}
}
