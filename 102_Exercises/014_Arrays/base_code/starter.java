/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int i = 0;
		int ii = 3;
		int [] arr = new int[1000];
		
		int i2 = 0;
		int ii2 = 1000;
		int [] arr2 = new int[1000];
		
		while (i < arr.length){
			arr[i] = ii;
			System.out.print(arr[i]+", ");
			ii = ii+3;
			i++;
		}
		
		System.out.println("-----------------------------------------------");
		
		while (i2 < arr2.length){
			arr2[i2] = ii2;
			System.out.print(arr2[i2]+", ");
			ii2 = ii2-1;
			i2++;
		}
	}
}
