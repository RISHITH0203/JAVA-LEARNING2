import java.util.Scanner;
public class doubleNum {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a numbers wants to be double");
	int num = scan.nextInt();
	System.out.println(numDouble(num));
}
public static int numDouble(int num) {
	return num * 2;
}
}
