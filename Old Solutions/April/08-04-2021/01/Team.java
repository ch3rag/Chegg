public class Team {
	private String name;
	private String city;

	public Team(String city, String name) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("\nName: %-15s City: %-10s", this.name, this.city);
	}
}