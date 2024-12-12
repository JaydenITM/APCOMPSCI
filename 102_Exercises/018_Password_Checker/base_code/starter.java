import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
		int firstStrength = 0;
		int secondStrength = 0;
		int thirdStrength = 0;
		
		for(int x = 0; x < count; x++){
		    String passValue = passwords[x];
		    if((passValue.length() > 7) && !(passValue.contains("!")) && !(passValue.contains("@")) && !(passValue.contains("#")) && !(passValue.contains("$")) && !(passValue.contains("%")) && !(passValue.contains("^")) && !(passValue.contains("&")) && !(passValue.contains("*"))){
		        firstStrength++;
		    }
		    
		    if((passValue.contains("!")) || (passValue.contains("@")) || (passValue.contains("#")) || (passValue.contains("$")) || (passValue.contains("%")) || (passValue.contains("^")) || (passValue.contains("&")) || (passValue.contains("*"))){
		        secondStrength++;
		    }
		    
		    if((passValue.length() > 7) && ((passValue.contains("!")) || (passValue.contains("@")) || (passValue.contains("#")) || (passValue.contains("$")) || (passValue.contains("%")) || (passValue.contains("^")) || (passValue.contains("&")) || (passValue.contains("*")))){
		        thirdStrength++;
		    }
		}
		
		System.out.print("First strength:");
		System.out.println(firstStrength);
		System.out.print("Second strength:");
		System.out.println(secondStrength);
		System.out.print("Third strength:");
		System.out.println(thirdStrength);
	}
}
