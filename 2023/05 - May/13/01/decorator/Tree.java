package decorator;

// Tree.java

import java.util.ArrayList;

// Tree Abstract Class
public abstract class Tree {
	// Stores All The Lines In The Tree
	protected ArrayList <String> lines;

	// Constructor
	public Tree(ArrayList<String> lines) {
		// Assign Lines To Instance Variable
		this.lines = lines;
	}

	// To String
	@Override
	public String toString() {
		// Append All The Lines
		String tree = "";
		for (String line: lines) {
			// Add New Line Character After Each Line
			tree += line + "\n";
		}

		// Return The Result
		return tree;
	}
}
