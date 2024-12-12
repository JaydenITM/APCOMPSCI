/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public String Role(String role){
		System.out.println("----------------------------------");
		System.out.println("Role: "+role);
		return role;
	}
	
	public static int printStats(int a, int b, int c, int d){
		int ab = a;
		int bb = b;
		int cb = c;
		int db = d;
		System.out.println("Strength: "+ab+"\nDexterity: "+bb+"\nIntelligence: "+cb+"\nCharisma: "+db);
		return a+b+c+d;
	}
}
