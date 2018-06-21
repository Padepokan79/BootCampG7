package RichaRizaldiVikri;

public class Pakaian {
	 private String ukuran, warna, merek, jenisBahan, madeIn;
	 private double harga;
	 
	 public Pakaian() {
	}
	 
	 public Pakaian(String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga) {
		 this.ukuran 		= ukuran;
		 this.warna 		= warna;
		 this.merek 		= merek;
		 this.jenisBahan 	= jenisBahan;
		 this.madeIn 		= madeIn;
		 this.harga 		= harga;
	 }
	 
	 String nominalHarga() {
		 if (harga > 100000) {
			return "Mahal";
		}
		 else {
			 return "Murah";
		 }
	 }
	 
//	 String 
	 
	 String targetWarna() {
		 if (warna.equals("pink") || warna.equals("kuning")) {
			return "cewek";
		}
		 else{
			return "cowok";
		}
	 }
	 
	 void targetMerek() {
		if (merek.equals("adidas") || merek.equals("nike")) {
			 harga = 250000;
		}
	 }
	 
	 void targetUkuran() {
		if (ukuran.equals("S") || ukuran.equals("M")) {
			harga -= 15000;
		}
		 else if (ukuran.equals("L") || ukuran.equals("XL")) {
			harga += 15000;
		}
	 }
	 
	 String tampilPakaian() {
		 return "Pakaian[ukuran: " +ukuran+ ", warna: " +warna+ ", harga: " +harga+", merek: " +merek+", jenis bahan: " +jenisBahan+", made in: " +madeIn+"]";
	 }
}

/*
- String Ukuran
- String Warna
- Double Harga
- String Merek
- String jenisBahan
- String madeIn

*/