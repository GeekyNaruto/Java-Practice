package day6;

import java.util.Scanner;

class Fac
{
	int i, fact=1;
	int num = 5;
	
	void display()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to find it's factorial: ");
		int num = sc.nextInt();
		
		for(i=1;i<=num;i++){    
		    fact=fact*i;    
		}    
		System.out.println("Factorial of "+num+" is: "+fact);  
	    sc.close();
	  }
}

class Factorial
{
public static void main(String [] args) {
	
	Fac obj1 = new Fac();
	obj1.display();
  }
}

  