/**
 * This class tests the modified Student class.
 *
 * @author Dr. Zeitz
 * @version 2020
 */
public class Lab13 {
	public static void main(String[] args) {

		UpdatedStudent rebecca = new UpdatedStudent("Rebecca", 23, SocialYear.SENIOR);
		UpdatedStudent henry = new UpdatedStudent("Henry", 16, SocialYear.FRESHMAN);

		String n = rebecca.getName();
		System.out.println("One student is " + n + ".");

		System.out.println("This student is " + rebecca.getAge() + " years old.");

		System.out.print(henry.getName() + " used to be " + henry.getAge() + " years old.");
		henry.birthday();
		System.out.println(" He just had a birthday and is now " + henry.getAge() + " years old.");

		System.out.println(rebecca.getName() + " is a " + rebecca.getSocialYear() + ".");

		if (rebecca.canVote()) {
			System.out.println(rebecca.getName() + " can vote.");
		} else {
			System.out.println(rebecca.getName() + " is not old enough to vote.");
		}

		if (henry.canVote()) {
			System.out.println(henry.getName() + " can vote.");
		} else {
			System.out.println(henry.getName() + " is not old enough to vote.");
		}

		// HELP! Create more instances of the UpdatedStudent class for testing.
		UpdatedStudent sarah = new UpdatedStudent("Sarah", 16, SocialYear.FRESHMAN);
		UpdatedStudent erin = new UpdatedStudent("Erin", 17, SocialYear.FRESHMAN);
		UpdatedStudent bert = new UpdatedStudent("Bert", 24, SocialYear.SENIOR);
		UpdatedStudent issac = new UpdatedStudent("Issac", 23, SocialYear.SENIOR);
		UpdatedStudent kaley = new UpdatedStudent("Kaley", 18, SocialYear.JUNIOR);
		UpdatedStudent sam = new UpdatedStudent("Sam", 17, SocialYear.FRESHMAN);
		// HELP! Modify me to use the UpdatedStudent class.
		// Add friends to the ArrayLists of the instances.
		// What type input parameter should be passed into the method?
		// Answer: UpdatedStudent type

		rebecca.addFriend(sarah);
		rebecca.addFriend(erin);
		rebecca.addFriend(bert);

		henry.addFriend(issac);
		henry.addFriend(kaley);

		// HELP! Modify me to use the UpdatedStudent class.
		// What type of objects does the ArrayList of friends have?
		// Answer: UpdatedStudent

		if (rebecca.hasFriend(bert)) {
			System.out.println(rebecca.getName() + " is friends with " + bert.getName() + ".");
		} else {
			System.out.println(rebecca.getName() + " does not know " + bert.getName() + ".");
		}


		if (henry.hasFriend(sam)) {
			System.out.println(henry.getName() + " is friends with " + sam.getName() + ".");
		} else {
			System.out.println(henry.getName() + " does not know " + sam.getName() + ".");
		}

		// HELP! Print out the favorite friend of one of the students.
		System.out.println(rebecca.getFavFriendName() + " is the favourite friend of " + rebecca.getName());
		// HELP! Change the favorite friend of one of the students.
		// The new favorite should already be a friend of the student.
		// Print out this new favorite friend.
		rebecca.myNewFavFriend(bert);
		System.out.println(rebecca.getFavFriendName() + " is the favourite friend of " + rebecca.getName());

		// HELP! Print out all the friends of one of the students.
		System.out.println(rebecca.getName() + " is friends with " + rebecca.printFriendNames());

		// HELP! Check to see if a student is friends with another student.
		// This test should be true (the student should have the friend).
		if (henry.hasFriend(issac)) {
			System.out.println(henry.getName() + " is friends with " + issac.getName() + ".");
		} else {
			System.out.println(henry.getName() + " does not know " + issac.getName() + ".");
		}

		// HELP! Check to see if a student is friends with another student.
		// This test should be false (the student should NOT have the friend).
		if (henry.hasFriend(erin)) {
			System.out.println(henry.getName() + " is friends with " + erin.getName() + ".");
		} else {
			System.out.println(henry.getName() + " does not know " + erin.getName() + ".");
		}

		// HELP! A friend transfers and a student loses track.
		// The student should unfriend the friend.
		// Print out the updated list of friends.
		rebecca.unfriend(sarah);
		System.out.println(rebecca.getName() + " is friends with " + rebecca.printFriendNames());
	}
}