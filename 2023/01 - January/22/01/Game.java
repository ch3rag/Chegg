// Game.java

// Represents A Single Game B/W Two Teams
public class Game {
	// Two Teams Playing The Game
	private Team team1;
	private Team team2;

	// Constructor
	public Game(Team team1, Team team2) { 
		this.team1 = team1;
		this.team2 = team2;
	}

	// Checks If The Game Is Valid
	public boolean validGame() {
		return !team1.hasCommonPlayers(team2) && team1.teamFull() && team2.teamFull();
	}

	// Awards Points To Winning Team
	public void awardWinner(Team winner, int points) {
		int equalPts = Math.floorDiv(points, Team.MAX_TEAM_SIZE);
		for (Player player : winner.getRoster()) {
			player.addGameResult(equalPts);
		}
	}

	// Prints The Information About The Game
	@Override
	public String toString() {
		if (validGame()) {
			StringBuilder sb = new StringBuilder("Team rosters:\n");
			Player[] team1Players = team1.getRoster();
			Player[] team2Players = team2.getRoster();
			for (int i = 0; i < Team.MAX_TEAM_SIZE; i++) {
				sb.append(String.format("%-20s%s\n",
					team1Players[i].getName(), team2Players[i].getName()));
			}
			return sb.toString();
		} else {
			return "Not a valid game";
		}
	}
}
