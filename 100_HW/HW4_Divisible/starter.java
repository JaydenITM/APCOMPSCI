/*
 *	Author: Jayden Lee
 *  Date:9/29/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another Integer: ");
        int num2 = sc.nextInt();
	
		System.out.println("First number:");
        if(num1 % 3 == 0) {
            System.out.println(num1 + " is divisible by 3");
        }
        else{
            System.out.println(num1 + " is not divisible by 3");
        }
        if(num1 % 4 == 0) {
            System.out.println(num1 + " is divisible by 4");
        }
        else{
            System.out.println(num1 + " is not divisible by 4");
        }
        if(num1 % 5 == 0) {
            System.out.println(num1 + " is divisible by 5");
        }
        else{
            System.out.println(num1 + " is not divisible by 5");
        }

        System.out.println("Second number:");
        if(num2 % 3 == 0) {
            System.out.println(num2 + " is divisible by 3");
        }
        else {
            System.out.println(num2 + " is not divisible by 3");
        }
        if(num2 % 4 == 0) {
            System.out.println(num2 + " is divisible by 4");
        }
        else {
            System.out.println(num2 + " is not divisible by 4");
        }
        if(num2 % 5 == 0) {
            System.out.println(num2 + " is divisible by 5");
        }
        else {
            System.out.println(num2 + " is not divisible by 5");
        }
	}
}
