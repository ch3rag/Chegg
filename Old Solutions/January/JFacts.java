import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener {
	FlowLayout flow = new FlowLayout();
	JButton b = new JButton("Press to change fact");
	JLabel stars = new JLabel("**********************************************");
	JLabel fact = new JLabel();
	String[] quotes = new String[] { "Only seven prisoners were in the Bastille when it was stormed. ",
			"A Tale of Two Cities is a novel set during the French Revolution. ",
			"Perhaps 40,000 people were executed at the guillotine. ",
			"A loaf of bread cost a weeks wages prior to the French Revolution. ",
			"Thomas Jefferson was the U.S. Minister to France during the Revolution. ",
			"Protestant and Jewish religions were illegal in France before 1879. ",
	};
	int counter = 0;

	public JFacts() {

		// Set Layout
		getContentPane().setLayout(flow);

		// Set The First Fact In The Label
		fact.setText(quotes[counter]);

		
		// Add Components
		getContentPane().add(stars);
		getContentPane().add(fact);
		getContentPane().add(b);
		
		// Attach ActionListener To The Button
		b.addActionListener(this);
	}

	public static void main(String[] args) {
		JFacts rFrame = new JFacts();
		rFrame.setSize(440, 120);
		rFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Increment The Counter
		counter = (counter + 1) % quotes.length;
		// Switch To Next Fact
		fact.setText(quotes[counter]);
	}
}