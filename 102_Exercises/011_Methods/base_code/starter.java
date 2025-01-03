/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static boolean isLeapYear(int a){
		int year = a;
		int checker = year%4;
		if (checker == 0){
			return true;
		}
		else{
			return false;
		}
		
		//reutrn y%4 == 0;
	}
	
	public static int getDigitSum(int b) {
	    int numberInput = b;
	    int firstDigit = numberInput % 10; 
	    numberInput /= 10;                  
	    int secondDigit = numberInput % 10; 
	    numberInput /= 10;                  
	    int thirdDigit = numberInput % 10;  
	    numberInput /= 10;                  
	    int fourthDigit = numberInput % 10;
	    numberInput /= 10;                 
	    int fifthDigit = numberInput % 10;  
	
	    int sum = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
	    return sum;
	}
	
	public static void printIfConsecutive(int a, int b, int c){
		int c1 = a;
		int c2 = c1 + 1;
		int c3 = c2 + 1;
		if ((a == c1)&&(b == c2)&&(c == c3)){
			System.out.println("These numbers are consecutive!!!");
		}
		else{
			System.out.println("These numbers are not consecutive!!!");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
