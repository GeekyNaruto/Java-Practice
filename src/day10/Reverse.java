package day10;

public class Reverse {

	public static void main(String[] args) {
		
		// Approach 1 using string method
		
	/*	String s = "123456789";
		
		for(int i=(s.length()-1); i>=0;i--)
		{
			char a = s.charAt(i);
			System.out.print(a);
		}   */
		
		// Approach 2 using char array
		
	/*	String s= "Welcome";
		char a[] = s.toCharArray();
		
		for(int i = s.length()-1; i>=0;i--)
		{
			System.out.print(a[i]);
		}
		*/
		
		// Approach 3 using StringBuffer classs
		
	/*	StringBuffer s = new StringBuffer("Welcome");
		System.out.println(s.reverse());     */
		
		//Approach 4 using StringBuilder
		StringBuilder s = new StringBuilder("Welcome"); 
		System.out.println(s.reverse());
	
		
	}
}
