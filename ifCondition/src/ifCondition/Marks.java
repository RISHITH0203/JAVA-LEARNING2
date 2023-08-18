package ifCondition;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	 System.out.println("Enter Marks");
	 int marks = scan.nextInt();
	 System.out.println("Welcome to kodnest");
	 Marks Marks = new Marks();
	 Marks.CheckEligibility(marks);
	/*if(marks>=80) {
		System.out.println("Welcome to Techh club");*/
	}
		
	void CheckEligibility(int marks) {
		if(marks>= 80) {
			System.out.println("welcome to Tech club");
		}
		
	}
}
