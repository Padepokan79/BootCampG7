
import java.util.*;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		Boolean cek;
		
		cek = false;
		String inputString, name;
		System.out.println("=================================");
		
		cek=false;
		do {
			System.out.println("Silakan masukkan nama anda			: ");
			inputString = key.next();
			Validasi valHuruf = new Validasi();
			cek=valHuruf.validasiHuruf(cek, inputString);
		}while(cek==false);

		cek=false;
		do {
			System.out.println("Silakan masukkan nomor Identitas	: ");
			inputString = key.next();
			Validasi valAngka = new Validasi();
			cek=valAngka.validasiAngka(cek, inputString);
		}while(cek==false);
		
		System.out.println("=================================");
		System.out.println("nama anda adalah : ");
		System.out.println("nama anda adalah : ");
		
		
	}

}
