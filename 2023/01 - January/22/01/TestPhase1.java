// TestPhase1.java

public class TestPhase1 {
	public static void main(String[] args) {
		Player jim = new Player("Jim Beam");
		Player johnny = new Player("Johnny Walker");
		System.out.println(jim);
		System.out.println();

		System.out.println(johnny);
		System.out.println();

		jim.addGameResult(50);
		System.out.println(jim);
		jim.addGameResult(52);
		System.out.println();


		for (int i = 1; i <= 50; i++) {
			johnny.addGameResult(i);
		}
		System.out.println(jim);
		System.out.println();

		System.out.println(johnny);
		System.out.println();

		Player jimTwo = new Player("Jim Beam");
		System.out.println(jim.equals(jimTwo));
		System.out.println();

		System.out.println(jim.equals(johnny));
		System.out.println();

		System.out.println("Hello, my name is " + jim.getName());
		System.out.println();
	}
}
