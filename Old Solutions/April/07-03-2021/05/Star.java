import java.awt.*;
import javax.swing.*;

public class Star extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(160, 130, 100, 50, 10, g);
	}

	public void draw(int x, int y, int r1, int r2, int n, Graphics g) {
		int x1, y1, x2, y2;
		double angle1 = 0; double angle2 = Math.PI / n;
		Polygon p = new Polygon();

		int xc = x - (int)(r2 * Math.cos(angle2));
		int yc = y + (int)(r2 * Math.sin(angle2));

		g.fillOval(x - 3, y - 3, 6, 6);

		for (int i = 0; i <= n; i++) {

			x1 = (int)Math.round(r1 * Math.cos(angle1)) + xc;
			y1 = (int)Math.round(r1 * Math.sin(angle1)) + yc;

			x2 = (int)Math.round(r2 * Math.cos(angle2)) + xc;
			y2 = (int)Math.round(r2 * Math.sin(angle2)) + yc;

			p.addPoint(x1, y1); p.addPoint(x2, y2);

			angle1 = angle1 + 2 * Math.PI / n;
			angle2 = angle2 + 2 * Math.PI / n;
		}

		g.setColor(Color.RED); g.drawPolygon(p);
		g.setColor(Color.BLUE);

		g.drawOval(xc - r2 , yc - r2, r2 * 2, r2 * 2);
		g.drawOval(xc - r1 , yc - r1, r1 * 2, r1 * 2);
	}
}
