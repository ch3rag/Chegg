import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws Exception {
		URL url = new URL(" https://www.w3schools.com/ ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
		String line;
		int i = 0;
		while ((line = reader.readLine()) != null) {
			if (i++ < 50)
			System.out.println(line);
			writer.write(line);
			writer.newLine();
		}
		reader.close();
		writer.close();
	}
}