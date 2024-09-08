package day6;

import java.util.Scanner;

class Fib
{
	int x=0, y=1;
	void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many steps u need: ");
		int a = sc.nextInt();
	System.out.print(x+" "+y+" ");

	for (int i=1; i<=a-2; i++)
	{
		int c = x+y;
		System.out.print(c+" ");
		x=y;
		y=c;
	}
	sc.close();  }
}

public class Fibseries {

	public static void main(String[] args) {
		
	 Fib obj = new Fib();
		obj.display();
		

	}

}
