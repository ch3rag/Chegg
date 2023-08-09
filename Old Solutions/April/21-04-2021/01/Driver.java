public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		Agent one = new Agent("One", account, 5000);
		Agent two = new Agent("Two", account, 2000);
		Agent three = new Agent("Three", account, 1000);

		two.start();
		three.start();
		one.start();

		
		one.join();
		two.join();
		three.join();
		System.out.println(account.getBalance());
	}
}
