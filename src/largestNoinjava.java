import java.util.Scanner;

public class largestNoinjava {
	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter x,y,z");
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter X");
		 x=in.nextInt();
		 System.out.println("Enter Y");
		 y=in.nextInt();
		 System.out.println("Enter Z");
		 z=in.nextInt();
		 if (x>y && x>z)
			 System.out.println("X is greater");
		 else if (y>x && y>z)
			 System.out.println("Y is greater");
		 else if (z>x && z>y)
			 System.out.println("Z is greater");
		 else
			 System.out.println("Time Khrab Mat kr");
	}
}
