/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    //Global Variables
    String model;
    double maxSpeed;
    boolean isElectric;
    String Color;
    
    //Constructors
    public Car(){
        model = "bus";
        maxSpeed = 1.1;
        isElectric = false;
        Color = "Blue&Red";
    }
    
    public Car(String m, double s, String c){
        model = m;
        maxSpeed = s;
        isElectric = false;
        Color = c;
    }
    
    //Methods
    public void Paint(String c){
        Color = c;
    }
    
    public void Vroom(){
        int count = 0;
        while(count < maxSpeed){
            System.out.println(model + " goes vroom");
            count = count+10;
        }
       
    }
    
    public String getModel(){
        return model;
    }
}