package TimRizaldi;

import java.util.Random;
public class Pakaian {
     Random rand = new Random();
	 private String ukuran, warna, merek, jenisBahan, madeIn;
	 private int harga;
	 
	 Pakaian(){
		 
	 }
	 
	 public Pakaian(String ukuran, String warna, String merek, String jenisBahan, String madeIn, int harga){
		 this.ukuran 	 = ukuran;
		 this.warna 	 = warna;
		 this.merek  	 = merek;
		 this.jenisBahan = jenisBahan;
		 this.madeIn 	 = madeIn;
		 this.harga 	 = harga;
	 }
	 
	 String nilai() {
		 if (harga > 100000) {
			return "Mahal";
		}else {
			return "Murah";
		}
	 }
	 
	 String warna() {
		 if (warna.equals("pink") || warna.equals("kuning")) {
			return "Cewek";
		}else {
			return "Cowok";
		}
	 }
	 
	 void merek() {
		 int random = rand.nextInt(300000)+200000;
		 if (merek.equals("nike") || merek.equals("addidas")) {
			if (harga > 200000) {
				harga = harga;
			}else {
				harga = random;
			}
		}
	 }
	 
	 void ukuran() {
		 if (ukuran.equals("S") || ukuran.equals("M")) {
			harga -= 15000;
		}else if (ukuran.equals("L") || ukuran.equals("XL")) {
			harga -= 10000;
		}
	 }
	 
	 public String toTampil() {
		 return "Merek\t: "+merek+"\nUkuran\t: "+ukuran+"\nWarna\t: "+warna+"\nBahan \t: "+jenisBahan+"\nMade\t: "+madeIn+"\nHarga\t: "+harga;
	 }
	 
	 
	 
	 

}
