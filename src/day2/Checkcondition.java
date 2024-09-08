package day2;

public class Checkcondition {
	
	public static void main (String[] args) {
		
		int a = 110;
		int b = 58, c = a+b;
		
		if (a<b)
		{
		   System.out.println("a is smaller than b");	
		}
		else
		{
		  System.out.println("a is greater then b");
		}
		
		System.out.println("sum of a & b is "+c);
		System.out.println(a+" "+b+" "+c);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a-b);
		System.out.println(a!=b);
	}
	
}