abstract class Person {
	private String fullName;
	private String id;

	public Person() {
		this.fullName = "Undefined";
		this.id = "Undefined";
	}

	public Person(String id, String fullName) {
		this.fullName = fullName;
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public abstract void print();
}