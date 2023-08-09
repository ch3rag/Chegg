package decorator;

import java.util.ArrayList;

// Ornaments.java
// Ornaments Decorator Class
public class Ornaments extends TreeDecorator {

	// Constructor
	public Ornaments(Tree tree) {
		// Pass The Lines Of The Tree To Super Class Constructor
		super(tree.lines);
		// Load All The Decor Lines In Ornaments.txt
		ArrayList<String> decorLines = FileReader.getLines("Ornaments.txt");
		// Integrate Decor With Tree Lines Using Helper
		integrateDecor(decorLines);
	}
}
