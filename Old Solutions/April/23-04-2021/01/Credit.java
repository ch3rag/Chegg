public class Credit extends Payment {
	private int cardNo;
	private String cardType;
	private String dateOfExpiry;
	private String name;

	public Credit(double amount, int cardNo, String cardType, String dateOfExpiry, String name) {
		super(amount);
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.dateOfExpiry = dateOfExpiry;
		this.name = name;
	}

	public void showPaymentDetails() {
		System.out.println("Card Number: " + cardNo);
		System.out.println("Card Type: " + cardType);
		System.out.println("Date Of Expiry: " + dateOfExpiry);
		System.out.println("Card Holder Name: " + name);
		System.out.println("Amount: $" + amount);
	}

	public int getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDateOfExpiry() {
		return this.dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	void pay() {
		this.isPaid = true;
	}
}