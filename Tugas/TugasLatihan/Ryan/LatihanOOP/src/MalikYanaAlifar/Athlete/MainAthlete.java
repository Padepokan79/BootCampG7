package MalikYanaAlifar.Athlete;

public class MainAthlete {

	public static void main(String[] args) {
		Athlete ath = new Athlete("Ryan", "L", "12345", 170, 55, 18);
		AthleteFootball athF = new AthleteFootball(ath, "Stopper", 99, 89, 97, 89);
	
		System.out.println(athF.toString());

	}

}
