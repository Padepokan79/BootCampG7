package Validasi;

public class ValidasiAngka {
	
	public static boolean validasiAngka(String namaStr) {
		boolean cek;
		if (namaStr.matches("([0-9])*")) {
			System.out.println("Your Input must be alphabet\nInput again");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}
	
	public static boolean validasiGender(String namaStr) {
		boolean cek;
		if (namaStr.matches("([0-9])*")) {
			System.out.println("Your Input must be alphabet\nInput again");
			cek = true;
		}else if (!(namaStr.equals("male") || namaStr.equals("female"))) {
			System.out.println("Your gender input nothing\nInput again (male/female)");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}
	
	public static boolean validasiMember(String namaStr) {
		boolean cek;
		if (namaStr.matches("([0-9])*")) {
			System.out.println("Your Input must be alphabet\nInput again");
			cek = true;
		}else if (!(namaStr.equals("y") || namaStr.equals("n"))) {
			System.out.println("Your gender input nothing\nInput again (y/n)");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}
	
	public static boolean validasiMemberType(String namaStr) {
		boolean cek;
		if (namaStr.matches("([0-9])*")) {
			System.out.println("Your Input must be alphabet\nInput again");
			cek = true;
		}else if (!(namaStr.equals("Premium") || namaStr.equals("Silver") || namaStr.equals("Gold"))) {
			System.out.println("Your gender input nothing\nInput again (Premium/Silver/Gold)");
			cek = true;
		}else {
			cek = false;
		}
		return cek;
	}
}
