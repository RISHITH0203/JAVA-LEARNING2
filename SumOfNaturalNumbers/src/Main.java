import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		CaluculateSum(n);
	}
	public static void CaluculateSum(int n) {
		int sum=0;
	for(int i=0;i<=n;i++) {
		sum = sum+i;
		
	}
	System.out.println(sum);
	}

}
