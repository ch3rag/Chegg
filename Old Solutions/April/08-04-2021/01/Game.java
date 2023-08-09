public class Game {
	private String date;
	private Team home;
	private Team away;
	private int homeScore;
	private int awayScore;
	private String gameEnding;

	public Game(String date, Team home, Team away, int homeScore, int awayScore, String gameEnding) {
		this.date = date;
		this.home = home;
		this.away = away;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.gameEnding = gameEnding;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Team getHome() {
		return this.home;
	}

	public void setHome(Team home) {
		this.home = home;
	}

	public Team getAway() {
		return this.away;
	}

	public void setAway(Team away) {
		this.away = away;
	}

	public int getHomeScore() {
		return this.homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public int getAwayScore() {
		return this.awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

	public String getGameEnding() {
		return this.gameEnding;
	}

	public void setGameEnding(String gameEnding) {
		this.gameEnding = gameEnding;
	}

	@Override
	public String toString() {
		return String.format("%nDate: %s Home: %-15s HomeScore: %d Away: %-15s AwayScore: %d Ending: %s", 
			this.date, this.home.getName(), this.homeScore, this.away.getName(), this.awayScore, this.gameEnding);
	}
}
