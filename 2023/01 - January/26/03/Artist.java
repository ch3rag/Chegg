// Artist.java

// Represents An Artist
public class Artist {
	// Declaring Required Variables
	private String artistName;
	private int birthYear;
	private int deathYear;

	// Default Constructor
	public Artist() {
		artistName = "unknown";
		birthYear = -1;
		deathYear = -1;
	}


	// Artist Constructor
	public Artist(String artistName, int birthYear, int deathYear) {
		this.artistName = artistName;
		this.birthYear = birthYear;
		this.deathYear = deathYear;
	}

	// Getters For Name
	public String getName() {
		return artistName;
	}

	// Getters For BirthYear
	public int getBirthYear() {
		return birthYear;
	}

	// Getters For DeathYear
	public int getDeathYear() {
		return deathYear;
	}

	// Printing Information
	public void printInfo() {
		// Death Year And Birth Year, Both Are Known
		if (deathYear != -1 && birthYear != -1) {
			System.out.printf("Artist: %s (%d to %d)\n",
				artistName, birthYear, deathYear);
		// Only Birth Year Is Known (Artist Is Alive)
		} else if (birthYear != -1) {
			System.out.printf("Artist: %s (%d to present)\n",
				artistName, birthYear);
		// Neither Of BirthYear And DeathYear Are Known
		} else {
			System.out.printf("Artist: %s (unknown)\n",
				artistName);
		}
	}
}
