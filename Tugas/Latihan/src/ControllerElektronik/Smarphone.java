package ControllerElektronik;

public class Smarphone {
	public String merekHp, warnaHp, osHp;
	public int batereHp;
	public double ukuranLayarHp;
	
	public Smarphone() {
		
	}
	
	public Smarphone(String merekHp, String warnaHp, String osHp, int batereHp, double ukuranLayarHp) {
		this.merekHp = merekHp;
		this.warnaHp = warnaHp;
		this.osHp = osHp;
		this.batereHp = batereHp;
		this.ukuranLayarHp = ukuranLayarHp;
	}
	
	public void inisialSmartphone(String merekHp, String warna, String osHp, int batereHp, double ukuranLayarHp) {
		this.merekHp = merekHp;
		this.warnaHp = warna;
		this.osHp = osHp;
		this.batereHp = batereHp;
		this.ukuranLayarHp = ukuranLayarHp;
	}
	
	public void tampilSmartphone() {
		System.out.println("Aku ingin membeli HP merek "+merekHp);
		System.out.println("dan memiliki warna "+warnaHp);
		System.out.println("dengan sistem operasi "+osHp);
		System.out.println("minimal baterai "+batereHp+" MAh");
		System.out.println("dengan ukuran layar "+ukuranLayarHp+" Inch");
	}
	
	
}
