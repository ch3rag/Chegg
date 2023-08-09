import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("readme.txt");
		Scanner kb = new Scanner(file);

		ArrayList <Team> teams = new ArrayList<Team>();
		ArrayList <Game> games = new ArrayList<Game>();

		// Read all the teams
		for (int i = 0; i < 7; i++) {
			teams.add(new Team(kb.next(), kb.next()));
		}


		// Read all the games
		for (int i = 0; i < 32; i++) {
			String date = kb.next();
			Team home = lookUpTeam(teams, kb.next());
			int homeScore = kb.nextInt(); 
			Team away = lookUpTeam(teams, kb.next());
			int awayScore= kb.nextInt();
			String gameEnding = kb.next();
			games.add(new Game(date, home, away, homeScore, awayScore, gameEnding));
		}


		// Print all the teams
		System.out.println(teams);

		System.out.println();

		// Print all the games
		System.out.println(games);

		System.out.println();

		// Print summary
		System.out.printf("%-15s%-15s%-15s%n", "Date", "Winner", "Loser");
		for (Game game : games) {
			if (game.getHomeScore() > game.getAwayScore()) {
				System.out.printf("%-15s%-15s%-15s%n", game.getDate(), game.getHome().getName(), game.getAway().getName());
			} else {
				System.out.printf("%-15s%-15s%-15s%n", game.getDate(), game.getAway().getName(), game.getHome().getName());
			}
		}

		kb.close();
	}
	
	public static Team lookUpTeam(ArrayList<Team> teams, String teamName) {
		for (Team team : teams) {
			if (team.getName().equals(teamName)) {
				return team;
			}
		}
		return null;
	}
}
