package decorator;

import java.util.ArrayList;

// Lights.java
// Lights Decorator Class
public class Lights extends TreeDecorator {

	// Constructor
	public Lights(Tree tree) {
		// Pass The Lines Of The Tree To Super Class Constructor
		super(tree.lines);
		// Load All The Decor Lines In Lights.txt
		ArrayList<String> decorLines = FileReader.getLines("Lights.txt");
		// Integrate Decor With Tree Lines Using Helper
		integrateDecor(decorLines);
	}
}
