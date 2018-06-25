package RizaldiRicha.Pakaian;

public class MainPakaian {

	public static void main(String[] args) {
		Jaket jaket = new Jaket("Army Ride", "L", "Hijau", "nike", "Baby Drill", "Cibaduyut", "Sweater");
		Kaos kaos = new Kaos("XL", "Putih", "Eiger", "Combed 30s", "Cimahi", "Polos");
		System.out.println(jaket.toString());
		System.out.println();
		System.out.println(kaos.toString());
	}

}
