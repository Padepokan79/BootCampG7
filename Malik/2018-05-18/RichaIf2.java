/*
Created By	: Malik Chaudhary
Time 		: 17-05-2018 8:26AM

Soal :
Rudi Tabuti berencana untuk menyisihkan sebagian gajinya untuk membeli rumah dan mobil secara kredit.
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

Tabungan Rudi Tabuti per bulan: 2.600.000      
*/

import java.util.Scanner;
public class RichaIf2{
	public static void main(String[] args){
		Scanner rudi = new Scanner(System.in);

		double persenRumah, persenMobil, gajiBersihRudi, hargaMobil, hargaRumah, ratus=100;
		boolean kasusSatu, kasusDua, kasusTiga;
		int satu=1, dua=2, tiga=3, lima=5, tujuh=7;

		gajiBersihRudi 	= 8500000; 
		hargaMobil		= 45000000;
		hargaRumah		= 125000000;

		System.out.print("Kredit rumah per bulan (%) : ");
		persenRumah = rudi.nextDouble();

		System.out.print("Kredit Mobil per bulan (%) : ");
		persenMobil = rudi.nextDouble();

		kasusSatu	= ( (persenMobil < tiga && persenRumah < satu )  );
		kasusDua	= ( (persenMobil < lima && persenRumah < dua )  );
		kasusTiga	= ( (persenMobil < tujuh && persenRumah < tiga )  );

		if ( kasusSatu ) {
			double kebutuhan 	= 50.0/100*gajiBersihRudi;
			double cicilanMobil	= (persenMobil*hargaMobil)/ratus;
			double cicilanRumah	= (persenRumah*hargaRumah)/ratus;  
			double totalUang	= gajiBersihRudi-(kebutuhan+cicilanRumah+cicilanMobil);
			System.out.print("Tabungan Rudi Tabuti per bulan : Rp. "+totalUang);
		}else if ( kasusDua ) {
			double kebutuhan = 35.0/100*gajiBersihRudi;
			double cicilanMobil	= (persenMobil*hargaMobil)/ratus;
			double cicilanRumah	= (persenRumah*hargaRumah)/ratus;  
			double totalUang	= gajiBersihRudi-(kebutuhan+cicilanRumah+cicilanMobil);
			System.out.print("Tabungan Rudi Tabuti per bulan : Rp. "+totalUang);
		}else if ( kasusTiga ) {
			double kebutuhan = 25.0/100*gajiBersihRudi;
			double cicilanMobil	= (persenMobil*hargaMobil)/ratus;
			double cicilanRumah	= (persenRumah*hargaRumah)/ratus;  
			double totalUang	= gajiBersihRudi-(kebutuhan+cicilanRumah+cicilanMobil);
			System.out.print("Tabungan Rudi Tabuti per bulan : Rp. "+totalUang);
		}else{
			System.out.print("Maaf, uang Anda tidak mencukupi :(");
		}
	}
}