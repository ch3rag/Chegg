import java.io.*;
import java.util.*;

public class LogFile {

	private Writer out;

	// LogFile constructor takes File input param and creates an character output stream
	// IOException is thrown if it fails to create the stream
	public LogFile(File file) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		this.out = new BufferedWriter(fileWriter);
	}

	// writeEntry logs an entry to the file
	// This method needs to synchronized since only one thread is able to access the file at a time
	// If multiple threads try to access the same file IOException will be thrown since the file is already in use
	// Use "synchronized" keyword in method signature to allow only a single thread to access the method at a time
	public synchronized void writeEntry(String message) throws IOException {
		Date date = new Date();
		out.write(date.toString());
		out.write("\t");
		out.write(message);
		out.write(System.lineSeparator());
		out.flush();
	}
}