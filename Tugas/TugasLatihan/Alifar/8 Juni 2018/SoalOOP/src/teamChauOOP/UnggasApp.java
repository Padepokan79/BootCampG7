package teamChauOOP;

public class UnggasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unggas unggas=new Unggas("Burung Unta", "paru-paru", 12, 8);
		Unta unta=new Unta(unggas, "hitam", "Grgrgr", 21);
		
		System.out.println(unta.bunyi());
		System.out.println(unta.terbang());
		System.out.println(unggas.toString());
		System.out.println(unta.toString());
	}
}
