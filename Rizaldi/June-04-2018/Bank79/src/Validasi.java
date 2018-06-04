
public class Validasi {
	
	public static Boolean validasiHuruf(Boolean cek, String inputString) {
		if (inputString.matches("([a-zA-Z.])+")) {
			cek=true;
		}
		else {
			System.out.println("input Harus alphabet tanpa Nomor");
		}
		return cek;
	}
	
	public static Boolean validasiAngka(Boolean cek, String inputString) {
		if (inputString.matches("([0-9])+")) {
			cek=true;
		}
		else {
			System.out.println("input Harus nomor tanpa koma");
		}
		return cek;
	}
}
