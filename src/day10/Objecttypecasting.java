package day10;

class A
{
    String name = "John";
    
    void m1()
    {
    	System.out.println("First method outpu : "+name);
    }    		
}

class B extends A
{
	int x,y;
	
	int m2()
	{
		return (x+y);
	}
}

public class Objecttypecasting {

	public static void main(String[] args) {
		
	/*	B obj1 = new B();        //child class object created
		
		System.out.println(obj1.name);   // access parent class variable and method
        obj1.m1();
        
        obj1.x=10; obj1.y=20;             // access child class variable and method
		System.out.println(obj1.m2());   */
		
	/*	A obj = new B();  // upcasting of object  // parent type reference variable 
		System.out.println(obj.name);     //not able to access child variable and method
		obj.m1();    */
		
	/*	A obj1 = new A();
		
		B obj2 =(B) obj1;
		
		obj2.m1();   */  // we'll get run type error
		
	}

}
