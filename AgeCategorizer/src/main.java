import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age");
		int Age = scan.nextInt();
		AgeCategorizer(Age);
	}
	public static void AgeCategorizer(int Age) {
		if(Age<=12) {
			System.out.println("Your are Child");
		}
		else if(Age>12 && Age<=19) {
			System.out.println("youe Teen");
		}
		else if(Age>19&&Age<=59) {
			System.out.println("Your are Adult");
		} 
		else{
			System.out.println("Your are Senior Citizen");
		}
	}

}
