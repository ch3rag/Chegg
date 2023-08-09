import java.util.ArrayList;

public class Customer {
	private String customerName;
	private String userName;
	private String password;
	private int phoneNo;
	private String address;
	private String email;
	private ArrayList<Order> orders;

	public Customer() { }

	public Customer(String customerName, String userName, String password, int phone,
			String address, String email) {
		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
		this.password = password;
		this.address = address;
		this.email = email;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getPassword() {
		return this.password;
	}

	public int getPhoneNo() {
		return this.phoneNo;
	}

	public String getAddress() {
		return this.address;
	}

	public String getEmail() {
		return this.email;
	}
}
