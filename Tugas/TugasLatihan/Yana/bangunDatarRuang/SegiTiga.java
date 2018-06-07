package bangunDatarRuang;

public class SegiTiga {
	double 	sisiST1, sisiST2, sisiST3;
	double 	seriperimeterSE, luasSegitigaSE, kelilingSegitigaSE;
	
	public SegiTiga() {
		
	}
	//luas segitiga
	void luasSegitiga() {
		seriperimeterSE = (sisiST1 + sisiST2 + sisiST3) / 2;
		luasSegitigaSE  = Math.sqrt(seriperimeterSE * (seriperimeterSE - sisiST1) * (seriperimeterSE - sisiST2) * (seriperimeterSE - sisiST3));
	}
	//cetak luas segitiga
	void printLuasSegitig() {
		System.out.println("Luas Segitiga adalah "+luasSegitigaSE);
	}
	//keliling segitiga
	void kelilingSegitiga() {
		kelilingSegitigaSE = sisiST1 + sisiST2 + sisiST3;
	}
	//cetak keliling segitiga
	void printKelilingSegitiga() {
		System.out.println("Keliling Segitiga adalah "+kelilingSegitigaSE);
	}
}
