package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "user";
		Double salary = 30000.0; 
		
		TaxCalculator calc = new TaxCalculator();
        
		calc.printName(user);
		calc.printSalary(salary);
		calc.calculator(salary);
		
	}

}
