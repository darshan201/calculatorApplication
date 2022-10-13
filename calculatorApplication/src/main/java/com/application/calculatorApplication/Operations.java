package com.application.calculatorApplication;

public class Operations extends Calculation {

	int result;

	public void getmultiplication() {
		result = firstnumber * secondnumber;
		System.out.println("Result : "+result);

	}

	public void getsubstraction() {
		result = firstnumber - secondnumber;
		System.out.println("Result : "+result);
	}

	public void getaddition() {
		result = firstnumber + secondnumber;
		System.out.println("Result : "+result);
	}

	public void getdivision() {
		result = firstnumber/secondnumber;
		System.out.println("Result : "+result);
	}
}
