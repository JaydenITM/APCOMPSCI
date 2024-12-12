/*
 *	Author:Jayden Lee 
 *  Date:10.27.24
*/

package pkg;

import java.util.Random;

public class Dog {

    String name;
    int age;
    String breed;

    public Dog() {
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }

    public Dog(String dogName) {
        name = dogName;
        age = 1;
        breed = "dog dog";
    }

    public Dog(String dogName, String dogBreed) {
        name = dogName;
        age = 1;
        breed = dogBreed;
    }

    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
        breed = "dog dog";
    }

    public void setName(String x) {
        name = x;
    }

    public void setAge(int x) {
        age = x;
    }

    public void setBreed(String x) {
        breed = x;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

	public boolean isSleeping(){
		int x = (int)(Math.random()*2);
		if(x == 0){
			return false;
		}
		else{
			
			return true;
		}
	}

    public void bark() {
        System.out.println(name + " is barking right now!");
    }
}

	
