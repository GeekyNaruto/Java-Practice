package day8.type1;

class P{
	
	void A()
	{
		System.out.println("Parent");
	}
	
}
public class Child extends P
{
	
	void A()                           // method overriding
	{
		System.out.println("Child");
		super.A();                      // to access parent 
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.A();

	}

}
