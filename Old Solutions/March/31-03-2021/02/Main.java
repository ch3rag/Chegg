public class Main {
	public static void main(String[] args) {
		Bottle bottleOne = new Bottle();
		Bottle bottleTwo = new Bottle(10, 5, "Blue", "Plastic", "Coca Cola");

		System.out.println(bottleOne);
		System.out.println(bottleTwo);

		Box boxOne = new Box();
		Box boxTwo = new Box(5, 5, "Red", "Metal", "Cookies", true);

		System.out.println(boxOne);
		System.out.println(boxTwo);

		Bag bagOne = new Bag();
		Bag bagTwo = new Bag(4, 2, "Black", "Cloth", 2, "Gym Bag");

		
		System.out.println(bagOne);
		System.out.println(bagTwo);
	}
}
