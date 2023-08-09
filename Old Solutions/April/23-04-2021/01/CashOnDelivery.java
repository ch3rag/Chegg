public class CashOnDelivery extends Payment {
	private String customerName;
	private String customerAddress;
	
	public CashOnDelivery(double amount, String customerName, String customerAddress) {
		super(amount);
		this.customerAddress = customerAddress;
		this.customerName = customerName;
	}
	
	public void showPaymentDetails() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Cusotmer Address: " + customerAddress);
		System.out.println("Amount: $" + amount);
	}

	public String getCustomerName() { 
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public void pay() {
		this.isPaid = true;
	}
}
