using System;

class Program {
	// String 2D Array To Hold Each Day Of The Year
	// Row => Months, Columns => Days (1 To 31)
	// We Will Use 31 Days As Columns For Simplicity
	static string[,] zodiacMap = new string[12, 31];

	// Populates ZodiacMap With Symbol
	static void populate(string sign, int sMonth, int sDay, int eMonth, int eDay) {
		// Convert Month And Day To 0-Index
		sMonth -= 1; sDay -= 1;
		eMonth -= 1; eDay -= 1;
		// Compute Start/End Day Number Based On Month And Day
		int sIdx = (sMonth * 31) + sDay;
		int eIdx = (eMonth * 31) + eDay;
		// Loop From Start Day To End Day Number
		for (int i = sIdx; i <= eIdx; i++) {
			// Compute Month And Day Of Month
			int month = i / 31;
			int day = i % 31;
			// Assign Zodiac To That Day
			zodiacMap[month, day] = sign;
		}
	}

	static void Main() {
		// Populate Zodiac Map With Each Sign
		// ♈ Aries (Ram): March 21–April 19
		populate("Aries", 3, 21, 4, 19);

		// ♉ Taurus (Bull): April 20–May 20
		populate("Taurus", 4, 20, 5, 20);

		// ♊ Gemini (Twins): May 21–June 21
		populate("Gemini", 5, 21, 6, 21);

		// ♋ Cancer (Crab): June 22–July 22
		populate("Cancer", 6, 22, 7, 22);

		// ♌ Leo (Lion): July 23–August 22
		populate("Leo", 7, 23, 8, 22);

		// ♍ Virgo (Virgin): August 23–September 22
		populate("Virgo", 8, 23, 9, 22);

		// ♎ Libra (Balance): September 23–October 23
		populate("Libra", 9, 23, 10, 23);

		// ♏ Scorpius (Scorpion): October 24–November 21
		populate("Scorpius", 10, 24, 11, 21);

		// ♐ Sagittarius (Archer): November 22–December 21
		populate("Sagittarius", 11, 22, 12, 21);

		// ♑ Capricornus (Goat): December 22–January 19
		populate("Capricornus", 12, 22, 12, 31);
		populate("Capricornus", 1, 1, 1, 19);

		// ♒ Aquarius (Water Bearer): January 20–February 18
		populate("Aquarius", 1, 20, 2, 18);

		// ♓ Pisces (Fish): February 19–March 20
		populate("Pisces", 2, 19, 3, 20);

		Console.WriteLine("[What's Your Sign?]");

		// Input Month
		Console.Write("What month were you born in? ");
		int month = Int32.Parse(Console.ReadLine());

		// Check If Valid Month
		if (month >= 1 && month <= 12) {

			// Input Day
			Console.Write("And What Day? ");
			int day = Int32.Parse(Console.ReadLine());

			// Check If Valid Day
			if (day >= 1 && day <= 31) {
				// Valid Input
				// Display Sign
				Console.WriteLine("\nYour Sign is {0}!", zodiacMap[month - 1, day - 1]);
			} else {
				// Invalid Day
				Console.WriteLine("That's Not A Valid Day!");	
			}
		} else {
			// Invalid Month
			Console.WriteLine("That's Not A Valid Month!");
		}
	}
}
