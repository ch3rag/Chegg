public class Order {
	private Cart cart;
	private String status;

	public Order() { }

	public Order(Cart cart, String status) {
		this.cart = cart;
		this.status = status;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public boolean hasPaidCredit() {
		return true;
	}

	public boolean checkout(Payment pay) {
		if (this.hasPaidCredit()) {
			return true;
		} else {
			return false;
		}
	}
}