// TestMarathoner.java

public class TestMarathoner {
	// Main
	public static void main(String[] args) {
		Marathoner john = new Marathoner("John", null, Marathoner.MALE_GENDER, 90);
		Marathoner sunny = new Marathoner("Sunny", null, Marathoner.MALE_GENDER, 100);
		Marathoner mary = new Marathoner("Mary", null, Marathoner.FEMALE_GENDER, 90);
		Marathoner jane = new Marathoner("Jane", null, Marathoner.FEMALE_GENDER, 90);
		System.out.println(john.compareTo(mary));
		System.out.println(mary.compareTo(john));
		System.out.println(john.compareTo(sunny));
		System.out.println(sunny.compareTo(john));
		System.out.println(sunny.compareTo(sunny));
		System.out.println(jane.compareTo(mary));
		System.out.println(jane.compareTo(mary));

	}
}
