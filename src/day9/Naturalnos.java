package day9;

import java.util.Scanner;

class A{
	
	int a,b;
	int add()
	{
		int sum = a+b;
		return sum;
	}
}

public class Naturalnos extends A 

{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		A obj = new A();
		System.out.print("Enter first: ");
		obj.a = sc.nextInt();
		System.out.print("Enter second: ");
		obj.b=sc.nextInt();
		
		
		System.out.println("sum is :"+obj.add());
		
		
		//sum of first 1000 natural nos
	/*	int sum=0, n=1000;
		
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);   */
		
		// print first 10 integers
	/*	for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{System.out.println(i);}
		}   */
		
		
		
	}

}
