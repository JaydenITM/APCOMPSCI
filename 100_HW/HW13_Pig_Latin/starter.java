/*
 *	Author: JAyden Lee
 *  Date: 12/8/24
*/

import java.util.*;

class starter {
	
	public static String words(String x){
		String [] letters = new String [x.length()];
		
		for(int i = 0; i < letters.length; i++){
			letters[i] = x.substring(i,i+1);
		}
		
		int i = 0;
		String holder = new String ("");
		int c = 0;
		while(true){
			//System.out.println("starting next word, i = " + i);
			if (i == letters.length) {
							
							System.exit(0);
			}
			if(letters[i].equals("a") || letters[i].equals("A") || letters[i].equals("e") || letters[i].equals("E") || letters[i].equals("i") || letters[i].equals("I") || letters[i].equals("o") || letters[i].equals("O") || letters[i].equals("u") || letters[i].equals("U")){
					c = 0;
					while(true){
						if (i+c == letters.length) {
							System.out.print("-way ");
							System.exit(0);
						}
						else if(letters[i+c].equals(" ")){
							
							System.out.print("-way ");
							break;
							
						}
						else{
							System.out.print(letters[i+c]);
						}
						c++;
					}
					i = i + c+1;
			}
			else{
				if (i+1 == letters.length) {
							
							System.exit(0);
						}
				if(letters[i+1].equals("a") || letters[i+1].equals("A") || letters[i+1].equals("e") || letters[i+1].equals("E") || letters[i+1].equals("i") || letters[i+1].equals("I") || letters[i+1].equals("o") || letters[i+1].equals("O") || letters[i+1].equals("u") || letters[i+1].equals("U")||letters[i+1].equals("y")||letters[i+1].equals("Y")){
					c = 1;
					//System.out.println("2");
					while(true){
						
						if (i+c == letters.length) {
							System.out.print("-"+letters[i]+"ay ");
							System.exit(0);
							
						}
						else if(letters[i+c].equals(" ")){
						
							System.out.print("-"+letters[i]+"ay ");
							break;
						}
						else{
							System.out.print(letters[i+c]);
						}
						c++;
					}
					i = i + c+1;
					//System.out.println("End of word, i="+i+", c="+c);
				}
				
				else{
					c = 2;
					
					while(true){
						if (i+c == letters.length) {
							System.out.print("-"+letters[i]+letters[i+1]+"ay ");
							System.exit(0);
						}
						else if(letters[i+c].equals(" ") ){
							
							System.out.print("-"+letters[i]+letters[i+1]+"ay ");
							break;
						}
						else{
							System.out.print(letters[i+c]);
						}
						c++;
					}
					i = i + c+1;
				}
				//System.out.println("i = "+ i);
			} // end else
			
		} // end while
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a sentance: ");
		String pig = sc.nextLine();
		System.out.print(words(pig));
		
	}
}
