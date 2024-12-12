/*
 *	Author: Jayden Lee
 *  Date:10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();
		
		Employee Jay = new Employee(1234, "Jayden", "Lee", 10000000);
		Jay.employeeToString();
		
		michael.raiseSalary(1);
		System.out.println("Michael's salary: "+michael.getSalary());
		System.out.println("Michael's annual salary: "+michael.getAnnualSalary());
		
		Dwight.raiseSalary(2);
		System.out.println("Dwight's salary: "+Dwight.getSalary());
		System.out.println("Dwight's annual salary: "+Dwight.getAnnualSalary());
		
		Jim.raiseSalary(3);
		System.out.println("Jim's salary: "+Jim.getSalary());
		System.out.println("Jim's annual salary: "+Jim.getAnnualSalary());
		
		Pam.raiseSalary(2);
		System.out.println("Pam's salary: "+Pam.getSalary());
		System.out.println("Pam's annual salary: "+Pam.getAnnualSalary());
		
		Jay.raiseSalary(15);
		System.out.println("Jayden's salary: "+Jay.getSalary());
		System.out.println("Jayden's annual salary: "+Jay.getAnnualSalary());
		
		
		
	}
}