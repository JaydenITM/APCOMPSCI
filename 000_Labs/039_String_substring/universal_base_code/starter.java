/*
 *Author:  Jaydne
 *  Date: 11/22/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Input a word"); 
		String word = sc.nextLine(); 
		int x = 1; 
		for(int i = 0; i  < word.length(); i++){
		System.out.println(word.substring(i, x));
		x++; 
		}
		
	}
}