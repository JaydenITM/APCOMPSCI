/*
 *Author:  Jayden Lee
 *  Date: 11/9/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        // Your code goes below here
        int a = (int)(Math.random()*150) + 51;
        int [] arr = new int [a];
        System.out.println("There are " + a + " elements!");
        for(int b = a; b > 0; b--){
            int c = b - 1;
            arr[c] = (int)(Math.random()*99)+1;
        }
        int minnum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minnum){
                minnum = arr[i];
            }
        }
         System.out.println("The minimum integer in the array is " + minnum);
        int maxnum = arr[0];
        for(int d = 0; d < arr.length; d++){
            if(arr[d] > maxnum){
                maxnum = arr[d];
            }
        }
        System.out.println("The maximum integer in the array is " + maxnum);
        int average = 0;
        for(int o = 0; o < a; o++){
            average = average + arr[o];
        }
        average = average/ a;
        System.out.println("The agerage of the array is " + average);




    }
}