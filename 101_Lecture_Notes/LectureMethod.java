/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    
    public static void printAnimal(){
        // Your Code Goes here!
        System.out.println("  //");
        System.out.println(" ('>");
        System.out.println(" /rr");
        System.out.println("*\\))_");
        return;
    }
    
    public static void greetingName(String a){
        String name = a;
        System.out.println("Salutations "+name);
        return;
    }
    
    public static double raise(double salary, int percent){
        double a = salary;
        int b = percent;
        
        double finalThing = (a+((b*0.01)*a));
        return finalThing;
    }
    
    public static void main(String args[]) {
        printAnimal();
        System.out.println("What is your name?");
        greetingName("Jayden Lee");
        double raiseNumber = raise(1000, 13);
        System.out.println(raiseNumber);
        raiseNumber = raise(raiseNumber, 13);
        System.out.println(raiseNumber);
	}
}