package com.ControlStatements;

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers objAccessModifiers = new AccessModifiers();
		
		//objAccessModifiers.intMarks=50; //Private--not accessible outside the class
		objAccessModifiers.calculateResult();
		
		objAccessModifiers.strName="Aakash"; //Accessed default variable
		objAccessModifiers.stringLength();
		
		objAccessModifiers.intNumber=24; //Accessed protected variable within the package
		objAccessModifiers.evenOddCalculation();
		
		objAccessModifiers.strCityName="Mumbai"; //Accessing public
		objAccessModifiers.printCityName();

	}

}
