/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman test = new Spiderman();
		test.setActor("Tobey Maguire");
		test.setAge(49);
		test.setvillain("Caleb");
		
		Spiderman two = new Spiderman("Andrew Garfield");
		two.setAge(41);
		two.setvillain("Jayden");
		
		Spiderman three = new Spiderman("John Mulaney", 42);;
		three.setvillain("Jonah");
		
		System.out.println("The villain is " + three.getvillain());
	}
}
