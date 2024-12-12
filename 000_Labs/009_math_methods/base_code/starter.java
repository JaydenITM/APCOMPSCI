/*
 *	Author:  Jayden
 *  Date: 9/13
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		double value;
		value = Math.max(13-6*11, 30%7*(-2));
		System.out.println(value);
		
		double value2;
		value2 = Math.sqrt(3*8+31%7);
		System.out.println(value2);
		
		double value3;
		int firstVal;
		int secondVal;
		firstVal = 37/3;
		secondVal = 35%21;
		value3 = Math.pow(firstVal, secondVal);
		System.out.println(value3);
		
		double value4;
		double powValue;
		double sqrtValue;
		powValue = Math.pow(2, 14%3);
		sqrtValue = Math.sqrt(2*6);
		value4 = Math.max(powValue, sqrtValue);
		System.out.println(value4);
		
		System.out.println("Now it's your turn!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a coordinate in the form of (x, y)");
		System.out.print("Enter X value: ");
        double x = sc.nextDouble();
        System.out.print("Enter Y value: ");
        double y = sc.nextDouble();
        
        double output1;
        double output2;
        double output3;
        output1 = Math.max(x, y);
        output2 = Math.sqrt(y);
        output3 = Math.pow(x, y);
        
        System.out.println("The maximum of your X and Y values is " + output1);
        System.out.println("The square root of your Y value is " + output2);
        System.out.println("Your value for X to the power of Y is " + output3);
	}
}
