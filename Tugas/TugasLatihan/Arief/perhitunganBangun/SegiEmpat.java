package perhitunganBangun;

public class SegiEmpat {
	double sisi, panjang, lebar, tinggi, luas, keliling, volume;
	
	public SegiEmpat () {
		
	}
	
//	public SegiEmpat (double s, double p, double l, double t, double lu, double kl, double vl) {
//		sisi = s;
//		panjang = p;
//		lebar = l;
//		tinggi = t;
//		luas = lu;
//		keliling = kl;
//		volume = vl;
//	}
	
	void luasPersegiPanjang(double p, double l){
		this.luas = p * l; 
		System.out.println("Luas Segi Empat = " + luas + " persegi");
	}
	
	void kelilingPersegiPanjang(double p, double l){
		this.keliling = (p + l) * 2;
		System.out.println("Keliling Segi Empat = " + keliling);
	}
	
	void luasPersegi(double s){
		this.luas = s * s;
		System.out.println("Luas Persegi = " + luas + " cm persegi");
		}
	
	void kelilingPersegi(double s){
		this.keliling = s * 4;
		System.out.println("Keliling Persegi = " + keliling);
	}
	
	void volumeKubus(double s) {
		this.volume = (double) Math.pow(s, 3);
		System.out.println("Volume Kubus " + volume + " cm kubik");
	}
	
	void volumeBalok(double p, double l, double t) {
		this.volume = p * l * t;
		System.out.println("Volume Balok " + volume + " cm kubik");
	}
	
}
