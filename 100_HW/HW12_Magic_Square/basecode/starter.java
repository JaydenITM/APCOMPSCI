import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many special squares you want to see: ");
        int value = sc.nextInt();
        
        int count = 0;
        int start = 1;
        
        while (count<value){
            int product = start*start;
            
            int sum = 0;
            for (int k = 1; sum<product; k++) {
                sum += k;
                
                if (sum == product) {
                    System.out.println(product);
                    count++;
                    break;
                }
            }
            start++;
        }
    }
}