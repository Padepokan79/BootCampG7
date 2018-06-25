package Malik;

public class MainAppAthlete {
	public static void main(String[] args) {
		Athlete ath = new Athlete(170, 65, 18, "Nurdhiat", "Pria", "Indonesia");
		Football fb = new Football(ath, "Penyerang", 7, 8, 9, 6);
		

		System.out.println(ath.toString());
		System.out.println(fb.toString());
		System.out.println(fb.latihanTendangan(10));
	}
}
