package day10;

public class Stringss {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		// s.length()--returns length of the string
		
		System.out.println(s.length());
		int i = s.length();
		System.out.println(i);
		
		// trim() --- removes left and right spaces from the string
		
		s= "   Welcome";
		System.out.println(s.trim());

		s="   Welcome    ";
		System.out.println(s.trim());
		
		//concate  --- joining of two strings
		
		s="Welcome";
		String s1 = "to the jungle";
		String s2="of Madhya Pradesh";
		System.out.println(s.concat(s1));
		System.out.println(s.concat(s1).concat(s2));
		
		//equals & equalsIgnoreCase --- compares two strings returns boolean 
		
		boolean b=s1.equals(s2);
		System.out.println(b);
		System.out.println(s1.equals(s2));
		String s4 = "welcome";
		System.out.println(s.equalsIgnoreCase(s4));
		
		// charAt() --- returns charatcer at particular index
		
		System.out.println(s.charAt(4));
		
		//replace()----- replaces a character or string 
		
		String rep = s.replace('o','X');
		System.out.println(rep);
		
		String s5 = "Welcome to the jungle of India";
		System.out.println(s5.replace("to","in"));
		
		s1="$15,52,63";
		System.out.println(s1.replace("$","").replace(",",""));
		System.out.println(s1.replace(",",""));
		// toLowerCase  toUpperCase  --- to change thhe case of the string
		
		System.out.println(s.toLowerCase()+" "+s.toUpperCase());
		
		//contains  -----returns boolean 
		
		System.out.println(s.contains("me"));
		
		// split ---- splits the string based on delimeter  --- % * ^ () & cannot be treated as delimeter
		s="abc@xyz";
		
		String a[] = s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		s="abc@xyz#123";
		String a1[] = s.split("@");
		System.out.println(a1[0]+" "+a1[1]);
		String a2[] = a1[1].split("#");
		
		System.out.println(a1[0]+" "+a2[0]+" "+a2[1]);
		
		// substring 
		
		s="Welcome";
		
		System.out.println(s.substring(3,7));  //begining & ending index required as parameter
		System.out.println(s.substring(2));  // only beginning index as parameter
		
		
	}

}
