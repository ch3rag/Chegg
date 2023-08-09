import java.awt.Color;
import javax.swing.*;
import edu.fcps.Turtle;

public class FlowerTurtle extends Turtle {
	/**
	 * 
	 * mySize is the current size of the turtle
	 * 
	 */
	private double mySize;
	/**
	 * 
	 * myStemColor chracterize the stem color of the turtle drawing the polygon
	 * 
	 */
	private Color myStemColor;
	/**
	 * 
	 * myPetalColor chracterize the petal color of the turtle drawing the polygon
	 * 
	 */
	private Color myPetalColor;

	public void setSize(double x) {
		mySize = x;
	}

	public void setPetalColor(Color s) {
		myPetalColor = s;
	}

	public void setStemColor(Color h) {
		myStemColor = h;
	}

	public Color getPetalColor() {
		return myPetalColor;
	}

	public Color getStemColor() {
		return myStemColor;
	}

	public FlowerTurtle() {
		super();
		mySize = 20;
		myStemColor = Color.BLACK;
		myPetalColor = Color.BLUE;
	}

	public FlowerTurtle(Color x, Color y) {
		super();
		mySize = 10;
		myStemColor = x;
		myPetalColor = y;
	}

	public FlowerTurtle(double x, double y, double h, Color n, Color s) {
		super(x, y, 90);
		mySize = h;
		myStemColor = n;
		myPetalColor = s;
	}

	public void drawShape() {
		drawPetal();
		drawStem();
	}

	private void drawPetal() {
		
		int numberOfPetals = 30;
		// Amount of angle to rotate after each petal is drawn
		double angle = 360 / numberOfPetals;

		setPenDown(false);
		forward(mySize);

		for (int i = 0; i < numberOfPetals; i++) {
			setColor(getPetalColor());
			setPenDown(true);
			forward(mySize);
			setPenDown(false);
			back(mySize);
			turnRight(angle);
		}
		
		setPenDown(false);
		back(mySize);
	}

	private void drawStem() {
	  	setColor(getStemColor());
		setPenDown(true);
		back(1.5 * mySize);
		setPenDown(false);
		forward(mySize / 2);
		setPenDown(true);
		turnRight(45);
		forward(mySize);
		setPenDown(false);
		back(mySize);
		turnLeft(90);
		setPenDown(true);
		forward(mySize / 2);
	}
}
