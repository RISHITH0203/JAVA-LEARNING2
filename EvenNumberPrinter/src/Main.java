import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		PrintEvenNumbers(n);
	}
	public static void PrintEvenNumbers(int n) {
		for(int i =1;i<=n;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
	}

}
