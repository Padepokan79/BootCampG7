/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 10.01 AM
Updated by			:
Updated Date/hour	:

*/
import java.util.Scanner;

public class RichaIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	double gaji, hargaMobil, hargaRumah, kreditRumah, kreditMobil, kebutuhan, tabungan;
	gaji = 8500000;
	hargaMobil = 45000000;
	hargaRumah = 125000000;

	System.out.print("Kredit rumah per bulan (%): ");
	kreditRumah = keyboard.nextDouble ();

	System.out.print("Kredit mobil per bulan (%): ");
	kreditMobil = keyboard.nextDouble ();

	if (kreditMobil < 3.0 && kreditRumah < 1.0) {
		kebutuhan = 0.5*gaji;
		tabungan = (gaji-kebutuhan)-((kreditRumah/100*hargaRumah) + (kreditMobil/100*hargaMobil));
		System.out.println("Tabungan Rudi Tabuti per bulan: Rp. " + tabungan);
	}
	else if (kreditMobil < 5.0 && kreditRumah < 2.0) {
		kebutuhan = 0.35*gaji;
		tabungan = (gaji-kebutuhan)-((kreditRumah/100*hargaRumah) + (kreditMobil/100*hargaMobil));
		System.out.println("Tabungan Rudi Tabuti per bulan: Rp. " + tabungan);
	}
	else if (kreditMobil < 7.0 && kreditRumah < 3.0) {
		kebutuhan = 0.25*gaji;
		tabungan = (gaji-kebutuhan)-((kreditRumah/100*hargaRumah) + (kreditMobil/100*hargaMobil));
		System.out.println("Tabungan Rudi Tabuti per bulan: Rp. " + tabungan);
	}
	else {
		System.out.println("Informasi tidak tersedia!");
	}

}
}

/*
2. Rudi Tabuti berencana untuk menyisihkan sebagian gajinya untuk membeli rumah dan mobil secara kredit.
Gaji bersih Rudi sebesar Rp 8.500.000,- / bulan. Ia juga menggunakan sebagian gajinya untuk kebutuhan sandang dan pangan.
Besarnya kebutuhan sandang dan pangan tersebut bergantung pada besarnya kredit rumah dan mobil / bulannya.

Jika:
-kredit mobil <3% perbulan dan rumah <1% perbulan maka Rudi dapat menggunakan gajinya untuk kebutuhan sandang dan pangan sebesar 50% dari gajinya
-kredit mobil <5% perbulan dan rumah <2% perbulan maka Rudi dapat menggunakan gajinya untuk kebutuhan sandang dan pangan sebesar 35% dari gajinya
-kredit mobil <7% perbulan dan rumah <3% perbulan maka Rudi dapat menggunakan gajinya untuk kebutuhan sandang dan pangan sebesar 25% dari gajinya

sisa gajinya ditabung oleh Rudi
**persenan yang melebih syarat tersebut menghasilkan output => Maaf, uang Anda tidak mencukupi :(

harga mobil = 45.000.000
harga rumah = 125.000.000

Output: 

Kredit rumah per bulan (%): 2.35

Kredit mobil per bulan (%): 1.5

Tabungan Rudi Tabuti per bulan: 2.600.000 */