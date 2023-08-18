package stringJoiner;
import java.util.Scanner;
public class stringConcatination {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first and Last name");
		String FirstName = scan.next();
		String LastName = scan.next();
		System.out.println(joinString(FirstName,LastName));
	}
	public static String joinString(String str1, String str2) {
		return str1 + str2;
		
	}

}
