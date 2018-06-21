package Rizaldi;

public class MainAppPakaian {
	public static void main(String[] args) {
		Pakaian pakai 	= new Pakaian("m", "merah", 150000, "unknown", "katun", "Belanda");
		Jaket 	jkt 	= new Jaket("l", "kuning", 90000, "Motorolla", "Perca", "Indonesia", "Jaket Travelling");
		Kaos 	ks 		= new Kaos("s", "pink", 120000, "adidas", "Katun", "Cimahi", "Santai");
		
		System.out.println("");
		System.out.println(pakai.toString());
		pakai.cekMahalMurah();
		pakai.cekGender();
		
		System.out.println("");
		System.out.println(jkt.toString());
		jkt.cekMahalMurah();
		jkt.cekGender();
		System.out.println("");
		
		ks.setWarna("putih");
		ks.setUkuran("xl");
		
		System.out.println(ks.toString());
		ks.cekMahalMurah();
		ks.cekGender();
		System.out.println("");
	}
}
