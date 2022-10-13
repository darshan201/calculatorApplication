package com.application.calculatorApplication;

import java.util.Scanner;

import customException.NotDivideByZeroException;

public class Calculation {

	Scanner inputnumber = new Scanner(System.in);
	public static int firstnumber;
	public static int secondnumber;
	public String operatorinput;

	public void firstinput() {

		System.out.println("please  enter  firstnumber : ");
		try {
			firstnumber = Integer.parseInt(inputnumber.next());
		} catch (NumberFormatException e) {
			System.out.println("please enter in valid number form");
			firstinput();
		}
	}

	public void operatorandsecondinput() throws NotDivideByZeroException {

		System.out.println("select operation from ::: ' +' , '-' , ' *' , ' /'  ");

		operatorinput = inputnumber.next();

		try {
			System.out.println("please enter  secondnumber : ");
			secondnumber = Integer.parseInt(inputnumber.next());
		} catch (NumberFormatException e) {

			System.out.println("please enter in valid number form");
			operatorandsecondinput();
		}

		Operations op1 = new Operations();
		switch (operatorinput) {
		case "+":
			op1.getaddition();
			break;
		case "-":
			op1.getsubstraction();
			break;
		case "*":
			op1.getmultiplication();
			break;
		case "/":
			try {
				op1.getdivision();
				
			} catch (NotDivideByZeroException e) {
				System.out.println("it can not divid by ZERO"+ e);
			}
			break;
		default:
			System.out.println("enter valid operator");

			break;
		}
	}
}
