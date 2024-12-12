/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();
		
		while(true){
			if(input.indexOf(" ") == -1){
				break;
			}
			int space = input.indexOf(" ");
			String word = input.substring(0, space);
			System.out.println(SpongeCase(word)+" ");
			
			input = input.substring(space+1);
			
		}
		
	}
	public static String SpongeCase(String word){
	
	
		String result = "";
		
		
		for(int i = 0; i < input.length(); i++){
			if(i%2 == 0){
				
				letter = letter.toUpperCase();
			}
			else{
				letter = letter.toLowerCase();
			}
			result = letter+result;
		}
		return result;
	}
}
