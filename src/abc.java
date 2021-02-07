import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
	String s1,s2;
	 
	Scanner in =new Scanner(System.in);
	
	System.out.println("Enter First String");
	s1 = in.nextLine();
	
	System.out.println("Enter Second String");
	s2 = in.nextLine();
	
	if(s1.compareTo(s2)>0)
		System.out.println("First String is greater");
	else if (s1.compareTo(s2)<0)
		System.out.println("Second string is greater");
	else
		System.out.println("Both are equal");

}
}
