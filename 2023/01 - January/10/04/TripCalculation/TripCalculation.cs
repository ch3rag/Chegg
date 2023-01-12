using System;
using System.Globalization;
using static System.Console;

class TripCalculation {
	static void Main() {
		// Set US As Current Culture
		Thread.CurrentThread.CurrentCulture = new CultureInfo("en-US");

		double price = 30.00;
		double tipRate = 0.20;
		int tipInDollars = 4;
		DisplayTipInfo(price, tipRate);
		DisplayTipInfo(price, tipInDollars);
	}

	public static void DisplayTipInfo(double price , double tipRate) {
		double tipInDollars = price * tipRate;
		double total = price + tipInDollars;
		WriteLine("Meal price: {0}. Tip percent: {1}",
			price.ToString("C"), tipRate.ToString("F2"));
		WriteLine("Tip in dollars: {0}. Total bill: {1}",
			tipInDollars.ToString("C"), total.ToString("C"));
	}

	public static void DisplayTipInfo(double price, int tipInDollars) {
		double tipRate = tipInDollars / price;
		double total = price + tipInDollars;
		WriteLine("Meal price: {0}. Tip percent: {1}",
			price.ToString("C"), tipRate.ToString("F2"));
		WriteLine("Tip in dollars: {0}. Total bill: {1}",
			tipInDollars.ToString("C"), total.ToString("C"));
	}
}