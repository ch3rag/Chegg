import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// Roll Dice Class
public class RollDice extends JFrame {
	// Add Two Image Panel For Each Die
	private ImagePanel leftDie;
	private ImagePanel rightDie;

	// Label To Display Result
	JLabel lblTotal;

	public RollDice() {
		// Initialize Image Panels
		leftDie = new ImagePanel();
		rightDie = new ImagePanel();

		// Mouse Click Listener For Left Die Image Panel
		leftDie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leftDie.randomizeDie();
				updateResult();
			}
		});

		// Mouse Click Listener For Right Die Image Panel
		rightDie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rightDie.randomizeDie();
				updateResult();
			}
		});

		// Create A New JPanel To Hold The Two ImagePanel
		JPanel diePanel = new JPanel();
		// Set Layout As Flow Layout
		diePanel.setLayout(new FlowLayout());

		// Add Image Panels
		diePanel.add(leftDie);
		// For Margin
		diePanel.add(Box.createHorizontalStrut(30));
		diePanel.add(rightDie);

		// Button And Label Panel
		JPanel buttonPanel = new JPanel();
		// Set Layout As Box Layout
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

		// Create And Add Label
		lblTotal = new JLabel();
		lblTotal.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Update Result Value
		updateResult();

		// Create An Add Button
		JButton btnRoll = new JButton("Roll Dice");
		btnRoll.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Button Click Listener
		btnRoll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Randomize Both Dice
				leftDie.randomizeDie();
				rightDie.randomizeDie();
				// Update The Total
				updateResult();
			}
		});
		

		// Add The Label And Button
		buttonPanel.add(lblTotal);
		buttonPanel.add(Box.createRigidArea(new Dimension(0, 8)));
		buttonPanel.add(btnRoll);
		buttonPanel.add(Box.createRigidArea(new Dimension(0, 8)));
		
		// Add Dice Panel And Button Panel
		this.getContentPane().add(diePanel, BorderLayout.CENTER);
		this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		// Setup JFrame
		this.setSize(600, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	// Displays Total Dice Value
	private void updateResult() {
		int total = leftDie.getDieFaceValue() + rightDie.getDieFaceValue();
		lblTotal.setText("Result: " + total);
	}

	public static void main(String[] args) {
		new RollDice();
	}
}