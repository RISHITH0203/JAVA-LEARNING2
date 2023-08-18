package gradeCaluculator;

import java.util.Scanner;

public class GradeCaluculatorApp {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks = scan.nextInt();
	GradeCaluculator g1 = new GradeCaluculator();
	g1.caluculategrade(marks);
	}
	

}
