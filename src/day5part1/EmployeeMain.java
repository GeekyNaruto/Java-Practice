package day5part1;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
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
	}

}
