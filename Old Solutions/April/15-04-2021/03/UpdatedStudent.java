import java.util.ArrayList;

/**
 * This class defines UpdatedStudent objects.
 *
 * @author Dr. Zeitz
 * @version 2020
 */
public class UpdatedStudent {
	private String name;
	private int age;
	private SocialYear year;

	// update ArrayList<String> to ArrayList<UpdatedStudent>
	private ArrayList<UpdatedStudent> friends;

	/**
	 * Constructor for objects of class Student
	 */
	public UpdatedStudent(String n, int a, SocialYear sy) {
		this.name = n;
		this.age = a;
		this.year = sy;
		// update initialization code
		this.friends = new ArrayList<UpdatedStudent>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public SocialYear getSocialYear() {
		return this.year;
	}

	public void setSocialYear(SocialYear y) {
		this.year = y;
	}

	public void birthday() {
		this.age++;
	}

	public boolean canVote() {
		return this.age >= 18;
	}

	// update the return type of getFriends() method from ArrayList<String> to ArrayList<UpdatedStudent>
	public ArrayList<UpdatedStudent> getFriends() {
		return this.friends;
	}

	// update addFriend method to accept "UpdatedStudent" type as input parameter
	public void addFriend(UpdatedStudent friend) {
		friends.add(friend);
	}

	// update hasFriend method to accept "UpdatedStudent" type as input parameter
	public boolean hasFriend(UpdatedStudent friend) {
		return friends.contains(friend);
	}

	// new methods

	public boolean equals(UpdatedStudent s) {
		return name.equals(s) && age == s.age && year == s.year;
	}

	public void myNewFavFriend(UpdatedStudent friend) {
		int indexOfFriend = friends.indexOf(friend);
		if (indexOfFriend != -1) {
			friends.remove(friend);
		}
		friends.add(0, friend);
	}

	public String getFavFriendName() {
		if (friends.size() > 0) {
			return friends.get(0).getName();
		}
		return name + " does not know anyone yet.";
	}

	public void unfriend(UpdatedStudent friend) {
		if (friends.contains(friend)) {
			friends.remove(friend);
		}
	}

	public String printFriendNames() {
		String names = "";
		for (int i = 0, max = friends.size(); i  < max; i++) {
			names += friends.get(i).getName();
			if (i < max - 1) {
				names += ", ";
			}
		}
		return names;
	}
}