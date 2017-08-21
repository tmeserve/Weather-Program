package weatherReport;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		
		// User input scanner
		Scanner Fah = new Scanner(System.in);
		
		// Choose your degrees
		System.out.println("Welcome. Please enter your temperature in degrees F.");
		int F = Fah.nextInt();
		
		// Math
		double C = 5.0 / 9.0 * (F-32.0);
		
		// If it's cold or not
		if (F <= 32)
		{
			System.out.println("Your temperature is cold. Burrrr.");
		}
		// If it's hot or not
		else if (F >= 90)
		{
			System.out.println("Your temperature is hot. Don't get a sunburn.");
		}
		else {
			
		}
		
		// Degrees in centigrade
		System.out.println("Your temperature is also " + C + " degrees centigrade.");
		System.out.println("Have a nice day!");
		
		Fah.close();
	}

}
