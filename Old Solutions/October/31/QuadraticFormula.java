// QuadraticFormula.java

// Result Enum
enum Result {
	NOT_QUADRATIC,
	NO_REAL_SOLS,
	ONE,
	TWO,
};

// Quadratic Equation Solver Class
public class QuadraticFormula {
	//  Attributes To Store Coefficients Of Quadratic Equation
	private double a;
	private double b;
	private double c;

	// Constructor
	public QuadraticFormula(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Solves The Equation Using Quadratic Formula
	public Result Solve(double[] roots) {
		
		// For A Quadratic A > 0
		if (a == 0) {
			return Result.NOT_QUADRATIC;
		}

		// Compute Discriminant
		double discriminant = (b * b) - (4 * a * c);

		if (discriminant < 0) {
			// For D < 0, Roots Are Distinct And Imaginary
			return Result.NO_REAL_SOLS;
		} else if (discriminant < 0.001) {
			// For D = 0, Roots Are Real And Same
			roots[0] = roots[1] = (-b) / (2 * a);
			return Result.ONE;
		} else {
			// For D > 0, Roots Are Real And Distinct
			roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
			roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
			return Result.TWO;
		}
	}
}
