import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature in fahrehheit");
		temp = in.nextInt();
		temp = ((temp-32)*5)/9;
		System.out.println("Temp in celsius=" + temp);

	}

}
