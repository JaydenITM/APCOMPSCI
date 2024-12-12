/*
 *Author:  Jayden Lee
 *  Date: 11/9/24
*/

import java.util.*;

class starter {
    public static void main(String args[]) {
        int[] arr = new int[20];
        
        // Populate the array with random numbers between 1 and 10
        for (int i = 0; i < 20; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        
        System.out.println("________________________________________");
        
        // Display the generated array
        System.out.println("These are the 20 numbers:");
        for (int a = 0; a < 20; a++) {
            System.out.print(arr[a] + " ");
        }
        System.out.println("\n________________________________________");
        
        // Generate a random target number to search for in the array
        int target = (int)(Math.random() * 10) + 1;
        System.out.println("The random number to look for is " + target);
        
        int totalDupes = 0;
        
        // Search for the target number and count occurrences
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] == target) {
                System.out.println("Duplicate found at index " + b);
                totalDupes++;
            }
        }
        
        System.out.println("Total number of duplicates for " + target + " is " + totalDupes);
        System.out.println("________________________________________");
        
        // Check for two consecutive identical numbers
        System.out.println("Looking for two in a row:");
        for (int c = 0; c < arr.length - 1; c++) {
            if (arr[c] == arr[c + 1]) {
                System.out.println("Two in a row found at indexes " + c + " and " + (c + 1) + ". The number is " + arr[c]);
            }
        }
    }
}
