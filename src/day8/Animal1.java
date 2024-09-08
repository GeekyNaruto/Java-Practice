package day8;

public class Animal1 implements Animal

{

	public void m1()
	{
		System.out.println("this is cheetah");
	}	
	
	public static void main(String[] args) {
		
		Animal1 obj = new Animal1();
		
		obj.m1();
		obj.m2();
		Animal.m3();
		
		System.out.println(Animal.s);
		System.out.println("through object: "+obj.s);
	}

}
