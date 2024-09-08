package day6;

import java.util.Scanner;

class Prim
{
	boolean check(int n)
	{
		
		if(n<=1) {
			return false;
		}
		
		for (int i=2; i<n; i++)
		{
			if(n%i==0) {
			return false;
		}
	 }	
			return true;
		
	}
}

public class Primeno {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int num = sc.nextInt();
		Prim obj3 = new Prim();
		System.out.println("Is it a prime no...answer is: "+obj3.check(num));
	    sc.close();
	}

}

