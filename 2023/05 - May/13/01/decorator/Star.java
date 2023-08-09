package decorator;

import java.util.ArrayList;

// Star.java
// Star Decorator Class
public class Star extends TreeDecorator {

	// Constructor
	public Star(Tree tree) {
		// Pass The Lines Of The Tree To Super Class Constructor
		super(tree.lines);
		// Load All The Decor Lines In Star.txt
		ArrayList<String> decorLines = FileReader.getLines("Star.txt");
		// Integrate Decor With Tree Lines Using Helper
		integrateDecor(decorLines);
	}
}
