import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {

		int a;
		float b;
		String c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter String");
		c=in.nextLine();
		System.out.println("You Entered" + c);
		
		System.out.println("Please Enter float");
		b=in.nextFloat();
		System.out.println("You Entered" + b);
		
		System.out.println("Please Enter Integer");
		a=in.nextInt();
		System.out.println("You Entered" + a);
	}

}
