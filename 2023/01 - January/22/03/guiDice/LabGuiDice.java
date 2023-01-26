// LabGuiDice.java

package guiDice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LabGuiDice extends JFrame implements ActionListener {
	// Array Of BufferedImages To Hold Die Faces
	private BufferedImage[] dieFaces;
	// JButton
	private JButton btnRollEm;
	// Current FaceIndex
	private int faceIdx;
	// Constructor
	public LabGuiDice() {
		// Load Images
		dieFaces = new BufferedImage[6];
		try {
			for (int i = 0; i < 6; i++) {
				File imageFile = new File("guiDice/images/" + (i + 1) + ".png");
				dieFaces[i] = ImageIO.read(imageFile);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Generate New Face Index
		randomizeDie();

		// Init JButton
		btnRollEm = new JButton("Roll 'Em");
		// Modify JButton
		btnRollEm.setBackground(Color.BLACK);
		btnRollEm.setForeground(Color.PINK);
		btnRollEm.setFont(new Font("Century", Font.BOLD, 32));
		btnRollEm.setFocusPainted(false);

		// Add Action Listener
		btnRollEm.addActionListener(this);

		// Add JButton
		this.getContentPane().add(btnRollEm, BorderLayout.SOUTH);

		// Set Frame Properties
		this.setBackground(Color.WHITE);
		this.setTitle("Lab GUI Dice");
		this.setSize(600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Randomizes The Die
	private void randomizeDie() {
		int newIdx;
		do {
			newIdx = (int)(Math.random() * 6);
		} while (newIdx == faceIdx);
		faceIdx = newIdx;
		repaint();
	}

	public static void main(String[] args) {
		new LabGuiDice();
	}

	// Button Click Action Listener
	@Override
	public void actionPerformed(ActionEvent e) {
		randomizeDie();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(dieFaces[faceIdx], 200, 80, null);
	}
}
