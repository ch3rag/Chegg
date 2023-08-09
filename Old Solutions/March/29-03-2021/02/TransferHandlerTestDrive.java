public class TransferHandlerTestDrive {
	public static void main(String[] args) {
		SavingsAccount accountOne = new SavingsAccount("Joseph", "10000");
		SavingsAccount accountTwo = new SavingsAccount("Sara", "15000");
		TransferHandler<SavingsAccount> handler = new TransferHandler<SavingsAccount>();
		handler.transfer(accountOne, accountTwo, "500");
	}
}
