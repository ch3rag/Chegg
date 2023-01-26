// Player.java

// Represents A Single Paintball Tag Player
public class Player {
	// Private Attributes
	// Name Of The Player
	private String name;
	// Number Of Games Played
	private int numGames;
	// Sum Of All Scores
	private int sumScores;

	// Constructor
	public Player(String name) {
		this.name = name;
		numGames = 0;
		sumScores = 0;
	}

	// Adds A Game Result
	public void addGameResult(int newScore) {
		numGames++;
		sumScores += newScore;
	}

	// Checks Player's Equality
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Player) {
			Player other = (Player) obj;
			return name.equals(other.name);
		}
		return false;
	}

	// Returns The Name Of The Player
	public String getName() {
		return name;
	}

	// Returns Information About The Player As String
	@Override
	public String toString() {
		if (numGames == 0) {
			return String.format("Player: %s has played no games", name);
		} else if (numGames == 1) {
			return String.format("Player: %s has played 1 game with an average of %d",
				name, sumScores / numGames);
		} else {
			return String.format("Player: %s has played %d games with an average of %d",
				name, numGames, sumScores / numGames);
		}
	}
}
