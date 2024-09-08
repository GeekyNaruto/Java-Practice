package day5part1;

public class Adder {

	//polymorphism- same method/constructor name
	// it is also known as overloading(method overloading)
	int a,b;
	
	void sum()  // method 1
	{
	  System.out.println(a+b);
	}
	
	public void sum(int x, int y) //method 2
	{
		System.out.println(x+y);
	}
	
	/* void sum(int y, int x) //method 2 (duplicate)
	{
		System.out.println(x+y);
	} */
	
	void sum(int x, double y) //method 3
	{
		System.out.println(x+y);
	}
	
	void sum(int x,int y, int z) //method 4
	{
		System.out.println(x+y+z);
	}
}
