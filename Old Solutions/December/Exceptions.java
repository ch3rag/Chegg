import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
	public static double[] filterData(Scanner scnr, int numValues, double lowThreshold, double highThreshold) throws Exception {
		double inputVal;
		double[] resultArray = new double[numValues];

		for (int i = 0; i < numValues; ++i) {
			inputVal = scnr.nextDouble();
			if (inputVal < 0.0) {
				throw new Exception("Invalid negative time");
			}

			if ((inputVal >= lowThreshold) && (inputVal <= highThreshold)) {
				resultArray[i] = inputVal;
			}
		}

		return resultArray;
	}

	public static double[] filterTimeData(String fileName, double lowThreshold, double highThreshold) throws FileNotFoundException, Exception, IndexOutOfBoundsException {
		FileInputStream inStream = new FileInputStream(fileName);
		Scanner fileScnr = new Scanner(inStream);
		int numValues = fileScnr.nextInt();
		return filterData(fileScnr, numValues, lowThreshold, highThreshold);
	}
}