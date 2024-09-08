package day8;

interface Shape
{
	int x=100;
	
	void m1();   // abstract method
	
	default void m2()  //default method
	{
		System.out.println("this is square");
	}
	
    static void m3()   //static method
    {
    	System.out.println("this is rectangle");
    }

}

public class Interface1 implements Shape 

{

	public void m1()  // need to implement abstract method first
	{
		System.out.println("this is circle");
	}
	
	public static void main(String[] args) {
		
	/*	Interface1 obj = new Interface1();
		
		obj.m1();
		obj.m2();
	    Shape.m3();; */
		
		Shape obj1 = new Interface1();
		
        obj1.m1();
        obj1.m2();
        Shape.m3();
	}

}
