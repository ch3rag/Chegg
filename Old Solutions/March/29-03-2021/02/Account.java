import java.math.BigDecimal;

public class Account {

	private String name;
	private BigDecimal amount;

	public Account(String acctName, String startAmount) {
		this.setName(acctName);
		this.setAmount(startAmount);
	  }

	public String getName() {
		return this.name;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setName(String newName) {
		String pattern = "^[a-zA-Z0-9]*$";
		if (newName.matches(pattern)) {
			this.name = newName;
		}
	}

	private void setAmount(String newAmount){
		this.amount = new BigDecimal(newAmount);
	}
}