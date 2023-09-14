import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number ");
	int num = scan.nextInt();
	MultipleOfTen(num);
}
public static void MultipleOfTen(int num) {
	if(num%10==0) {
		System.out.println("Number is multiple of Ten");
	}
	else {
		System.out.println("Number is not multiple of Ten");
	}
}
}
