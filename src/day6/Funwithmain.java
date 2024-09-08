package day6;

public class Funwithmain {

	public static void main(String []args) {
      
		int a=10,b=20;
		
		System.out.println(a*b);
		System.out.println(args.length);
		
	/*	for(String value:args)
		{
			System.out.println(value);
		} */
		
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		
	}

}
