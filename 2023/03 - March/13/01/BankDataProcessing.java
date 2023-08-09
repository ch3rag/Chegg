import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class BankDataProcessing {
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
	static ArrayList<BankAccount> Accounts = new ArrayList<>();

	public static void main(String[] args) {
		try {
			Path path = Paths.get("src/AccountData.csv");
			readAccounts(path, true);
			Path path2 = Paths.get("src/BankTransData.csv");
			readTransactions(path2, true, Accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readAccounts(Path Xpath, boolean bHead) throws IOException {
		BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
		try {
			// Read First Line Of File
			String line = bufferedReader.readLine();
			// If It's Header, Ignore It
			if (line.equals("name,acctnum")) {
				// Read Next Line
				line = bufferedReader.readLine();
			}
			while (line != null) {
				// Split The Line Into Fields
				String[] data = line.split(",");
				// Fetch Individual Fields
				String name = data[0];
				int accountNumber = Integer.parseInt(data[1]);
				// Create A New BankAccount Object
				BankAccount bankAccount = new BankAccount(name, accountNumber);
				// Add It To Accounts ArrayList
				Accounts.add(bankAccount);
				// Read Next Line
				line = bufferedReader.readLine();
			}
		} catch (IOException ioe) {
			bufferedReader.close();
			ioe.printStackTrace();
		} finally {
			bufferedReader.close();
		}
	}

	private static void readTransactions(Path Xpath, boolean bHead, ArrayList<BankAccount> Xaccounts) throws IOException {
		try {
			// For Each Account In Accounts
			for (BankAccount account : Accounts) {
				BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
				// Read First Line Of File
				String line = bufferedReader.readLine();
				// If It's Header, Ignore It
				if (line.equals("acctnum,date,transtype,amount")) {
					// Read Next Line
					line = bufferedReader.readLine();
				}
				// Print Account Name And Number
				System.out.printf("Account for %s, %d\n", account.getAcctname(), account.getAcctnum());
				// Initial Balance
				int balance = 0;
				// Read Rest Of The File
				while (line != null) {
					// Split Line Into Individual Fields
					String[] data = line.split(",");
					// Fetch Account Number
					int accountNumber = Integer.parseInt(data[0]);
					// If Transaction Belongs To Current Account
					if (accountNumber == account.getAcctnum()) {
						int amount =  Integer.parseInt(data[3]);
						// Check Transaction Type
						if (data[2].equals("c")) {
							// Credit
							balance += amount;
							System.out.printf("  Transaction date: %s, Credit: %d\n",
								data[1], amount);
						} else {
							// Debit
							balance -= amount;
							System.out.printf("  Transaction date: %s, Debit: %d\n",
							data[1], amount);
						}
					}
					// Read Next Line
					line = bufferedReader.readLine();
				}
				// Set The Balance
				account.setBalance(balance);
				// Print Account Balance
				System.out.println(account);
				// Close Buffered Reader
				bufferedReader.close();
				System.out.println("----------------------------------------------");
				// End For
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}