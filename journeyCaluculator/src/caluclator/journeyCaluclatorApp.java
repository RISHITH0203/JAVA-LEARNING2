package caluclator;

import java.util.Scanner;

public class journeyCaluclatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter speed and time");
		double speed= scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCaluclator JourneyCaluclator = new JourneyCaluclator();
		System.out.println(JourneyCaluclator.distanceCaluclator(speed,time));
		
		
	}

} 
