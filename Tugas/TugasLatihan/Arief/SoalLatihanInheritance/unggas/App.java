package unggas;

public class App {

	public static void main(String[] args) {
		Unggas ung = new Unggas("Trakea", "Berkicau", 8, 12);
		Burung bur = new Burung(ung, "Unta", "Hitam, Putih", 215, "YA");
		Ayam aym = new Ayam(ung, "Cemana", "Merah", 35);
		System.out.println(bur.printUnggas() + "\n" + aym.printUnggas());
	}
}
