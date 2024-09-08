package day8.type1;

interface Humans
{
	String s="Homosepians";
	
	void m1();  // abstract method
	
	default void m2()   // default method
	{
		System.out.println("Heterosapians");
	}

	static void m3()   // static method
	{
		System.out.println("Homoerectus");
	}
}

public class Practice1 implements Humans

{
	public void m1()
	{
		System.out.println("Yolo");
	}
	
	public static void main(String[] args) {
		
		Practice1 obj = new Practice1();
		
		obj.m1();
		obj.m2();
		Humans.m3();
		System.out.println(Humans.s);
		
		
	}
}


