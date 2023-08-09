import java.util.Scanner;

// P3.java
// Tester Class
public class P3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the height of ball");
		double h = in.nextDouble();

		double a = -9.81 * 0.5;
		double b = 20;
		double c = 5 - h;

		double[] roots = new double[2];
		QuadraticFormula solver = new QuadraticFormula(a, b, c);
		Result res = solver.Solve(roots);
		switch (res) {
			case NOT_QUADRATIC:
				System.out.println("Not a quadratic equation");
				break;
			case NO_REAL_SOLS:
				System.out.println("The ball will never reach height " + h);
				break;
			case TWO:
				System.out.println("The ball will reach that height at times " +
					roots[0] + " and " + roots[1]);
				break;
			case ONE:
				System.out.print("The ball will reach that height at time " + roots[0]);
				break;
		}

	}	
}
