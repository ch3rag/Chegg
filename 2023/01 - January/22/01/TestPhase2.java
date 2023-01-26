// TestPhase2.java

public class TestPhase2 {
	public static void main(String[] args) {
		Player pike = new Player("Ashley Johnson");
		Player vex = new Player("Laura Bailey");
		Player vax = new Player("Liam O'Brien");
		Player keyleth = new Player("Marisha Ray");
		Player scanlan = new Player("Sam Riegel");
		Player percy = new Player("Taliesin Jaffe");
		Player grog = new Player("Travis Willingham");

		Team voxMachina = new Team();
		voxMachina.addMember(pike);
		System.out.println(voxMachina);
		System.out.println();

		voxMachina.addMember(vex);
		System.out.println(voxMachina);
		System.out.println();

		voxMachina.addMember(vex);
		System.out.println(voxMachina);
		System.out.println();

		voxMachina.addMember(vax);
		voxMachina.addMember(keyleth);
		System.out.println(voxMachina);
		System.out.println();

		System.out.println("Is the team full? Should print false");
		System.out.println(voxMachina.teamFull());
		System.out.println();

		voxMachina.addMember(scanlan);
		System.out.println("Is the team full? Should print true");
		System.out.println(voxMachina.teamFull());
		System.out.println();

		Team cTeam = new Team();
		cTeam.addMember(percy);
		cTeam.addMember(vax);
		cTeam.addMember(grog);
		System.out.println(cTeam);

		System.out.println("Team has common players? Should print true");;
		System.out.println(voxMachina.hasCommonPlayers(cTeam));
		System.out.println();

		cTeam.removePlayer(vax);
		System.out.println(cTeam);
		System.out.println();

		System.out.println("Team has common players? Should print false");;
		System.out.println(voxMachina.hasCommonPlayers(cTeam));
		System.out.println();
	}
}
