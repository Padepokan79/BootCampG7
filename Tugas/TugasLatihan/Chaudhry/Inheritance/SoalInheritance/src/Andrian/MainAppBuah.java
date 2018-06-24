package Andrian;

public class MainAppBuah {
	public static void main(String[] args) {
		Buah buah = new Buah("Tunggal", "Berdaging");
		Jeruk jeruk = new Jeruk(buah, "Jeruk", 20000, "Asem", "Kuning Oranye", "Lembut bergelombang", "Vitamin C");
		
		System.out.println("");
		System.out.println("");
		System.out.println(jeruk.toString());
		jeruk.kenyang();
		jeruk.penyembuh();
		jeruk.tekananDarah();
	}
}
