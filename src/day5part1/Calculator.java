package day5part1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Select an operator: +,-,*,/");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		if (operator =='+')
		{
			System.out.println("Addition is qual to "+(a+b));
		}
		else if (operator =='-')
		{
			System.out.println("Subtraction is qual to "+(a-b));
		}
		else if (operator =='*')
		{
			System.out.println("Multiplication is qual to "+(a*b));
		}
		else if (operator =='/')
		{
			if(b!=0) {
			System.out.println("Division is qual to "+(a/b));
		}
			else {
				System.out.println("Not possible");
			}
			
		}
		else
		System.out.println("Invalid input");
		
       sc.close();
	}

}
