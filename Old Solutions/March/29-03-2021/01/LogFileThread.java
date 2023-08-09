import java.io.IOException;

// This class spawns a thread that will write to a LogFile
public class LogFileThread extends Thread {
	private String threadName;
	private LogFile logFile;

	public LogFileThread(String name, LogFile file) {
		this.threadName = name;
		this.logFile = file;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(this.threadName + " is writing to LogFile...");
				this.logFile.writeEntry(this.threadName + ": " + i);
				// simulate some random task
				Thread.sleep((long)(Math.random() * 1000));
			} catch (IOException ex) {
				// If method is not synchronized it will most probably throw IOException
				System.out.println("An IOException has occured.");
			} catch (InterruptedException ex) {
				System.out.println("An InterruptedException has occured.");
			}
		}
	}
}
