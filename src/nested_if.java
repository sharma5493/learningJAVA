import java.util.Scanner;

public class nested_if {
	public static void main(String[] args) {
		int marksObtained, passingMarks;
		char grade;
		passingMarks = 40;

		Scanner in = new Scanner(System.in);
		System.out.println("Input Marks Scored By You");
		marksObtained = in.nextInt();
		if (marksObtained >= passingMarks) {
			if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 75) {
				grade = 'B';
			} else if (marksObtained > 40) {
				grade = 'C';
			} else
				grade = 'D';
			System.out.println("You passed with grade=" + grade);
		}
		else
			System.out.println("You failed");
	}

}
