package circle;

public class Circle {

  private double radius;
  private int x, y;

  Circle() {
    x = 0;
    y = 0;
    radius = 1;
  }

  Circle(double r) {
    x = 0;
    y = 0;
    radius = r;
  }

  Circle(int a, int b, double r) {
    x = a;
    y = b;
    radius = r;
  }

  public void setRadius(double r) {
    radius = r;
  }

  public void setX(int a) {
    x = a;
  }

  public void setY(int a) {
    y = a;
  }

  public double Area() {
    return radius * radius * 3.1415;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public double getRadius() {
    return radius;
  }

  public boolean isEqual(Circle c) {
	if (x == c.getX() && y == c.getY() && radius == c.getRadius()) {
		return true;
	}
	return false;
  }
}
