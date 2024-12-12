/*
 *	Author:  jayden lee
 *  Date: 9/20/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Compair two values");
		System.out.print("Enter first value: ");
		int x = sc.nextInt();
		System.out.print("Enter second value: ");
		int y = sc.nextInt();
		
		boolean greaterthan = (x >= y);
		boolean lessthan = (x <= y);
		boolean equal = (x == y);
		
		if (greaterthan)
		{
            System.out.println(x + " is greater than " + y);
        } 
        if (lessthan)
        {
            System.out.println(x + " is less than " + y);
        } 
        if (equal)
        {
            System.out.println(x + " is equal to " + y);
        }
	}
}
