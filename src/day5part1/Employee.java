package day5part1;

public class Employee {

	// variables
	int eid;
	String ename;
	String job;
	int sal;
	
	// Method
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	/* // objects can only be made in main method
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(); // object 1
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		System.out.println();
		
		Employee emp2 = new Employee(); // object 2
		emp2.eid=102;
		emp2.ename="Kim";
		emp2.job="Engineer";
		emp2.sal=45000;
		emp2.display();
		
	}  */
}
