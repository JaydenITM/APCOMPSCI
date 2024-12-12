/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		int y = 5;
		
		boolean equal = (x == y);
		
        if (equal)
        {
            System.out.println(x + " is equal to " + y);
        }else{
        	System.out.println(x + " is not equal to " + y);
        }
	}
}
