public class BCEmployeeDriver {
	public static void main(String[] args) {
		try {
			BCEmployee first = new BCEmployee();
			System.out.println(first); // Name: unknown, hourly pay = $0.0
			BCEmployee bill = new BCEmployee("Bill");
			BCEmployee barb = new BCEmployee(32.37);
			BCEmployee bob = new BCEmployee("Bob", 32.82);
			bob.setHourlyPay(35.28);
			System.out.println(bob); // Name: Bob, hourly pay = $35.28
			bob.volunteer();
			System.out.println(bob); // Name: Bob, hourly pay = $0.0
			first.setHourlyPay(99.99);
		} catch (IllegalArgumentException e) {
			System.out.println(e); // digit sum pay violation
		}
	}
}