package bangunDatarRuang;

public class SegiEmpat {
	double 	sisiSE, panjangSE, lebarSE, tinggiSE, luasPersegiSE, kelilingPersegiSE, 
			luasPersegiPanjangSE, kelilingPersegiPanjangSE, volumeBalokSE, volumeKubusSE;
	
	public SegiEmpat() {
		
	}
	//menghitung luas persegi
	void luasPersegi() {
		luasPersegiSE = sisiSE * sisiSE;
	}
	//menghitung keliling persegi
	void kelililingPersegi() {
		kelilingPersegiSE = 4 * sisiSE;
	}
	//luas persegi panjang
	void luasPersegiPanjang() {
		luasPersegiPanjangSE = panjangSE * lebarSE;
	}
	//keliling persegi panjang
	void kelilingPersegiPanjang() {
		kelilingPersegiPanjangSE = 2 * (panjangSE + lebarSE);
	}
	//menghitung volume balok
	void volumeBalok(double panjang, double lebar, double tinggi) {
		panjangSE 	= panjang;
		lebarSE 	= lebar;
		tinggiSE 	= tinggi;
		volumeBalokSE = panjangSE * lebarSE * tinggiSE;
	}
	//volume kubus
	void volumeKubus(double sisi) {
		sisiSE = sisi;
		volumeKubusSE = sisiSE * sisiSE * sisiSE; 
	}
	//cetak luas persegi
	void printLuasPersegi() {
		System.out.println("Luas Persegi adalah "+luasPersegiSE);
	}
	//cetak keliling persegi
	void printKelilingPersegi() {
		System.out.println("Keliling Persegi adalah "+kelilingPersegiSE);		
	}
	//cetak luas persegi panjang
	void printLuasPersegiPanjang() {
		System.out.println("Luas Persegi Panjang adalah "+luasPersegiPanjangSE);
	}
	//cetak keliling persegi panjang
	void printKelilingPersegiPanjang() {
		System.out.println("Keliling Persegi Panjang adalah "+kelilingPersegiPanjangSE);
	}
	//cetak volume balok
	void printVolumeBalok() {
		System.out.println("Volume Balok adalah "+volumeBalokSE);
	}
	//cetak volume kubus
	void printVolumeKubus() {
		System.out.println("Volume Kubus adalah "+volumeKubusSE);
	}
}
