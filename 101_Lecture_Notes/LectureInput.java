/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
        // Your Code Goes here!
        
        System.out.println("Please enter a number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter another number: ");
        int bob2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these numbers are "+ (bob+bob2));
       
        System.out.println("What is your favorite food? ");
        String food = sc.nextLine();
	}
}