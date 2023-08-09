import java.awt.Graphics;

import javax.swing.JFrame;

public class Main extends JFrame {

	// Constructor
	public Main() {
		this.setTitle("Random Quadrilateral");
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	// Paint
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// Draw Random Quad
		Quadrilateral myQuad = new Quadrilateral();
		myQuad.draw(g);
	}

	public static void main(String[] args) {
		new Main();
	}
}
