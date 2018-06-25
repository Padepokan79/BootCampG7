package bangunDatarRuang;

public class Lingkaran {
	double 	phiL, rL, tL, luasLingkaranL, kelilingLingkaranL, volumeBolaL, volumeTabungL;
	
	public Lingkaran() {
	}
	
	//luas lingkaran
	void luasLingkaran() {
		luasLingkaranL = phiL * rL * rL;
	}
	//cetak luas lingkaran
	void printLuasLingkaran() {
		System.out.println("Luas Lingkaran adalah "+luasLingkaranL);
	}
	//keliling lingkaran
	void kelilingLingkaran() {
		kelilingLingkaranL = 2 * phiL * rL;
	}
	//cetak keliling lingkaran
	void printKelilingLingkaran() {
		System.out.println("Keliling Lingkaran adalah "+kelilingLingkaranL);
	}
	//volume bola
	void volumeBola() {
		volumeBolaL = 4.0/3 * phiL * rL * rL * rL;
	}
	//cetak volume bola
	void printVolumeBola() {
		System.out.println("volume Bola adalah "+volumeBolaL);
	}
	//volume tabung
	void volumeTabung() {
		volumeTabungL = phiL * rL * rL * tL;
	}
	//cetak volume tabung
	void printVolumeTabung() {
		System.out.println("Volume Tabung adalah "+volumeTabungL);
	}
}
