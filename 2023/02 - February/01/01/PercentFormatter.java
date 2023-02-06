import java.text.NumberFormat;

/*
* This utility class helps with printing tidy percentage values.
*
* You don't need to make any changes to it, just use it as is.
*/
public class PercentFormatter {

	private NumberFormat format;

	public PercentFormatter() {

		this.format = NumberFormat.getInstance();
		this.format.setMinimumFractionDigits(1);
		this.format.setMaximumFractionDigits(1);
	}

	/*
	 * Prints a percentage value from the given dividend and devisor.
	 *
	 * For example, passing 1 and 4 as the dividend and devisor respectively would
	 * return "25.0%"
	 */
	public String format(int dividend, int devisor) {

		if (devisor == 0) {
			return "N/A";
		}

		double fraction = (double) dividend / devisor;
		return format(fraction * 100);
	}

	/*
	 * Prints a percentage value from the given value.
	 *
	 * For example, passing 25 as the value would
	 * return "25.0%"
	 */
	public String format(double value) {
		return format.format(value) + "%";
	}
}
