import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, fact;
		fact=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter No to find its factorial");
		n = in.nextInt();
		if (n < 0) {
			System.out.println("Please Enter Valid No");
		} else {
			for (c = 1; c <= n; c++) 
				
				fact = fact * c;
				System.out.println("Factorial of the " + n + " is" + fact);
			
		}

	}
}
