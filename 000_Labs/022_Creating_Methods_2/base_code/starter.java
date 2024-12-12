/*
 *	Author:  Jayden Lee
 *  Date: 10/8/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b) {

		int PowValue = 1;
		//PowValue = (int)(Math.pow(x, y));
		
		while(b != 0){
			PowValue = PowValue*a;
			
			b--;
		}
		
		return PowValue;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a base: ");
		int xVal = sc.nextInt();
		System.out.print("Give a power: ");
		int yVal = sc.nextInt();
		int result = pow(xVal, yVal);
		
		System.out.println(xVal+" to the power of "+yVal+" is "+result);
		
	}
}
