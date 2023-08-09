import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;;

public class Lab10 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int tempSize = 1000;
		double[] temps = new double[tempSize];
	
		System.out.print("Please Enter Full Name Of The File: ");
		String fileName = input.nextLine();

		// 1) Read in the temperatures from a file
		
		// Store the actual number of temperatures read from the file.
		int numTemps = readInTemps(fileName, temps, tempSize);
		// Change tempSize to actual number of temperatures read from the file.
		tempSize = numTemps;
		System.out.println(tempSize + " Records Loaded Successfully.");

		// 2) Convert the temperatures from celsius to fahrenheit 
		convertTemps(temps, tempSize);
		System.out.println("Temperatures Converted To Fahrenheit.");

		// 3) Print the highest temperature
		double hightestTemperature = findHighest(temps, tempSize);
		System.out.println("Highest Temperature: " + hightestTemperature);

		// 4) Print the lowest temperature
		double lowestTemperature = findLowest(temps, tempSize);
		System.out.println("Lowest Temperature: " + lowestTemperature);

		// 5) Print the average temperature
		double averageTemperature = calcAverage(temps, tempSize);
		System.out.println("Average Temperature: " + averageTemperature);

		// 6) Print the number of days when the temperature was below freezing
		int lowerThanFreezing = countLowerThan(temps, tempSize, 32);
		System.out.println("Days Below Freezing: " + lowerThanFreezing);

		// 7) Print the number of days when the temperature was between freezing and 65 degrees fahrenheit.
		int lowerThan65 = countLowerThan(temps, tempSize, 65);
		int between65AndFreezing = lowerThan65 - lowerThanFreezing;
		System.out.println("Days Between Freezing & 65F: " + between65AndFreezing);

		System.out.println("Bye.");
	}

	public static int readInTemps(String fileName, double[] temps, int tempSize) {
		int count = 0;
		try {

			File file = new File(fileName);
			Scanner fileReader = new Scanner(file);
			while (fileReader.hasNextDouble()) {
				temps[count] = fileReader.nextDouble();
				count++;

				if (count == tempSize) {
					System.out.println("Warning: File Is Larger Than Array Length.");
					break;
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Error: File Not Found!");
			System.exit(-1);
		}

		return count;
	}

	public static void convertTemps(double[] temps, int tempSize) {
		for (int i = 0; i < tempSize; i++) {
			double fahrenheit = (temps[i] * (9/5)) + 32;
			temps[i] = fahrenheit;
		}
	}

	public static double findHighest(double[] temps, int tempSize) {
		double highest = temps[0];
		for (int i = 1; i < tempSize; i++) {
			if (temps[i] > highest) {
				highest = temps[i];
			}
		}
		return highest;
	}

	public static double findLowest(double[] temps, int tempSize) {
		double lowest = temps[0];
		for (int i = 1; i < tempSize; i++) {
			if (temps[i] < lowest) {
				lowest = temps[i];
			}
		}
		return lowest;
	}

	public static double calcAverage(double[] temps, int tempSize) {
		double sum = 0;
		for (int i = 0; i < tempSize; i++) {
			sum += temps[i];
		}
		return sum / tempSize;
	}

	public static int countLowerThan(double[] temps, int tempSize, double temp) {
		int count = 0;
		for (int i = 0; i < tempSize; i++) {
			if (temps[i] < temp) {
				count++;
			}
		}
		return count;
	}
}