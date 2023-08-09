// MyDate Class
public class MyDate {

	// Day
	public int Day { get; set; }
	// Month
	public int Month { get; set; }
	// Year
	public int Year { get; set; }
	// Constructor
	public MyDate (int day, int month, int year) {
		Day = day;
		Month = month;
		Year = year;
	}

	// To String
	public override string ToString() {
		return $"{Day}-{Month}-{Year}";
	}

}