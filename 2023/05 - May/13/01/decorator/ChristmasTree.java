package decorator;

// ChristmasTree.java

// ChristmasTree Class
public class ChristmasTree extends Tree {
	// Constructor
	public ChristmasTree() {
		// Load All The Lines In The Tree.txt
		// And Pass Those Lines To Super Constructor Of The Tree Class
		super(FileReader.getLines("tree.txt"));
	}
}
