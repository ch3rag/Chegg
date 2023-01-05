// Society.java

import java.util.ArrayList;

// Society Class
class Society {
	// Private Members
	private String name;
	private ArrayList<Member> members;
	private ManagementCttee managementCttee;

	// Constructor
	public Society(String name) {
		this.name = name;
		this.members = new ArrayList<Member>();
	}

	// Add Member To Society
	public void addMember(Member member) {
		members.add(member);
	}

	public boolean isSeniorMember(Member member) {
		return member instanceof SeniorMember;
	}

	// Public Methods
	public int getFeeTotal() {
		int total = 0;
		for (Member member : members) {
			total += member.getFee();
		}
		return total;
	}

	// Setter For ManagementCttee
	public void setManagementCttee(ManagementCttee managementCttee) {
		this.managementCttee = managementCttee;
	}

	// List All The Members In The Society
	void listAllMembers() {
		// Print Society Information
		System.out.println("---------- Society Information ----------");
		System.out.printf("Society Name: %s\n", name);
		System.out.println("-----------------------------------------");
		System.out.println("---------- Members Information ----------");
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			System.out.printf("Name: %s\nAddress: %s\nFee: $%.2f\nSenior?: %s\n\n", member.getName(), member.getAddress(), member.getFee(), isSeniorMember(member));
		}
		System.out.println("-----------------------------------------");
	}
}