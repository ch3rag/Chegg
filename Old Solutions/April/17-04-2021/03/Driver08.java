import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

public class Driver08 {
	/**
	 * 
	 * Draw four pretty flowers in a row, each with different color petals and green
	 * 
	 * stems and leaves. Use a white background.
	 * 
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab 08 | Flower Turtle | 2");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TurtlePanel());
		frame.setVisible(true);
		FlowerTurtle lisa = new FlowerTurtle(150.0, 150.0, 60.0, Color.BLACK, Color.BLUE);
		FlowerTurtle lisaTwo = new FlowerTurtle(450.0, 150.0, 60.0, Color.RED, Color.YELLOW);
		FlowerTurtle lisaThree = new FlowerTurtle(150.0, 400.0, 60.0, Color.MAGENTA, Color.CYAN);
		FlowerTurtle lisaFour = new FlowerTurtle(450.0, 400.0, 60.0, Color.PINK, Color.GRAY);
		lisa.drawShape();
		lisaTwo.drawShape(); 
		lisaThree.drawShape();
		lisaFour.drawShape(); 
	}
}