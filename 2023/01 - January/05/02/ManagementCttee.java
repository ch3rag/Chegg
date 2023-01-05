// ManagementCttee.java

import java.util.ArrayList;

// ManagementCttee Class
public class ManagementCttee {
	// Private Attributes
	private ArrayList<SeniorMember> ctteeMembers = new ArrayList<SeniorMember>();

	// Add CtteeMember To Members
	void addCtteeMember(SeniorMember s) {
		ctteeMembers.add(s);
	}

	// Remove CtteeMember
	void removeCtteeMember(String name) {
		SeniorMember toRemove = null;
		// Find Member With That Name
		for (SeniorMember member : ctteeMembers) {
			if (name.equalsIgnoreCase(member.getName())) {
				toRemove = member;
				break;
			}
		}

		// Remove It If Found
		if (toRemove != null) {
			ctteeMembers.remove(toRemove);
		}
	}
}
