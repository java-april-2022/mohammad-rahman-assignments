package com.codingdojo.calculator;

public class testCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
        c.setOperandOne(93.23);
        c.setOperandTwo(28.5);
        c.setOperation('+');
        c.performOperation();
        c.getResults();
        
        c.setOperandOne(-2378.28);
        c.setOperandTwo(892.30);
        c.setOperation('-');
        c.performOperation();
        c.getResults();
        

	}

}
