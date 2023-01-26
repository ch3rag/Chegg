// Team.java

// Represents A Collection Of Players Who Play Paintball Tag Game
public class Team {
	// Maximum Team Size Constant
	public static final int MAX_TEAM_SIZE = 5;

	// Array To Hold Team Members
	private Player[] players;
	// Players Currently In The Team
	private int teamSize;
	
	// Adds A Member To The Team
	public boolean addMember(Player newOne) {
		if (teamSize == MAX_TEAM_SIZE || hasPlayer(newOne)) {
			// No Room In The Team Or Player Already In Team
			return false;
		}
		// Add The Player
		players[teamSize++] = newOne;
		return true;
	}

	// Returns True If The Team Has A Player
	private boolean hasPlayer(Player player) {
		for (int i = 0; i < teamSize; i++) {
			if (players[i].equals(player)) {
				return true;
			}
		}
		return false;
	}

	// Constructor
	public Team() {
		// Initialize Array Of Players
		players = new Player[MAX_TEAM_SIZE];
		teamSize = 0;
	}
	
	// Returns Information About The Team
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Team members:\n");
		for (int i = 0; i < teamSize; i++) {
			sb.append(String.format("%d. %s\n", i + 1, players[i].getName()));
		}
		return sb.toString();
	}


	// Returns True If There Is A Player Who Is In Both Teams
	public boolean hasCommonPlayers(Team other) {
		for (Player player : other.getRoster()) {
			if (hasPlayer(player)) {
				return true;
			}
		}
		return false;
	}

	// Returns True If The Team Is Full
	public boolean teamFull() {
		return teamSize == MAX_TEAM_SIZE;
	}

	// Returns An Array Of Players Currently In The Team
	public Player[] getRoster() {
		Player[] playersCopy = new Player[teamSize];
		for (int i = 0; i < teamSize; i++) {
			playersCopy[i] = players[i];
		}
		return playersCopy;
	}

	// Removes A Player From The Team
	public boolean removePlayer(Player toRemove) {
		if (hasPlayer(toRemove)) {
			// Player Is The Team
			for(int i = 0; i < teamSize; i++) {
				if (players[i].equals(toRemove)) {
					for (int j = i; j < teamSize - 1; j++) {
						players[j] = players[j + 1];
					}
					teamSize--;
					return true;
				}
			}
		}
		return false;
	}
}
