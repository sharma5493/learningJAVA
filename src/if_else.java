import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
      
		int marksObtained,passingMarks;
		passingMarks=40;
		Scanner in= new Scanner(System.in);
		System.out.println("Input Marks Scored By You");
		marksObtained=in.nextInt();
		 
		if (marksObtained>=passingMarks) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Fail");
		}
	}
}
