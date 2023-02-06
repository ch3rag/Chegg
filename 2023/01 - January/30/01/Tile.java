import java.util.ArrayList;

public class Tile {
	private static final String HIDDEN_SYMBOL = "~";
	private static final String PLAYER_ON_EXIT_TILE_SYMBOL = "O";
	private static final String PLAYER_TILE_SYMBOL = "P";
	private static final String EXIT_TILE_SYMBOL = "X";
	private static final String OBSTACLE_TILE_SYMBOL = "#";
	private static final String UNKNOWN_ITEM_SYMBOL = "?";
	private static final String EMPTY_TILE_SYMBOL = " ";
	// DON'T TOUCH ANY OF THESE SYMBOL DECLARATIONS

	// You Should Use Them in Your Tile's toString() Method.
	// X Position Of Tile In The Grid
	private int x;
	// Y Position Of Tile In The Grid
	private int y;
	// Boolean Variable That Represents If The Tile Is Visible Or Not
	private boolean isVisible;
	// Description Of Items That Are On This Tile
	private ArrayList<String> items;

	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
		// Tile Is Visible By Default
		isVisible = true;
		// Initialize Collection
		items = new ArrayList<String>();
	}

	// Getter For X Position
	public int getXPosition() {
		return x;
	}

	// Getter For Y Position
	public int getYPosition() {
		return y;
	}

	// Returns The Visibility Of The Tile
	public boolean getVisibility() {
		return isVisible;
	}

	// Sets The Visibility Of The Tile
	public void setVisibility(boolean isVisible) {
		this.isVisible = isVisible;
	}

	// Adds Item To The Tile
	public void addItemToTile(String item) {
		// If Item Not It Items
		if (!items.contains(item)) {
			// Add It
			items.add(item);
		}
	}

	// Removes An Item From The Tile
	public void removeItemFromTile(String item) {
		items.remove(item);
	}

	// Returns If The Item Is On The Tile
	public boolean isItemOnTile(String item) {
		return items.contains(item);
	}

	// Returns A String Representation Of Items On Tile
	@Override
	public String toString() {
		if (!isVisible) {
			// Return Hidden Symbol If Tile Isn't Visible
			return HIDDEN_SYMBOL;
		} else {
			// Return Matching Symbol
			if (isItemOnTile("Player") && isItemOnTile("Exit")) {
				return PLAYER_ON_EXIT_TILE_SYMBOL;
			} else if (isItemOnTile("Player")) {
				return PLAYER_TILE_SYMBOL;
			} else if (isItemOnTile("Exit")) {
				return EXIT_TILE_SYMBOL;
			} else if (isItemOnTile("Obstacle")) {
				return OBSTACLE_TILE_SYMBOL;
			} else if (!items.isEmpty()) {
				return UNKNOWN_ITEM_SYMBOL;
			} else {
				return EMPTY_TILE_SYMBOL;
			}
		}
	}

}