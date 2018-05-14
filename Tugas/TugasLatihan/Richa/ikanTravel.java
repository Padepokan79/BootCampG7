import java.util.Scanner;

public class ikanTravel {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int jumlahPenumpang, kursi60, kursi12, kursi18, kursi45, kursi32, kursi6, sisaPenumpang1, maxPenumpang;
	double harga60, harga45, harga32, harga18, harga12, harga6;
	String rekomendasi = "rekomendasi", rekomendasi2 = "rekomendasi2";

	System.out.println ("=============================");
	System.out.println ("Selamat Datang di ikan Travel");
	System.out.println ();
	System.out.println ("Masukan Jumlah Penumpang :");
	jumlahPenumpang = keyboard.nextInt ();

	kursi60 = 60;
	kursi45 = 45;
	kursi32 = 32;
	kursi18 = 18;
	kursi12 = 12;
	kursi6 = 6;
	maxPenumpang = 120;

	harga60 = 2300000;
	harga45 = 2000000;
	harga32 = 1800000;
	harga18 = 1500000;
	harga12 = 1300000;
	harga6 = 2000000;

	System.out.println ();
	System.out.println ("Bus yang Tersedia Untuk Anda: ");
	System.out.println ();

	if (jumlahPenumpang >= kursi60) {
		System.out.println ("Bis dengan kursi 60\tRp. 2.300.000");
	}

	if (jumlahPenumpang >= kursi45) {
		System.out.println ("Bis dengan kursi 45\tRp. 2.000.000");
	}

	if (jumlahPenumpang >= kursi32) {
		System.out.println ("Bis dengan kursi 32\tRp. 1.800.000");
	}

	if (jumlahPenumpang >= kursi18) {
		System.out.println ("Bis dengan kursi 18\tRp. 1.500.000");
	}
	
	if (jumlahPenumpang >= kursi12) {
		System.out.println ("Bis dengan kursi 12\tRp. 1.300.000");
	}

	if (jumlahPenumpang >= kursi6) {
		System.out.println ("Bis dengan kursi 6 Executive\tRp. 2.000.000");
	}
	else {System.out.println ("Bis dengan kursi 6 Executive\tRp. 2.000.000");}
	System.out.println ();

	//bagian rekomendasi
	if (jumlahPenumpang > 120) {rekomendasi = "tidak tersedia";}

	else if (jumlahPenumpang >= kursi60) {
		sisaPenumpang1 = jumlahPenumpang - kursi60;
		if (jumlahPenumpang == 60) {
		rekomendasi = "1 bus Dengan " + kursi60 + " kursi " + " dengan harga " + harga60;
		}
		else if (sisaPenumpang1>45) { rekomendasi = "1 bus Dengan " + kursi60 + "kursi " + " dan " + "1 bus Dengan " + kursi60 + " dengan harga " + (harga60+harga60);
		}
		else if (sisaPenumpang1>32) { rekomendasi = "1 bus Dengan " + kursi60 + " kursi " + " dan " + "1 bus Dengan " + kursi45 + " dengan harga " + (harga60+harga45);
		}
		else if (sisaPenumpang1>18) { rekomendasi = "1 bus Dengan " + kursi60 + " kursi " + " dan " + "1 bus Dengan " + kursi32 + " dengan harga " + (harga60+harga32);
		}
		else if (sisaPenumpang1>12) { rekomendasi = "1 bus Dengan " + kursi60 + " kursi " + " dan " + "1 bus Dengan " + kursi18 + " dengan harga " + (harga60+harga18);
		} // ada kemungkinan 2 
		else if (sisaPenumpang1<=12) { rekomendasi = "1 bus Dengan " + kursi60 + " kursi " + " dan " + "1 bus Dengan " + kursi12 + " dengan harga " + (harga60+harga12);
		}
	}

	else if (jumlahPenumpang >= kursi45) {
		sisaPenumpang1 = jumlahPenumpang - kursi45; 
		if (jumlahPenumpang == 45) {
		rekomendasi = "1 bus Dengan " + kursi45 + " kursi " + " dengan harga " + harga45;
		}
		else if (sisaPenumpang1>32) { rekomendasi = "1 bus Dengan " + kursi45 + "kursi " + " dan " + "1 bus Dengan " + kursi45 + " dengan harga " + (harga45+harga32);
		}
		else if (sisaPenumpang1>18) { rekomendasi = "1 bus Dengan " + kursi45 + " kursi " + " dan " + "1 bus Dengan " + kursi32 + " dengan harga " + (harga45+harga18);
		}
		else if (sisaPenumpang1>12) { rekomendasi = "1 bus Dengan " + kursi45 + " kursi " + " dan " + "1 bus Dengan " + kursi18 + " dengan harga " + (harga45+harga12);
		}
		else if (sisaPenumpang1<=12) { rekomendasi = "1 bus Dengan " + kursi45 + " kursi " + " dan " + "1 bus Dengan " + kursi12 + " dengan harga " + (harga45+harga12);
		} //2 kemungkinan 46-50
	}

