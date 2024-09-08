package day8.type1;

public class Wrapper {

	public static void main(String[] args) {
		
		String s = "Welcome";  // storing value through variable
		
		String s1 = new String("Welcome 2");  // storing value through creating object
		
	//	int x = 100;  // storing value through variable
		
		// Int x1 = new Int(); // wrapper class is present for primitive data types
		
	//	Integer x1 = new Integer(101);
		
		Integer x2 = Integer.valueOf(52);
		Double x3 = Double.valueOf(203.3);
		
		
		System.out.println(x2);
	//	System.out.println(x1);
		System.out.println(x3);
		
		System.out.println(s);
		System.out.println(s1);

		// converting string into Int, Double, boolean.
		
		String s3 ="1245789";
		String s4 = "656232";
		
		System.out.println(Integer.parseInt(s3)+Integer.parseInt(s4));
		
		String s5= "123.12";
		String s6= "456.789";
		
		System.out.println(Double.parseDouble(s6)+Double.parseDouble(s5));
		
		String s7="True";
		String s8="False";
		
		System.out.println(Boolean.parseBoolean(s7));
		System.out.println(Boolean.parseBoolean(s8));
		
		// converting from int, double, char, boolean into string
		
	//	int y = 123;
	//	double = 
		
		String sc = String.valueOf(123);
		
		System.out.println(sc);
		
	}

}
