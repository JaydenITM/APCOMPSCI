/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/

import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input = sc.nextLine();
        
        int space = input.indexOf(" ");
        String word1 = input.substring(0, space);
        
        int space2 = input.indexOf(" ", space+1);
        String word2 = input.substring(space+1, space2);
        
        System.out.println(word1);
        System.out.println(word2);
        
        while(true){
            
            
            int firstSpace = input.indexOf(" ");
            String firstWord = input.substring(0, firstSpace);
            System.out.println(firstWord);
            input = input.substring(firstSpace+1);
            
            if(input.indexOf(" ") == -1){
                System.out.println(input);
                break;
            }
        }
        
	}
}