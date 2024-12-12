/* 
    Lecture note example - If Statements
    
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("You are a student getting ready for school:");
        System.out.println("1. Put on your backpack");
        System.out.println("2. Choose your outfit");
        System.out.println("3. Eat a healthy breakfast");
        
        int answer1 = sc.nextInt();
        
        if (answer1 == 1){
            System.out.println("You have chosen the backpack!");
            System.out.println("What would you like to put in your backpack?");
            System.out.println("1. wallet \n2. lunch \n3. pencil case");
            int answer2 = sc.nextInt();
            if (answer2 == 1){
                System.out.println("Dont forget your money!");
            }
            else if (answer2 == 2){
                System.out.println("Pack something good!");
            }
            else if (answer2 == 3){
                System.out.println("Dont forget your pencils...");
            }
            else{
                System.out.println("You did not choose something within the choices");
            }
        }
        else if (answer1 == 2){
            System.out.println("You chose to wear a nice outfit!");
            System.out.println("What kind of outfit would you like there wear?");
            System.out.println("1. Adventure \n2. Casual outfit \n3. Themed outfit");
            int answer2 = sc.nextInt();
            if (answer2 == 1){
                System.out.println("Are you hiking to school? Haha!");
            }
            else if (answer2 == 2){
                System.out.println("I like your style!");
            }
            else if (answer2 == 3){
                System.out.println("Nice theme, I like it!");
            }
            else{
                System.out.println("You did not choose something within the choices");
            }
        }
        else if (answer1 == 3){
            System.out.println("You chose to eat breakfast first!");
            System.out.println("What kind of breakfast would you like to eat?");
            System.out.println("1. Cereal \n2. Pizza \n3. Scrambled eggs");
            int answer2 = sc.nextInt();
            if (answer2 == 1){
                System.out.println("Good choice for a morning snack!");
            }
            else if (answer2 == 2){
                System.out.println("PIZZA IN THE MORNING???");
            }
            else if (answer2 == 3){
                System.out.println("I love scrambled eggs too.");
            }
            else{
                System.out.println("You did not choose something within the choices");
            }
        }
        else{
            System.out.println("You did not choose something within the choices");
        }
	}
}