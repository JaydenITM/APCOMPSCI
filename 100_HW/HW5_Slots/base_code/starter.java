/*
 *	Author:jayden lee
 *  Date:10/6/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		int moneyValue = 100;
		
		System.out.println("Slot machine RULES:\n1. Each player starts with $100\n2. Input a wager les than your total amount of money\n3. The slot machine will roll 3 numbers from 1 to 10"); 
		System.out.println("	a. If two numbers match, you will double your money\n	b. If three numbers match, you will triple your money\n	c. If none match, you lose your momey");
		System.out.println("---------------------------------------------------");
		
		while (moneyValue > 0){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y):");
			String answer = sc.nextLine();
			if ((answer.equals("Yes"))||(answer.equals("yes"))||(answer.equals("Y"))||(answer.equals("y"))){
				System.out.print("You have $"+moneyValue+". How much would you like to wager?: ");
				int enteredValue = sc.nextInt();
				sc.nextLine();
				if (enteredValue <= moneyValue){
					moneyValue = moneyValue - enteredValue;
				
					System.out.println("Great! Let's play!!!\nYour rolls are:");
				
					System.out.println("_______________________");
					int random1 = (int)(Math.random()*10);
					int random2 = (int)(Math.random()*10);
					int random3 = (int)(Math.random()*10);
				
					System.out.println("|"+random1+"|"+random2+"|"+random3+"|");
					System.out.println("_______________________");
				
					if ((random1 == random2)&&(random3 != random2)){
						System.out.println("You won! You're wager has now been doubled!");
						moneyValue = moneyValue + enteredValue*2;
						System.out.println("You now have... $"+moneyValue);
						System.out.println("--------------------------------------------------");
					}
					if ((random2 == random3)&&(random1 != random3)){
						System.out.println("You won! You're wager has now been doubled!");
						moneyValue = moneyValue + enteredValue*2;
						System.out.println("You now have... $"+moneyValue);
						System.out.println("--------------------------------------------------");
					}
					if ((random1 == random3)&&(random2 != random3)){
						System.out.println("You won! You're wager has now been doubled!");
						moneyValue = moneyValue + enteredValue*2;
						System.out.println("You now have... $"+moneyValue);
						System.out.println("--------------------------------------------------");
					}
					if ((random1 == random2)&&(random2 == random3)){
						System.out.println("You won! You're wager has now been tripled!");
						moneyValue = moneyValue + enteredValue*3;
						System.out.println("You now have... $"+moneyValue);
						System.out.println("--------------------------------------------------");
					}
					if ((random1 != random2)&&(random2 != random3)){
						System.out.println("Didn't win this time, better luck next time!");
						moneyValue = moneyValue + enteredValue*0;
						System.out.println("You now have... $"+moneyValue);
						System.out.println("--------------------------------------------------");
					}
					if (moneyValue == 0){
						System.out.println("\nYou've run out of money! Thanks for coming! Come back soon!");
						break;
					}
				}
				else if(enteredValue > moneyValue){
					System.out.println("You do not have enough money.");
				}
				else if(enteredValue < 0){
					System.out.println("Money cannot be negative");
				}
			}
			else if ((answer.equals("No"))||(answer.equals("no"))||(answer.equals("N"))||(answer.equals("n"))){
				System.out.println("Sorry to see you go. See you next time!");
				break;
			}	
			else{
				System.out.println("That wasn't quite the correct answer. Try again.\n--------------------------------------------------");
			}
		}
	}
}