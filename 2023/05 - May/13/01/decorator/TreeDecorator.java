package decorator;

import java.util.ArrayList;

// TreeDecorator.java

// Tree Decorator Class
public abstract class TreeDecorator extends Tree {

	// Integrates Decor Lines With Tree Lines
	protected void integrateDecor(ArrayList<String> decor) {
		// Loop Through Decor Lines And Tree Lines In Parallel
		for (int i = 0, j = 0; i < decor.size() && j < lines.size(); i++, j++) {
			// Integrated Line With Tree And Decor
			String integratedLine = "";
			// Current Tree Line
			String treeLine = lines.get(j);
			// Current Decor Line
			String decorLine = decor.get(i);
			// If Tree Line Is Empty, Then Replace It With Decor Line
			if (treeLine.strip().isEmpty()) {
				integratedLine = decorLine;
			// Else, Merge Both Lines
			} else {
				// Loop Through Each Character In Tree Line
				for (int k = 0; k < treeLine.length(); k++) {
					// If At Index K In DecorLine, The Character Is Not ' '
					if (k < decorLine.length() && decorLine.charAt(k) != ' ') {
						// Then, Add That Character To Integrated Line
						integratedLine += decorLine.charAt(k);
					} else {
						// Else, Add Tree Character In Integrated Line
						integratedLine += treeLine.charAt(k);
					}
				}
			}
			// Replace Current Tree Line With Integrated Line
			lines.set(j, integratedLine);
		}
	}

	// Constructor
	public TreeDecorator(ArrayList<String> lines) {
		// Pass Lines Of The Tree To Super Class (Tree) Constructor
		super(lines);
	}
}
