import java.io.*;

public class Driver {
	public static void main(String[] args) {
		File file = new File("log.txt");
		LogFile logFile = null;
		try {
			logFile = new LogFile(file);
		} catch (IOException ex) {
			System.out.println("Unable To Create LogFile.");
		}

		if (logFile != null) {
			LogFileThread threadOne = new LogFileThread("Thread 1", logFile);
			LogFileThread threadTwo = new LogFileThread("Thread 2", logFile);
			LogFileThread threadThree = new LogFileThread("Thread 3", logFile);
			threadOne.start();
			threadTwo.start();
			threadThree.start();
		}
	}	
}
