package day5part1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter first no a: ");
		int a = sc.nextInt();
		System.out.println("Enter second no b: ");
		int b = sc.nextInt();
		
		int t = b;
		b=a;
		a=t;
		System.out.println("After swapping nos are: a: "+a+" b: "+b);
		sc.close();
		
	}

}
