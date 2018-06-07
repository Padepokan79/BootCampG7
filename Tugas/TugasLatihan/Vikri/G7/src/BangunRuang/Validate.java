package BangunRuang;

public class Validate {
	String bangunan, valAngkaa, valConn;
	int batas2 = 1, batas3 = 1, hasilConv;
	boolean b = false;
	public Validate() {
		
	}
	void valBangunRuang(String bangunan) {
		String arrBangunan[] = {"Persegi", "Persegi Panjang", "Lingkaran", "Segitiga"};
		this.bangunan = bangunan;
		for(int i = 0; i < arrBangunan.length; i++) {
			if(bangunan.equals(arrBangunan[i])) {
				b = true;
				batas2 = 0;
			}
		}
		if(b == false) {
			System.out.println("Bentuk bangunan tidak terkenali");
		}
	}
	
	static Boolean validHuruf(String a) {
		String arrBangunRuang[] = {"Kubus", "Balok", "Bola", "Tabung"};
		String c = a;
		Boolean cek = false;
		
		for(int valH = 0 ; valH < arrBangunRuang.length; valH++) {
			if(arrBangunRuang[valH] == c) {
				cek = true;
			}
		}
		if(cek == false) {
			System.out.println("Bangun ruang tidak terkenali");
		}
		return cek;
	}
	
	void valAngka(String v) {
		valAngkaa = v;
		if(valAngkaa.matches("[0-9-.]+")) {
			int cek = Integer.parseInt(valAngkaa);
			if(cek < 0) {
				System.out.println("Angka tidak boleh kurang dari 0");
			} else {
				batas3 = 0;
			}
		} else {
			System.out.println("Hanya bisa diinputkan angka");
		}
	}
	
	void valConv(String con) {
		valConn = con;
		Integer.parseInt(valConn);
	}
}
