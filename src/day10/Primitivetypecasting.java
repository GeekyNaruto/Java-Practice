package day10;

public class Primitivetypecasting {
	
	public static void main(String[] args) {
		
	/*	int x = 100;
		float y=x;                //upcasting
		System.out.println(y);   
		
        int i=100;
       long l=i; System.out.println(l);
        double d= i; System.out.println(d);
        float f= i; System.out.println(f);    */
		
		long l = 101010101010L;                      //downcasting
		int i = (int) l; System.out.println(i);
		
		double d = 10.5;
		int j =(int)d; System.out.println(j);
		
        
        
	}

}
