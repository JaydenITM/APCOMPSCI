/*
 *	Author:  Jayden Lee
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Character name: ");
		String name = sc.nextLine();
		System.out.print("Chracter title: ");
		String title = sc.nextLine();
		
		System.out.println(name + ", choose to be a.. Wizard | Warrior | Rogue");
		System.out.print("Enter: ");
		String Char = sc.nextLine();
		//System.out.println(joe.equals("pizza"));
		if((Char.equals("wizard"))||(Char.equals("warrior"))||(Char.equals("rogue"))||(Char.equals("Wizard"))||(Char.equals("Warrior"))||(Char.equals("Rogue"))){
			System.out.println("Great choice! You are now a " + Char);
		}
		else{
			System.out.println("You have entered an INVALID character");
			Char = "INVALID";
		}
		
		int points = 20;
		int s;
		int d;
		int i;
		int c;
		points = 20;
		s = 0;
		d = 0;
		i = 0;
		c = 0;
		
		System.out.println("You have 20 skill points to use on.. Strength | Dexterity | Intelligence | Charisma ");
		
		System.out.print("Strength (0-10) : ");
		s = sc.nextInt();
		if((s>10)||(s<0)||(s>points)){
			System.out.println("INVALID");
			System.out.println(points + " points left");
			s = 0;
		}
		else{
			points = (points - s);
			System.out.println(s + " points added to STRENGTH");
			System.out.println(points + " points left");
		}
		
		System.out.print("Dexterity (0-10) : ");
		d = sc.nextInt();
		if((d>10)||(d<0)||(d>points)){
			System.out.println("INVALID");
			System.out.println(points + " points left");
			d= 0;
		}
		else{
			points = (points - d);
			System.out.println(d + " points added to DEXTERITY");
			System.out.println(points + " points left");
		}
		
		System.out.print("Intelligence (0-10) : ");
		i = sc.nextInt();
		if((i>10)||(i<0)||(i>points)){
			System.out.println("INVALID");
			System.out.println(points + " points left");
			i = 0;
		}
		else{
			points = (points - i);
			System.out.println(i + " points added to INTELLIGENCE");
			System.out.println(points + " points left");
		}
		
		System.out.print("Charisma (0-10) : ");
		c = sc.nextInt();
		if((c>10)||(c<0)||(c>points)){
			System.out.println("INVALID");
			System.out.println(points + " points left");
			c = 0;
		}
		else{
			points = (points - c);
			System.out.println(c + " points added to CHARISMA");
			System.out.println(points + " points left");
		}
		System.out.println("Your name and title: " + name + ", " + title);
		System.out.println("Your role: " + Char);
		System.out.println("Your strength level: " + s);
		System.out.println("Your dexterity level: " + d);
		System.out.println("Your intelligence level: " + i);
		System.out.println("Your charisma level: " + c);
		System.out.println("Points left: " + points);
	}
}
