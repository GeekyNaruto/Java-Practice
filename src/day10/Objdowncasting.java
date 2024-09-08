package day10;

class Animal
{
	String name, breed, legs;
	
	void m1()
	{
		System.out.println("We all are animals");
	}
}

class Cat extends Animal
{
	String yoyo = "puffy";
	
	void m2()
	{
		System.out.println("I'm a cat");
	}
	
}

class Dog extends Animal
{
	String lolo = "wuff wuff";
	
	void m3()
	{
		System.out.println("I'm a dog");
	}
}

public class Objdowncasting {

	public static void main(String[] args) {
		
	//	Animal an = new Animal();	
	//	Cat c = (Cat) an;  // rule 1 valid, rule 2 valid, rule 3 invalid
		
		Animal an = new Cat();
		Cat c= (Cat) an;   // perfectly valid
		
		c.m1();
		c.m2();
 
	}

}
