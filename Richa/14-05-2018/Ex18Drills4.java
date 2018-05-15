import java.util.Scanner;

public class Ex18Drills4 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int jumlahPenumpang, kursi60, kursi12, kursi18, kursi45, kursi32, kursi6;

	System.out.println ("WELCOME TO IKAN TRAVEL");

	System.out.print ("Masukkan jumlah penumpang: ");
	jumlahPenumpang = keyboard.nextInt ();

	kursi60 = 60;
	kursi45 = 45;
	kursi32 = 32;
	kursi18 = 18;
	kursi12 = 12;
	kursi6 = 6;

	System.out.println ("Bis yang tersedia:");
	System.out.println ();

	if (jumlahPenumpang >= kursi60) {
		System.out.println ("Bis dengan kursi 60");
	}

	if (jumlahPenumpang >= kursi45) {
		System.out.println ("Bis dengan kursi 45");
	}

	if (jumlahPenumpang >= kursi32) {
		System.out.println ("Bis dengan kursi 32");
	}

	if (jumlahPenumpang >= kursi18) {
		System.out.println ("Bis dengan kursi 18");
	}
	
	if (jumlahPenumpang >= kursi12) {
		System.out.println ("Bis dengan kursi 12");
	}

	if (jumlahPenumpang >= kursi6) {
		System.out.println ("Bis dengan kursi 6 Executive");
	}
	else {System.out.println ("Bis dengan kursi 6 Executive");}
}
}




/*IKAN Travel 6b

Bis Dengan Kursi 60
Bis Dengan Kursi 45
Bis Dengan Kursi 32
Bis Dengan Kursi 18
Bis Dengan Kursi 12
Bis Dengan Kursi 6 Executive

Masukan Jumlah Penumpang: 31
Bis yang tersedia:

Bis Dengan Kursi 18
Bis Dengan Kursi 12
Bis Dengan Kursi 6 Executive */
