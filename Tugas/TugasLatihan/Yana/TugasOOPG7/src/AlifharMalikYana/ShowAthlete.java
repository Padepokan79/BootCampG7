package AlifharMalikYana;

public class ShowAthlete {

	public static void main(String[] args) {
		Athlete athlete = new Athlete("Athlete Sepakbola", "123456", "Laki-laki", 175, 58, 23);
		FootballPlayer footballPlayer = new FootballPlayer("Keeper", 3, 3, 3, 7, athlete);
		
		System.out.println("\nATHLETE");
		System.out.println(athlete.tampilAthlete());
		System.out.println("\nFOOTBALL PLAYER");
		System.out.println(footballPlayer.tampilFottbalPlayer());
		System.out.println("Latihan Tendang "+footballPlayer.latihanMenendang(10));		
	}

}
