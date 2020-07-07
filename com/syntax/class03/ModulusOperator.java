package com.syntax.class03;

public class ModulusOperator {

	public static void main(String[] args) {
		double d1 = 12.5;
		double d2 = 4.7;
		double result = d1 / d2;
		System.out.println(result);

		System.out.println("-------------------------");

		double num1 = 14;
		double num2 = 4;
		double div = num1 / num2;
		System.out.println("If we divide doubles the result is " + div);

		System.out.println("-------------------------");

		int i = 14;
		int j = 4;
		int result2 = i / j; // 1.5
//		double result3 = i / j;		

		System.out.println("The division is " + result2);
//		System.out.println(result3); // 1.0

		int mod = i % j;
		System.out.println("The remainder is " + mod);
		
		System.out.println("-------------------------");
		
		i = 17;
		j = 4;
		
		mod = i % j;
		System.out.println(mod);
		
	}
}
