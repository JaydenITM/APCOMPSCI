/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int zn = (int)(Math.random()*9);
		int oh = (int)(Math.random()*100);
		double val1 = 2.5;
		double val2 = 3.5;
		int val3 = 14;
		int val4 = 589;
		double tt = (double)(val1 + Math.random()*(val2-val1));
		double ff = (double)(val3 + Math.random()*(val4-val3));
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(zn); 
		System.out.println(oh); 
		System.out.println(tt); 
		System.out.println(ff); 
	}
}
