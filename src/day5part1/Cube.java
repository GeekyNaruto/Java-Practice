package day5part1;

public class Cube {
	
	//polymrophism in constructor(constructor overloading)
	double length, width, depth;
	
	Cube() // constructor 1
	{
		length=width=depth = 0;
	}
	
	Cube(double l, double w, double d) // constructor 2
	{
		length=l;
		width=w;
		depth=d;
	}
	
	Cube(double length) // constructor 3
	{
		this.length = length;
		width = length;
		depth = length;
	}
	
	double volume()
	{
		return(length*width*depth);
	}

}
