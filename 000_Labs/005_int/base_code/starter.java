/*
 *	Author:jayden lee
 *  Date:9/6/2024
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        
        int joe5;
        int joe3;
        int joe2;
        int joe1;
        int joe7;
        int joe4;
        int joe10;
        
        joe5 = 5;
        joe3 = 3;
        joe2 = 2;
        joe1 = 1;
        joe7 = 7;
        joe4 = 4;
        joe10 = 10;
        
        System.out.println("1) 5*7/2%3-1 solved is");
        System.out.println(joe5 * joe7 / joe2 % joe3 - joe1);
        
        System.out.println("2) 10%3-4*7+2 solved is");
        System.out.println(joe10 % joe3 - joe4 * joe7 + joe2);
        
        System.out.println("3) (3-7/2*5)%10 solved is");
        System.out.println((joe3 - joe7 / joe2 * joe5) % joe10);
    }
}