package day6;

class A
{
	int a=10,b=20;
	void display()
	{
		System.out.println(a+b);
	}
   
} 

class B extends A
{
	int c=100;
	void show()
	{
		System.out.println(c);
	}
}

class C extends B
{
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
}

class D extends A
{
	int multiply(int x,int y)
	{
		return x+y;
	}
}

class E extends D
{
  	int multiply(int a,int b,int c) // method overloading
  	{
  		return a*b*c;
  	}
  	
  	int multiply(int x, int y)  // method overriding
  	{
  		return x*y*2;
  	} 

}

public class Inheri {

	public static void main(String[] args) {
		
	//	A obj1 = new A();
	//	obj1.display();
        
	//	B obj2 = new B();
	//	obj2.show();
	//	obj2.display();
	//	System.out.println("");
	/*	C obj3 = new C();
		obj3.add(20, 30);
		obj3.display();
		obj3.show(); */
		
	/*	D obj4 = new D();
		System.out.println(obj4.multiply(5, 6));
		obj4.display();		*/
		
		E obj5 =new E();
		System.out.println(obj5.multiply(2, 3, 1));
		obj5.display();
	}

}
