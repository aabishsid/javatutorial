package com.lambda.demo;

interface Calculatorc {
	 
//	void sum(int input);
	
	int substract(int i1,int i2);
}


public class CalculatorImplC {

	public static void main(String[] args) {
		
//		Calculatorc calculatorc= (input) -> System.out.println("Sum: "+input);
//		calculatorc.sum(394);
		
		
		Calculatorc calculatorc= (i1,i2)->{
		return i2-i1;
		};
		
		System.out.println(calculatorc.substract(8,20));
	}

}

