/*
	 Program     : Soal 2 - Richa
     Creator     : Khairil
     Created At  : 16 Mei 2018 21:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RichaIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int gajiBersih, hargaMobil, hargaRumah;
		double inputKreditRumah, inputKreditMobil, sandangPangan, sisaUang, limapuluhPersen, tigapuluhlimaPersen, duapuluhlimaPersen, kreditRumah, kreditMobil, satuPersen, duaPersen, tigaPersen, limaPersen, tujuhPersen;

		sandangPangan = 0.0;
		gajiBersih = 8500000;
		hargaMobil = 45000000;
		hargaRumah = 125000000;
		sisaUang = 0.0;
		limapuluhPersen = 50.0/100.0;
		tigapuluhlimaPersen = 35.0/100.0;
		duapuluhlimaPersen = 25.0/100.0;
		kreditRumah = 0.0;
		kreditMobil = 0.0;
		satuPersen = 1.0/100.0;
		duaPersen = 2.0/100.0;
		tigaPersen = 3.0/100.0;
		limaPersen = 5.0/100.0;
		tujuhPersen = 7.0/100.0;

		System.out.print("Kredit rumah per bulan : ");
		inputKreditRumah = keyboard.nextDouble();
		System.out.println();
		System.out.print("Kredit mobil per bulan : ");
		inputKreditMobil = keyboard.nextDouble();
		System.out.println();

		kreditRumah = inputKreditRumah / 100.0;
		kreditMobil = inputKreditMobil / 100.0;

		if(kreditMobil < tigaPersen && kreditRumah < satuPersen) {
			sandangPangan = limapuluhPersen * gajiBersih;
		}
		else if(kreditMobil < limaPersen && kreditRumah < duaPersen) {
			sandangPangan = tigapuluhlimaPersen * gajiBersih;
		}
		else if(kreditMobil < tujuhPersen && kreditRumah < tigaPersen) {
			sandangPangan = duapuluhlimaPersen * gajiBersih;
		}

		// System.out.printf("Uang Sandang pangan : " + sandangPangan);
		System.out.println();
		sisaUang = gajiBersih - sandangPangan - (kreditRumah * hargaRumah) - (kreditRumah * hargaMobil);
		if(kreditMobil >= 0.07 && kreditRumah >= 0.03) {
			System.out.println("Maaf, uang Anda tidak mencukupi :(");
		}
		else {
			if(sisaUang < 0) {
				System.out.println("Maaf, uang Anda tidak mencukupi :(");
			}
			else {
				System.out.printf("Tabungan Rudi Tabuti per bulan : " + sisaUang);						
			}
		}
		System.out.println();
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

Tabungan Rudi Tabuti per bulan: 2.600.000
*/