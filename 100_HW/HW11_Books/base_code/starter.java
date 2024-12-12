/*
 *	Author:Jayden lee
 *  Date: 11/17/24
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
		    System.out.print("What action would you like to take?\n" +
		                     "1. Check text file (file)\n" +
		                     "2. Print the text given (print)\n" +
		                     "3. Print the text backwards (printBack)\n" +
		                     "4. Print a certain number of words (printNum)\n" +
		                     "5. Change the text file (change)\n" +
		                     "6. Check the number of words in a text (check)\n" +
		                     "7. Most common word (common)\n");
		    String pick = sc.nextLine();
		    System.out.println();
		
		    // Your code goes here.
		    pick = pick.toLowerCase();
		    if(pick.equals("file")){
		        System.out.println(pick);
		    }
		    else if(pick.equals("print")) {
		        printArray(arr);
		    }
		    else if(pick.equals("printback")){
		        printArrayBack(arr);
		    }
		    else if(pick.equals("printnum")){
		        System.out.println("How many words of the text would you like to print?");
		        int answer =  sc.nextInt();
		        if(answer > arr.length){
		            System.out.println("The number is too large");
		        }
		        else {
		            printNumber(arr, answer);
		        }
		    }
		    else if(pick.equals("change")){
		        System.out.println("What is the file name of the text? (Ex: joe.txt)");
		        textFile = sc.nextLine();
		        arr = fillArray(textFile);
		    }
		    else if(pick.equals("check")){
		        System.out.println("What word/phrase would you like to check? ");
		        String answer1 = sc.nextLine();
		        System.out.println("There were " + checkArray(arr, answer1) + " many " + answer1 + " in " + textFile );
		    }
		    else if(pick.equals("common")){
		        System.out.println("The most common word is " + mostCommon(arr));
		        System.out.print("");
		    }
		    System.out.println("---------------------------------------------------------------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printArray method prints the entire array given.
	*/
	public static void printArray(String[] arr){
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printArrayBack method prints the entire array given in opposite order.
	*/
	public static void printArrayBack(String[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print (arr[i] + " ");
        }
    }


	/* ---------------------------------------------------------------------------------------
		The printNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
		This should immediately end the method.
	*/
	public static void printNumber(String[] arr, int num){
			for(int i = 0; i < num; i++){
				System.out.print(arr[i] + " ");
			}
		}


	/* ---------------------------------------------------------------------------------------
		The checkArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checkArray(String[] arr, String check){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(check)) {
                c++;
            }
        }

        return c;    // Dummy value, delete when needed.
    }

	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		String mostCount= "";
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			int temp = checkArray(arr,arr[i]);
			if(temp > count){
				mostCount = arr[i];
				count = temp;
			}
		}
		return mostCount;	// Dummy value, delete when needed.
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}
}