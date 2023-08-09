public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDesciption, int quantity, double pricePerItem) {
		if (quantity < 0) {
			quantity = 0;
		}

		if (pricePerItem < 0) {
			pricePerItem = 0;
		}

		this.partNumber = partNumber;
		this.partDescription = partDesciption;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;

	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return this.partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			quantity = 0;
		}
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return this.pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0) {
			pricePerItem = 0;
		}
		this.pricePerItem = pricePerItem;
	}

	public double getInvoiceAmount() {
		return pricePerItem * quantity;
	}
}