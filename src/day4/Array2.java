package day4;

import java.util.Scanner;


public class Array2 {

	public static void main(String[] args) {
		
	/*    for (int i=4; i>=1; i--)
	    {
	    	for (int j=1;j<=i;j++)
	    	{
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }  */
		
		int a[] = new int[5]; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array nos: ");
		
	/*	for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(a.length);  */
		
		for(int i=0; i< a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int value:a)
		{
			System.out.println(value);
		}
		sc.close();
	}
}
