package circle;

import java.util.Scanner;

public class Main {

  public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	Circle circleOne = new Circle();
	Circle circleTwo = new Circle();

	System.out.print("Enter X Position For The First Circle: ");
	circleOne.setX(scanner.nextInt());
	System.out.print("Enter Y Position For The First Circle: ");
	circleOne.setY(scanner.nextInt());

	System.out.print("Enter X Position For The Second Circle: ");
	circleTwo.setX(scanner.nextInt());
	System.out.print("Enter Y Position For The Second Circle: ");
	circleTwo.setY(scanner.nextInt());

	System.out.println("Circle 1, The Center Is At (" + circleOne.getX() + ", " + circleOne.getY() + ")");
	System.out.println("Circle 2, The Center Is At (" + circleTwo.getX() + ", " + circleTwo.getY() + ")");

	System.out.println("Circle 1 == Circle 2? " + circleOne.isEqual(circleTwo));
  }
}
