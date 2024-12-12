/*
 *	Author:  Jayden Lee
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Please enter your name (first and last name with space): ");
		String name = sc.nextLine();
		
		String [] arr = new String[name.length()];
		
		int z = 1;
		for(int i = 0; i < name.length(); i++){
			arr[i] = name.substring(i, z);
			z++;
		}
		
		
		
		for(int count = 0; count < name.length(); count++){
			if(arr[count].equals(" ")){
				System.out.print("Your last name is: ");
				String Lname = name.substring(count+1, name.length());
				System.out.print(Lname);
			}
		}

		
	}
}
