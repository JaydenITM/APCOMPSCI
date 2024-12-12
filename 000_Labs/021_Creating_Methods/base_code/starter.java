/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static String add(String a, String b){
		String x = a;
		String y = b;
		//b = sc.nextLine();
		String sum = x+" "+y;
		
		System.out.println(x);
		System.out.println(sum);
		
		return sum;
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Write a sentence: ");
		String er = sc.nextLine();
		System.out.print("Write a sentence: ");
		String br = sc.nextLine();
		System.out.println("Your combined sentence is..");
		add(er, br);

		
	}
}
