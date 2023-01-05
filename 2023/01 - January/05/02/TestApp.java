// TestApp.java

// TestApp Class
public class TestApp {
	public static void main(String[] args) {
		// Create the Members
		Member jane = new StandardMember("Jane", "1 Queen St. ");
		Member mike = new SeniorMember("mike", "1 King St. ", 60);
		Member noah = new SeniorMember("Noah", "100 King St. ", 40);


		// Create the Society
		Society ontarioTech = new Society("Ontario Tech");

		// Add Members to the Society
		ontarioTech.addMember(mike);
		ontarioTech.addMember(jane);
		ontarioTech.addMember(noah);

		// Create the Management Committee
		ManagementCttee managementCttee = new ManagementCttee();

		// Check If Mike Is a Senior Member in the Society
		if (ontarioTech.isSeniorMember(mike)){
			managementCttee.addCtteeMember((SeniorMember)mike);
		}
		
		// Add the Management Committee to the Society
		ontarioTech.setManagementCttee(managementCttee);

		// List All the Members in the Committee
		ontarioTech.listAllMembers();

		// Print Total Fee
		System.out.println("Total Fee: $" + ontarioTech.getFeeTotal());
	}
}
