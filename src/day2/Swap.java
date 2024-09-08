package day2;

public class Swap {
	
	public static void main (String[] args) {
		
		int a=10, b =20;
		
		System.out.println("Value of a is: "+a+" & b is: "+b);
		
		// logic 1
		/*
		a=a+b; // 30
		b=a-b; // 10
		a=a-b; // 30-20 = 10   */
		
		// logic 2
		
	/*	int t = a;
		a=b; 
		b=t;  */
		
		// logic 3
		
	    int c; c = a*b; a = c/b; b = c/a; 
		
		System.out.println("Swapped Values of a is: "+a+" & b is: "+b);
	}
	
}
