import java.awt.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Star Pattern");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setSize(300, 300);
		Star panel = new Star();

		frame.add(panel);
		frame.setVisible(true);
	  }
}
