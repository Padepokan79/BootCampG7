package Validasi;

public class ValidasiMinUang {
	public ValidasiMinUang() {
		
	}
	
	public static boolean validasiMinUang(String uangTabungStr, boolean cek) {
		if (uangTabungStr.matches("([0-9])*")) {
			int uangTabungInt = Integer.parseInt(uangTabungStr);
			if (Integer.parseInt(uangTabungStr) < 1000) {
				System.out.println("Uang tidak boleh kurang dari Rp. 1000");
				cek = true;
			}else {
				cek = false;
			}
		}
		return cek;
	}
}
