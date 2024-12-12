/*
 *	Author: Jayden Lee
 *  Date:9/11
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a nummber: ");
	int input = sc.nextInt();
	
	int valadd1 = input+1;
	int valadd2 = input+2;
	int valadd3 = input+3;
	int valadd4 = input+4;
	
	int val1 = input*2;
	int val2 = input*3;
	int val3 = input*4;
	int val4 = input*5;
	
	System.out.println("Next 5 numbers: "+input+", "+valadd1+", "+valadd2+", "+valadd3+", "+valadd4);
	System.out.println("Multiples of your number: "+input+", "+val1+", "+val2+", "+val3+", "+val4);
	System.out.println("Your number divided by 100: "+(input/100.0));
	System.out.println("Your number divided by 10: "+(input/10.0));
	}
}
