import java.util.Scanner;

public class richaIF1 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int jmlOrang, jmlHari;
	double budget, budgetLombok, budgetBangkok, budgetSingapura, budgetTokyo, pesawatLombok, pesawatBangkok, pesawatSingapura, pesawatTokyo,
	hotelLombok, hotelBangkok, hotelSingpura, hotelTokyo, makanLombok, makanBangkok, makanSingapura, makanTokyo, snorkling, ski, belanja, unvrslStudio;
	String nama, aktivitas;

	pesawatLombok = 2170000;
	pesawatBangkok = 3780000;
	pesawatSingapura = 1200000;
	pesawatTokyo = 4760000;
	hotelLombok = 255000;
	hotelBangkok = 305000;
	hotelSingpura = 335000;
	hotelTokyo = 355000;
	makanLombok = 75000;
	makanBangkok = 55000;
	makanSingapura = 85000;
	makanTokyo = 105000;
	snorkling = 250000;
	belanja = 300000;
	unvrslStudio = 360000;
	ski = 325000;


	System.out.println("========WELCOME TO TRAVEL 79.com==========");
	System.out.println ();
	System.out.println ("Tentukan dengan mudah destinasi terbaikmu!");

	System.out.print ("Nama: ");
	nama = keyboard.next ();

	System.out.print ("Berapa orang yang ikut travel bersamamu? ");
	jmlOrang = keyboard.nextInt ();

	System.out.print ("Berapa hari kamu akan pergi? ");
	jmlHari = keyboard.nextInt ();

	
	System.out.println ("Budget kamu berapa, " + nama + " ? ");
	budget = keyboard.nextDouble();


	// pilihan destinasi sebelum aktivitas opsional

	budgetLombok = (pesawatLombok*jmlOrang) + ((hotelLombok*(jmlOrang/2)*jmlHari) + (hotelLombok*(jmlOrang%2)*jmlHari)) + (makanLombok*jmlOrang*jmlHari);
	budgetBangkok = (pesawatBangkok*jmlOrang) + ((hotelBangkok*jmlOrang/2) + (hotelBangkok*jmlOrang%2)) + (makanBangkok*jmlOrang*jmlHari);
	budgetSingapura = (pesawatSingapura*jmlOrang) + ((hotelSingpura*jmlOrang/2) + (hotelSingpura*jmlOrang%2)) + (makanSingapura*jmlOrang*jmlHari);
	budgetTokyo = (pesawatTokyo*jmlOrang) + ((hotelTokyo*jmlOrang/2) + (hotelTokyo*jmlOrang%2)) + (makanTokyo*jmlOrang*jmlHari);

	/*System.out.println (budgetLombok);
	System.out.println (budgetSingapura);
	System.out.println (budgetBangkok);
	System.out.println (budgetTokyo); */

	if (budgetTokyo <= budget) {
		System.out.println ("Destinasi rekomendasi kami untuk Richa adalah Tokyo");
	}
	else if (budgetBangkok <= budget) {
		System.out.println ("Destinasi rekomendasi kami untuk Richa adalah Bangkok");
	}

	else if (budgetLombok <= budget) {
		System.out.println ("Destinasi rekomendasi kami untuk Richa adalah Lombok");
	}
	else if (budgetSingapura <= budget) {
		System.out.println ("Destinasi rekomendasi kami untuk Richa adalah Singapura");
	}
	else {System.out.println ("Mohon maaf kami tidak menemukan pilihan destinasi yang sesuai");}


	if (budgetTokyo<= budget) {
		System.out.println ("Apakah kamu ingin ski? (Y/N)");
		aktivitas = keyboard.next ();
		if (aktivitas.equals("Y")) {System.out.println ( "Total yang harus kamu bayar untuk ke Tokyo adalah " + (budgetTokyo + (ski*jmlOrang)));
		}
		else {System.out.println ( "Total yang harus kamu bayar untuk ke Tokyo adalah " + budgetTokyo);
		}
	}
	else if (budgetBangkok<= budget) {
		System.out.println ("Apakah kamu ingin belanja? (Y/N)");
		aktivitas = keyboard.next ();
		if (aktivitas.equals("Y")) {System.out.println ( "Total yang harus kamu bayar untuk ke Bangkok adalah " + (budgetBangkok + (belanja*jmlOrang)));
		}
		else {System.out.println ( "Total yang harus kamu bayar untuk ke Bangkok adalah " + budgetBangkok);
		}
	}
	else if (budgetLombok <= budget) {
		System.out.println ("Apakah kamu ingin snorkling? (Y/N)");
		aktivitas = keyboard.next ();
		if (aktivitas.equals("Y")) {System.out.println ( "Total yang harus kamu bayar untuk ke Lombok adalah " + (budgetLombok + (snorkling*jmlOrang)));
		}
		else {System.out.println ( "Total yang harus kamu bayar untuk ke Lombok adalah " + budgetLombok);
		}
	}
	else if (budgetSingapura <= budget){
		System.out.println ("Apakah kamu ingin pergi ke Universal Studio? (Y/N)");
		aktivitas = keyboard.next ();
		if (aktivitas.equals("Y")) {System.out.println ( "Total yang harus kamu bayar untuk ke Singapura adalah " + (budgetSingapura + (unvrslStudio*jmlOrang)));
		}
		else {System.out.println ( "Total yang harus kamu bayar untuk ke Singapura adalah " + budgetSingapura);
		}
	}



}
}



/*1. Travel 79.
bayangkan kamu ingin pergi untuk travelling namun kamu bingung untuk memilih destinasi
yang sesuai dengan budget kamu. Travel 79 akan merekomendasikan destinasi
yang sesuai dengan kondisi kamu. Berikut adalah pilihan destinasinya:

-Lombok-
tiket pesawat PP: 	Rp. 2.170.000,- per orang
hotel		: 	Rp. 255.000,- per malam per 2 orang
makan sehari	:	Rp. 75.000,- per hari per orang
Snorkling**	:	Rp. 250.000,- per orang


-Bangkok-
tiket pesawat PP: 	Rp. 3.780.000,- per orang
hotel		: 	Rp. 305.000,- per malam per 2 orang
makan sehari	:	Rp. 55.000,- per hari per orang
Snorkling**	:	Rp. 250.000,- per orang

-Singapura-
tiket pesawat PP: 	Rp. 1.200.000,- per orang
hotel		: 	Rp. 335.000,- per malam per 2 orang
makan sehari	:	Rp. 85.000,- per hari per orang
unvrsl studio**	:	Rp. 360.000,- per orang

-Tokyo-
-Singapura-
tiket pesawat PP: 	Rp. 4.760.000,- per orang
hotel		: 	Rp. 355.000,- per malam per 2 orang
makan sehari	:	Rp. 105.000,- per hari per orang
ski**		:	Rp. 325.000,- per orang

**optional

output :

========WELCOME TO TRAVEL 79.com==========

Tentukan dengan mudah destinasi terbaikmu!
Nama: Richa
Berapa orang yang ikut travel bersamamu? 3
Berapa hari kamu akan pergi? 3
Budget kamu berapa, Richa? 10.000.000
Destinasi rekomendasi kami untuk Richa adalah Lombok
Gagal: (Mohon maaf kami tidak menemukan pilihan destinasi yang sesuai)

Apakah kamu ingin snorkling? (Y/N)
Y

Total yang harus kamu bayar untuk ke Lombok adalah 9.465.000

**rekomendasi adalah destinasi yang paling murah dan mendekati budget */