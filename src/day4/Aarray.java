package day4;

public class Aarray {

	public static void main(String[] args) {
		
		// declaring an array
		
		int a[] = {100,200,300,400,500};
		
		/*System.out.println(a.length);
		System.out.println(a[3]); */
	    
	/*	for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}  */
	
		//enhanced for loop
	/*	for(int x:a)
		{
			System.out.println(x);
		} */
		
		//searching an element in array
		
		int c=200;
		boolean status = false;
		
	/*	for(int i=0; i<a.length; i++)
		{
		   if(a[i]==c)
		   {
			System.out.println("Elelment found");
			status=true;
			break;
		   }
		 
		}
		if(status==false)
			System.out.println("Element not found");  */ 
	
		// enhanced for loop
		for(int x:a)
		{
			if(x==c)
		  {	
			System.out.println("element found");
			status=true;
		//	break;
		  }
		}
		if(status==false)
			System.out.println("Element not found");
	}
}
