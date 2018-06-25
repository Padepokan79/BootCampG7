package luasKeliling;

public class Lingkaran {
	int jarijari;
	double phi, keliling, luas;
	
	public Lingkaran() {
		
	}
	
	public Lingkaran(int jarijari, double phi, double luas, double keliling) {
		this.jarijari = jarijari;
		this.phi = phi;
		this.luas = luas;
		this.keliling = keliling;	
	}
	
	public void luasLingkaran(int jarijari) {
		this.jarijari = jarijari;
		if(this.phi % 7 == 0) {
			this.phi = 22.0/7.0;
		}
		else {
			this.phi = 3.14;
		}
		this.luas = this.phi * Math.pow(jarijari, 2);		
	}
	
	public void kelilingLingkaran(int jarijari) {
		this.jarijari = jarijari;
		if(this.phi % 7 == 0) {
			this.phi = 22.0/7.0;
		}
		else {
			this.phi = 3.14;
		}
		this.keliling = 2 * this.phi * jarijari;
	}

	public void printLuasLingkaran() {
		System.out.println("Luas Lingkaran adalah : " + luas);
	}
	
	public void printKelilingLingkaran() {
		System.out.println("Keliling Lingkaran adalah : " + keliling);		
	}	
}
