package com.AccessModifiers;

import com.ControlStatements.AccessModifiers;

public class TestAccessOutsidePackage extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers objAccessModifiers = new AccessModifiers();
		
		//objAccessModifiers.strName; //Cannot access default varialbe outside the package
		objAccessModifiers.stringLength();
		
		TestAccessOutsidePackage objTestAccessOutsidePackage = new TestAccessOutsidePackage();
		objTestAccessOutsidePackage.intNumber=35; //Accessed protected variable through inheritance
		objTestAccessOutsidePackage.evenOddCalculation();
		
		objAccessModifiers.strCityName="Banglore"; //Accessing public variable outside the package 
		objAccessModifiers.printCityName();
		
		objTestAccessOutsidePackage.strCityName="Hyderabad"; //Accessing public variable outside the package through inheritance
		objTestAccessOutsidePackage.printCityName();

	}

}
