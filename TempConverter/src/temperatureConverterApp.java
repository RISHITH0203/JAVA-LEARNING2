import java.util.Scanner;

public class temperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		double F = scan.nextDouble();
		TemperatureConverter TemperatureConverter = new TemperatureConverter();
		System.out.println(TemperatureConverter.convertFtoC(F));
	}
}
