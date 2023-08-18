package caluclator;

import java.util.Scanner;

public class DistanceCaluclator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter speed and time");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		DistanceCaluclator DistanceCaluclator = new DistanceCaluclator();
		System.out.println(DistanceCaluclator.distance(speed, time));
		
		
	}
	public double distance(double speed , double time) {
		return speed * time;
	}

}
