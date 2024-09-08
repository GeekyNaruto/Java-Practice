package day5part1;

public class AdderMain {

	public static void main(String[] args) {
 
       Adder obj = new Adder();
       
       obj.a=10;
       obj.b=20;
       obj.sum(); //1
       
       obj.sum(20,50); // 2
       
       obj.sum(50,50.25);  //3
       obj.sum(56,56,65);  //4
		
	}

}
