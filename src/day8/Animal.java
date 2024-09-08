package day8;

public interface Animal {
	
	String s = "Tiger";
	
	void m1();  // abstract method
	
	default void m2()   // default method
	{
		System.out.println("This is cat");
	}

	static void m3()      // static method
	{
		System.out.println("this is lion");
	}
}
