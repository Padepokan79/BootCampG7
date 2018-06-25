package luasKeliling;

public class Segitiga {
	int alas, tinggi;
	double diagonal, luas, keliling;
	
	public Segitiga() {
		
	}
	
	public Segitiga(int alas, int tinggi, double luas, double keliling) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.luas = luas;
		this.keliling = keliling;	
	}
	
	public void luasSegitiga(int alas, int tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.luas = 0.5 * alas * tinggi;
	}
	
	public void kelilingSegitiga(int alas) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.keliling = alas * 3;
	}
	
	public void printLuasSegitiga() {
		System.out.println("Luas Segitiga adalah : " + this.luas);
	}
	
	public void printKelilingSegitiga() {
		System.out.println("Keliling Segitiga adalah : " + this.keliling);
	}
}