	else if (jumlahPenumpang >= kursi32) {
		sisaPenumpang1 = jumlahPenumpang - kursi32; 
		if (jumlahPenumpang == 32) {
		rekomendasi = "1 bus Dengan " + kursi32 + "kursi " + " dengan harga " + harga32;
		}
		else if (sisaPenumpang1>18) { rekomendasi = "1 bus Dengan " + kursi32 + "kursi " + " dan " + "1 bus Dengan " + kursi32 + " dengan harga " + (harga32+harga32);
		}
		else if (sisaPenumpang1>12) { rekomendasi = "1 bus Dengan " + kursi32 + " kursi " + " dan " + "1 bus Dengan " + kursi18 + " dengan harga " + (harga32+harga12);
		}
		else if (sisaPenumpang1<=12) { rekomendasi = "1 bus Dengan " + kursi32 + " kursi " + " dan " + "1 bus Dengan " + kursi12 + " dengan harga " + (harga32+harga12);
		}
	}

	else if (jumlahPenumpang >= kursi18) {
		sisaPenumpang1 = jumlahPenumpang - kursi18; 
		if (jumlahPenumpang == 18) {
		rekomendasi = "1 bus Dengan " + kursi18 + " kursi " + " dengan harga " + harga18;
		}
		else if (sisaPenumpang1>12) { rekomendasi = "2 bus Dengan " + kursi18 + " kursi " + " dengan harga " + (2*harga18);
		}
		else if (sisaPenumpang1<=12) { rekomendasi = "1 bus Dengan " + kursi18 + " kursi " + " dan " + "1 bus Dengan " + kursi12 + " dengan harga " + (harga18+harga12);
		}
	}

	else if (jumlahPenumpang >= kursi12) {
		if (jumlahPenumpang == 12) { 
		rekomendasi = "1 bus Dengan " + kursi12 + " kursi " + " dengan harga " + harga12;
		}
		else {rekomendasi = "2 bus Dengan " + kursi12 + " kursi " + " dengan harga " + (harga12*2);
		}
	}

	else if (jumlahPenumpang <= kursi6) {
		rekomendasi = "1 bus Dengan " + kursi6+ " kursi " + " dengan harga " + (harga6);
	}
	
	else if (jumlahPenumpang <= kursi12) {
		rekomendasi = "2 bus Dengan " + kursi6+ " kursi " + " dengan harga " + (harga6*2);
	}

	// yang memiliki kemungkinan harga yang sama

	System.out.println ("* Rekomendasi Bis Untuk anda " + rekomendasi);

	if (jumlahPenumpang == 64) {
		rekomendasi2 = "2 bus Dengan " + kursi32 + " kursi dengan harga " + (2*harga32);
	}
	
	else if (jumlahPenumpang >= 46 && jumlahPenumpang <= 50) {
		rekomendasi2 ="1 bus Dengan " + kursi32 + " kursi " + " dan " + "1 bus Dengan " + kursi18 + " dengan harga " + (harga18+harga32);
	}

	else if (jumlahPenumpang >= 73 && jumlahPenumpang <= 77) {
		rekomendasi2 ="1 bus Dengan " + kursi45 + " kursi " + " dan " + "1 bus Dengan " + kursi32 + " dengan harga " + (harga45+harga32);
	}
	else {rekomendasi2 = "tidak tersedia";}

	System.out.println ("* Rekomendasi Bis lain Untuk anda " + rekomendasi2);



	}
}

	

	// rekomendasi pilihan bis



	/*IKAN Travel 6b

Bis Dengan Kursi 60 	Rp. 2.300.000
Bis Dengan Kursi 45		Rp. 2.000.000
Bis Dengan Kursi 32		Rp. 1.800.000
Bis Dengan Kursi 18		Rp. 1.500.000
Bis Dengan Kursi 12		Rp. 1.300.000
Bis Dengan Kursi 6 Executive	Rp. 2.000.000



==========================
Selamat Datang di ikan Travel

Masukan Jumlah Penumpang : 
27

Bus yang Tersedia Untuk Anda:

Bis Dengan Kursi 18		Rp. 1.500.000
Bis Dengan Kursi 12		Rp. 1.300.000
Bis Dengan Kursi 6 Executive	Rp. 2.000.000

* Rekomendasi Bis Untuk anda
- 1 Bis Dengan 18 kursi dan 1 Bis dengan 12 Kursi dengan Harga 2.800.000*/