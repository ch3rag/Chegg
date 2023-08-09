import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmployeeInfoTable {

	public static void drawDivider(PrintWriter writer) {
		for (int i = 0; i < 47; i++) {
			writer.print("-");
		}
		writer.println();
	}
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("EmployeeInfo.txt");
		FileOutputStream outputStream = new FileOutputStream("EmployeeInfoTable.txt");
		PrintWriter outFS = new PrintWriter(outputStream);
		Scanner inFS = new Scanner(inputStream);

		outFS.printf("%-20s | %3s | %7s | %8s\n", "", "Hrs", "Hourly", "Weekly");
		outFS.printf("%-20s | %3s | %7s | %8s\n", "Name", "Wkd", "Rate", "Pay");
		drawDivider(outFS);
		
		double totalPay = 0;

		while (inFS.hasNextLine()) {
			String record = inFS.nextLine();
			String[] fields = record.split(" ");
			String firstName = fields[0];
			String lastName = fields[1];
			int hoursWorked = Integer.parseInt(fields[2]);
			double rate = Double.parseDouble(fields[3]);
			double pay = hoursWorked * rate;
			totalPay += pay;
			outFS.printf("%-20s | %3d | $%6.2f | $%7.2f\n", firstName + " " + lastName, hoursWorked, rate, pay);
		}

		drawDivider(outFS);
		outFS.printf("%36s $ %,.2f\n", "Total Payroll for Week:", totalPay);
		drawDivider(outFS);

		inFS.close();
		outFS.flush();
		outFS.close();

	}
}