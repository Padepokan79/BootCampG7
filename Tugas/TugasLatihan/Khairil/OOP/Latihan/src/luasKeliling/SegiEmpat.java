package luasKeliling;

public class SegiEmpat {
	int panjang, lebar, sisi, luas, keliling;
	
	public SegiEmpat() {
		
	}
	
	public SegiEmpat(int panjang, int lebar, int sisi, int luas, int keliling) {
		panjang = this.panjang;
		lebar = this.lebar;
		sisi = this.sisi;
		luas = this.luas;
		keliling = this.keliling;	
	}
	
	public void luasSegiEmpat(int sisi) {
		this.sisi = sisi;
		this.luas = (int) Math.pow(sisi, 2);
	}
	
	public void kelilingSegiEmpat(int sisi) {
		this.sisi = sisi;
		this.keliling = 4 * sisi;
	}
	
	public void luasSegiPanjang(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.luas = panjang * lebar;
	}
	
	public void kelilingSegiPanjang(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.keliling = 2 * (panjang + lebar);
	}
	
	public void printLuasSegiEmpat() {
		System.out.println("Luas Segi Empat adalah : " + luas);
	}
	
	public void printKelilingSegiEmpat() {
		System.out.println("Keliling Segi Empat adalah : " + keliling);		
	}
	
	public void printLuasSegiPanjang() {
		System.out.println("Luas Segi Panjang adalah : " + luas);		
	}
	
	public void printKelilingSegiPanjang() {
		System.out.println("Keliling Segi Panjang adalah : " + keliling);		
	}
}