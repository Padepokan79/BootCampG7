
package test1;

public class KipasAngin {
	String merk, warna;
	double tinggi, berat;
	int kecepatan, harga;
	
	public KipasAngin() {
		
	}
	
	public KipasAngin(String merek, String wrn, double tgg, double brt, int kcptn, int hrg){
		merk = merek;
		warna = wrn;
		tinggi = tgg;
		berat = brt;
		kecepatan = kcptn;
		harga = hrg;
	}
	
	void kipas() {
		System.out.println("Kipas Angin dengan merk "+merk+" Berwarna "+warna+ " Dengan tinggi "+tinggi+" \nDan berat hanya "+berat+" Yang kecepatannya bisa sampai "+kecepatan+" \nhanya dibandrol dengan harga Rp. "+harga);
	}
	
	void kipas2() {
		merk = "Samsung";
		warna = "Merah";
		tinggi = 103;
		berat = 10.5;
		kecepatan = 136;
		harga = 250000;
		
		System.out.println("Kipas Angin dengan merk "+merk+" Berwarna "+warna+ " Dengan tinggi "+tinggi+" \nDan berat hanya "+berat+" Yang kecepatannya bisa sampai "+kecepatan+" \nhanya dibandrol dengan harga Rp. "+harga);
	}
}
