public class TransferHandler <T extends Account> {
	public void transfer(T accountOne, T accountTwo, String amount) {
		System.out.printf("A transfer is made between %s and %s with an amount of: %s%n", accountOne.getName(), accountTwo.getName(), amount);
	}
}
