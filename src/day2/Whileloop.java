package day2;

public class Whileloop {

	public static void main (String[] args) {
		
		int a=1;
		// print numbers from 1 to 10 
	/*	while(a<=10)
		{
			System.out.println(a);
			a++;
		}	*/
		
		// print hello message 10 times
	/*	while(a<=10)
		{
			System.out.println("Hello");
			a++;
		}	*/
	// print even numbers b/w 1 to 10
		
	/*	int i = 2;
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
		} */
		
	/*	while(a<=10)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		a++;
		} */
		
	// Print and specify each number whether odd or even from 1 to 10.
		
		while(a<=100)
		{
			if(a%2==0)
			{
				System.out.println("It's even number "+a);
			}
			else
			{
				System.out.println("It's odd number "+a);
			}	
			a++;
		}	
		
		
	}
}
