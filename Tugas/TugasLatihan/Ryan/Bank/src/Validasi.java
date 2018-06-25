import java.util.Scanner;

public class Validasi {

	public Validasi() {
		
	}
	
	public static String valid (boolean cek, String validasi, String kata) {
		Scanner key = new Scanner(System.in);
		do {
			System.out.print(kata);
			validasi = key.next();
			if(validasi.matches("[a-zA-Z]*")) {
				cek = true;
			}
			else {
				System.out.println("Hanya dapat menerima Huruf");
				cek = false;
			}
		}while(cek == false);
		
		return validasi;
	}
	
	public static String validas (boolean cek, String validasi, String kata) {
		Scanner key = new Scanner(System.in);
		do {
			System.out.print(kata);
			validasi = key.next();
			if(validasi.matches("[0-9]*")) {
				cek = true;
			}
			else {
				System.out.println("Hanya dapat menerima Angka");
				cek = false;
			}
		}while(cek == false);
		
		return validasi;
	}
	
	public static int konvert (String konv) {
		return Integer.parseInt(konv);
	}
}
