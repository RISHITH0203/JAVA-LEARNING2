import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter code");
	    String Productcode = scan.nextLine();
	    getProduct(Productcode);
	}
	public static void getProduct(String Productcode) {
		switch(Productcode) {
		case "P01":
			System.out.println("Cocacola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("JalJeera");
			break;
		case "P05":
			System.out.println("MountainDew");
			break;
		case "P06":
			System.out.println("BoatGuava");
			break;
			default:System.out.println("Panaka");
			
			
		}
	}

}
