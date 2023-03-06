package com.java21days;

import java.awt.*;
import javax.swing.*;

/* This application requires three arguments: length, breadth,
	a color code like the one websites use.
*/
public class W6Exercise1YourName extends JFrame {
	public W6Exercise1YourName(String argL, String argB, String argColor) {
		super("Rectangle");
		setSize(350, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectanglePanel cp = new RectanglePanel(argL, argB, argColor);
		add(cp);
		setVisible(true);
	}

	public static void main(String[] arguments) {
		if (arguments.length < 3) {
			System.out.println("Usage: java W6Exercise1YourName length breadth color");
			System.exit(0);
		} else {
			W6Exercise1YourName dc = new W6Exercise1YourName(arguments[0], arguments[1],
					arguments[2]);
		}
	}
}

class RectanglePanel extends JPanel {
	int length, breadth;
	Color color;

	public RectanglePanel(String inLength, String inBreadth, String inColor) {
		super();
		if (inLength == null) {
			length = 50;
		}
		if (inBreadth == null) {
			breadth = 100;
		}

		if (inColor == null) {
			color = Color.blue;
		}

		try {
			length = Integer.parseInt(inLength);
			breadth = Integer.parseInt(inBreadth);
			color = Color.decode(inColor);
		} catch (NumberFormatException e) {
			System.out.println("Error" + e.getMessage());
		}
	}

	@Override
	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D) comp;
		comp2D.setColor(Color.white);
		comp2D.fillRect(0, 0, getSize().width, getSize().height);
		comp2D.setColor(color);
		Rectangle rect = new Rectangle(length, breadth);
		comp2D.fill(rect);
	}
}
