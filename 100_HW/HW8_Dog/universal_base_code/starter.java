/*
 *	Author:Jayden Lee 
 *  Date:10.27.24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		
		Dog barky = new Dog("Barky");
		barky.setAge(14);
		boolean x = barky.isSleeping();
		if(x){
			barky.bark();
		}
		else{
			System.out.println("It's sleeping!");
		}
		
		Dog cookie = new Dog("Cookie", "White");
	
		if(x){
			cookie.bark();
		}
		
	}
}
