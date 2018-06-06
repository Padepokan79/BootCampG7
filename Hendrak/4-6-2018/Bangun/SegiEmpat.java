package Bangun;

public class SegiEmpat {
	double panjang, sisi,lebar,tinggi,luas,keliling, volume;
	
	
	public SegiEmpat() {
		
	}
	
	public SegiEmpat(double s) {
		sisi = s;
	}
	
	public SegiEmpat(double p, double l) {
		panjang = p;
		lebar = l;
	}
	
	public SegiEmpat(double p, double l, double t) {
		panjang = p;
		panjang = l;
		tinggi = t;
	}
	
	void cariLKPersegiPanjang(double p, double l) {
		keliling = 2.0*(p+l);
		luas = p*l;
	}
	
	void cariVPersegiPanjang(double p, double l, double t) {
		keliling = 2.0*(p+l);
		luas = p*l;
		volume = p*l*t;
	}
	
	void tampilPersegiPanjangLK() {
		System.out.printf("Luas Segi Empat adalah %.2f \n", luas);
		System.out.printf("Keliling Segi Empat adalah %.2f \n",keliling);
		
	}
	
	void tampilPersegiPanjangV() {
		System.out.printf("Volume Persegi Panjang adalah %.2f \n",volume);
	}
	
	void cariLKVPersegi(double s) {
		luas = s*s;
		keliling = 4*s;
		volume = s*s*s;	
	}
	
	void tampilPersegiLK() {
		System.out.printf("Luas Persegi adalah %.2f \n", luas);
		System.out.printf("Keliling Persegi adalah %.2f \n",keliling);
		
	}
	
	void tampilPersegiV() {
		System.out.printf("Volume Persegi adalah %.2f \n",volume);
	}
	
}
