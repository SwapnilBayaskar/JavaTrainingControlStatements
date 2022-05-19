package com.ControlStatements;

public class IfElseConditionalStatement {
	
	//If Statement
	public void simpleIfStatement(int intNum1, int intNum2) {
		
		if((intNum1+intNum2)>20) {
			
			System.out.println("Addition of two numbers is greater than 20");
			
		}
	}
	
	//If else statement
	public void ageValidationForVoting(int intAge) {
		
		if(intAge >= 18) {
			
			System.out.println("Person is eligible for Voting");
			
		}else {
			
			System.out.println("Person is not eligible for Voting");
			
		}
	}
	
	//If else if Statement
	public void toFindTheGreatestNumber(int intNum1, int intNum2, int intNum3) {
		
		if(intNum1>intNum2 && intNum1>intNum3) {
			
			System.out.println("Number 1 is the Greatest number");
			
		}else if(intNum2>intNum1 && intNum2>intNum3) {
			
			System.out.println("Number 2 is the Greatest Number");
			
		}else {
			
			System.out.println("Number 3 is the Greatest Number");
			
		}
	}
	
	//Nested if else Statement
	public void eligibilityForJob(int intAge, int intHeight) {
		
		if(intAge >= 18) {
			
			if(intHeight > 150) {
				
				System.out.println("You are Eligible for Job");
				
			}else {
				
				System.out.println("Your height is less than 150cm, not eligible");
				
			}
			
		}else {
			
			System.out.println("Your age is less than 18, not eligble");
		}
		
	}

}
