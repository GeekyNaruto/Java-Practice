package day2;

public class Largest {

	public static void main (String[] args) {
		
		// to find out largest of three numbers
		
		int a=101, b=20, c=30;
		
		System.out.println("Given numbers are a: "+a+", b: "+b+", &c: "+c);
		
		if(a>b && a>b) 
		{
			System.out.println("Greatest number is a: "+a);
		} 
		else if (b>a && b>c)
		{
			System.out.println("Greatest number is b: "+b);
		} 
		else
		{
			System.out.println("Greatest number is c: "+c);
		}
		
	}
}
