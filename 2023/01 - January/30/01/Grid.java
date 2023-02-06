import java.util.ArrayList;

public class Grid {
	private static final String GRID_CORNER_SYMBOL = "+";
	private static final String GRID_HORIZONTAL_SYMBOL = "-";
	private static final String GRID_VERTICAL_SYMBOL = "|";
	// DON'T TOUCH ANY OF THESE SYMBOL DECLARATIONS

	// Width Of The Grid
	private int width;
	// Height Of The Grid
	private int height;
	// Collection Of Tiles
	private ArrayList<Tile>tiles;

	// You Should Use Them in Your Grid's printGrid() Method.
	public Grid(int width, int height) {
		this.width = width;
		this.height = height;
		// Initialize Collection Of Tiles
		tiles = new ArrayList<Tile>();

		// Add Tiles To Collection
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles.add(new Tile(x, y));
			}
		}
	}

	// Getter For Grid Width
	public int getGridWidth() {
		return width;
	}

	// Getter For Grid Height
	public int getGridHeight() {
		return height;
	}

	// Returns The Tile At Corresponding Location
	public Tile getTileAtPosition(int x, int y) {
		int index = y * width + x;
		if (index >= 0 && index < tiles.size()) {
			return tiles.get(index);
		}
		return null;
	}

	// Returns The Tile Containing The Player Object
	public Tile getPlayerTile() {
		for (Tile tile : tiles) {
			if (tile.isItemOnTile("Player")) {
				return tile;
			}
		}
		return null;
	}

	// Prints The Grid
	public void printGrid() {
		for (int y = 0; y < height; y++) {
			printBorder();
			for (int x = 0; x < width; x++) {
				System.out.print(GRID_VERTICAL_SYMBOL + tiles.get(y * width + x));
			}
			System.out.println(GRID_VERTICAL_SYMBOL);
		}
		printBorder();
	}

	// Prints Border
	public void printBorder() {
		for (int x = 0; x < width; x++) {
			System.out.print(GRID_CORNER_SYMBOL + GRID_HORIZONTAL_SYMBOL);
		}
		System.out.println(GRID_CORNER_SYMBOL);
	}
}