package day5part1;

public class Set {
	
	static void m1()  // (for calling function without object)
	{
		System.out.println("Hello");
	}
	
	void m2() //method1 (no parameters no return value)

	{
		System.out.println("Hello world");
	}
	 
	String m3()  // method 2 (no param, returns value)
	
	{
		
		return ("John");
	}
	
	int m4 (int x, int y) // method 3 (takes param, returns value)
	{
	    return (x+y);
	}
	
	void m5(String name) // method 4 (takes param, returns no value)
	{
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {

		m1(); //
		
		Set obj =new Set();  //2
		obj.m2();
		
		String s = obj.m3();  //3
		System.out.println(s);
		System.out.println(obj.m3());
		
		int sum = obj.m4(89, 11); //4
		System.out.println(sum);
		
		obj.m5("deepak"); //5
	}

}
