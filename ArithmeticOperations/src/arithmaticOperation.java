import java.util.Scanner;
public class arithmaticOperation {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two Numbers to sub");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	System.out.println(substractNumbers(num1,num2));
	System.out.println("Enter two Numbers to multiply");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	System.out.println(multiplyNumbers(num1,num2));
	System.out.println("Enter two Numbers to divide");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	System.out.println(divideNumbers(num1,num2));	
	System.out.println("Enter two Numbers to get the remainder");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	System.out.println(findReminder(num1,num2));	
	
}
public static int substractNumbers(int num1,int num2) {
	return num2-num1;
}
public static int multiplyNumbers(int num1,int num2) {
	return num2*num1;
}
public static int divideNumbers(int num1,int num2) {
	return num1/num2;
}
public static int findReminder(int num1,int num2) {
	return num1%num2;
}}
