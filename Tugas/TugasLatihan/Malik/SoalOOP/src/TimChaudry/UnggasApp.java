package TimChaudry;

public class UnggasApp {

	public static void main(String[] args) {
		Unggas unggas = new Unggas("Unta", "Paru-paru", 12, 8);
		Unta unta = new Unta(unggas, "grgrgrg", "hitam", 21);
		
	
		System.out.println(unta.toString());
		System.out.println(unta.terbang());

	}

}
