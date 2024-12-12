/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int start;
		int stop;
		
		System.out.print("Enter a name: ");
		String nameVal = sc.nextLine();
		
		System.out.print("Number of times name is shown: ");
		int NoT = sc.nextInt();
		
		start = 0;
		stop = NoT;
		
		while (start < stop)
		{
			System.out.println(nameVal);
			
			start = start + 1;
			
			if (start >= stop){
				break;
			}
		}
		
	}
}
