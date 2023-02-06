public class Runner {

	public static void main(String[] args) {
		/*
		 * You are free to edit any of the code in this main method.
		 * You can use this to test individual components of your code, for example
		 * creating your own tile and grid and testing printing it to the terminal
		 * when you hit run. The test cases will not check anything in here! They
		 * will just test your Tile and Grid classes and the methods you have written
		 * in those classes.
		 */
		System.out.println("To test your code, edit the Runner class!");
		// For Example, You Can Create Your Own Tiles to Test Their Functions.
		Tile tile = new Tile(1, 3);
		System.out.println(tile.getXPosition());
		System.out.println(tile.getYPosition());
		tile.addItemToTile("Player");
		tile.addItemToTile("Exit");
		System.out.println(tile.toString());

		// Or Create Your Own Grid to Test Its Methods.
		Grid grid = new Grid(5, 4);
		grid.getTileAtPosition(0, 3).addItemToTile("Player");
		grid.getTileAtPosition(4, 0).addItemToTile("Exit");
		grid.printGrid();

	}
}