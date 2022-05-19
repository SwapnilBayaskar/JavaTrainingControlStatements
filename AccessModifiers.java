package com.ControlStatements;

public class AccessModifiers {
	
	//1) Private: Accessibility is only within the class.
	//2) Default: It can be accessed only within the package. It cannot be accessed from outside the package.
	//3) Protected: Accessible within the package and from outside the package using inheritance. If not inherited, cannot be accessed from outside the package.
	//4) Public: Accessible everywhere.
	
	private int intMarks; //private
	String strName = "Swapnil"; //default
	protected int intNumber = 12; //protected
	public String strCityName = "Pune"; //public
	
	public void calculateResult() {
		
		intMarks = 36; //Accessed private variable within class
		
		if(intMarks>=35) {
			
			System.out.println("Candidate has passed the examination");
			
		}else {
			
			System.out.println("Candidate has failed in examination");
			
		}
	}
	
	
	public void stringLength() {
		
		System.out.println("Length of the string is : "+strName.length()); //default variable
		
	}
	
	
	public void evenOddCalculation() {
		
		if(intNumber%2 == 0) {
			
			System.out.println("Number is even");
			
		}else {
			
			System.out.println("Number is Odd");
			
		}
	}
	
	public void printCityName() {
		
		System.out.println("I am living in "+strCityName);
		
	}
	
	


}
