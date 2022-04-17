
package com.codingdojo.calculator;


public class Calculator {

	private double operand1;
	private double operand2;
	private char operator; 
	private double result;
	
	
	public Calculator() {}
	
	
	public void setOperandOne(double input) {
		this.operand1 = input;
	}
	
	
	public void setOperandTwo(double input) {
		this.operand2 = input;
	}
	
	
	public void setOperation(char input) {
		this.operator = input;
	}
	
	
	public void performOperation() {
		if( this.operator == '+') {
			result = (operand1) + (operand2);
		}
		if( this.operator == '-') {
			result = (operand1) - (operand2);
		}
	}
	
	
	public void getResults() {
		System.out.println(result);
	}
	
	

	
}
