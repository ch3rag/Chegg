import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

// ImagePanel Class
public class ImagePanel extends JPanel {
	// Images Of The Die Face
	private Image[] dieFaces = new Image[6];
	// Current Value Of DieFace
	private int currentDieFace;

	public ImagePanel() {
		// Load All Images
		try {
			for (int i = 0; i < 6; i++) {
				File imageFile = new File("images/" + (i + 1) + ".png");
				dieFaces[i] = ImageIO.read(imageFile);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// Randomize Die
		randomizeDie();

		// Setup Panel Size
		Dimension size = new Dimension(dieFaces[0].getWidth(null), dieFaces[0].getHeight(null));
		setPreferredSize(size);
		setLayout(null);
	}

	// Randomizes The Die
	public void randomizeDie() {
		int newIdx;
		do {
			newIdx = (int)(Math.random() * 6);
		} while (newIdx == currentDieFace);
		currentDieFace = newIdx;
		// Repaint The Image
		repaint();
	}

	// Paint Image
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(dieFaces[currentDieFace], 0, 0, null);
	}

	// Returns The Value Of CurrentDieFace
	public int getDieFaceValue() {
		return currentDieFace + 1;
	}
}