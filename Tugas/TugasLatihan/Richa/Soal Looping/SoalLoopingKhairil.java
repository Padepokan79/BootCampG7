/* 
Created by  		: Richa Fitria
Date/hour			: 20 Mei 2018/ 08.11
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingKhairil {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();


		int level, maxSoal, soal, angka1 = 0, angka2 = 0, hasil, jawaban;
		double presentase, benar, jmlSoal;
		String ulang = "y";


		maxSoal = 100;
		benar = 0;


		while (ulang.equals ("y")) {
			benar = 0;	
			System.out.println("Input level: ");	
			level = keyboard.nextInt ();

			System.out.println("Input jumlah soal: ");		
			jmlSoal = keyboard.nextDouble ();	
			System.out.println("===============================");
			for (soal = 1; soal<= jmlSoal; soal++) {
				if (level == 1) {
					angka1 = rand.nextInt (10) + 1;
					angka2 = rand.nextInt (10) + 1;
				}
				else if (level == 2) {
					angka1 = rand.nextInt (100) + 1;
					angka2 = rand.nextInt (100) + 1;
				}
				else if (level == 3) {
					angka1 = rand.nextInt (1000) + 1;
					angka2 = rand.nextInt (1000) + 1;
				}
				else if (level == 4) {
					angka1 = rand.nextInt (10000) + 1;
					angka2 = rand.nextInt (10000) +1;
				}
				else if (level == 5) {
					angka1 = rand.nextInt (100000) + 1;
					angka2 = rand.nextInt (100000) + 1;
				}
				else if (level == 6) {
					angka1 = rand.nextInt (1000000) + 1;
					angka2 = rand.nextInt (1000000) + 1;
				}

				hasil = angka1+angka2;
				System.out.print ("Berapa " + angka1 + " + " + angka2 + " ? ");
				jawaban = keyboard.nextInt ();

				if (hasil == jawaban) {
					System.out.println("Benar!");
					benar++;
				}

				if (hasil != jawaban) {
					System.out.println("Salah!");
				}
				System.out.println();

			}

			presentase = (benar/jmlSoal)*100;
			System.out.println(benar);
			System.out.println(jmlSoal);
			System.out.println(presentase);

			if (presentase < 25) {
				System.out.println("Coba lagi ya. atau ngulang sd nya");
			}
			else if (presentase >= 25 && presentase <=50) {
				System.out.println("oke lah masih mending");
			}
			else if (presentase >= 50 && presentase <=75 ) {
				System.out.println("sip lah masih di atas standar");
			}
			else if (presentase >= 75 && presentase <=99 ) {
				System.out.println("anda benar-benar matematika wan");
			}
			else if (presentase == 100 ) {
				System.out.println("PURRRRRFECT!! ");
			}
			System.out.println("-----------------------");
			System.out.println("Mau ulang lagi? (y/n)");
			ulang = keyboard.next ();
		}



	}
}

/*
Membuat kuis berhitung ceria. 
Tiap Level memiliki kesulitan yang berbeda
untuk level 1 hitungan angka 1-10
untuk level 2 hitungan angka 1-100
untuk level 3 hitungan angka 1-1000
untuk level 4 hitungan angka 1-10000
untuk level 5 hitungan angka 1-100000
untuk level 6 hitungan angka 1-1000000

player dapat memilih level tersebut dengan jumlah soalnya
max soal 100

apabila player mengulang maka dapat memilih lagi
dengan memilih kembali level dan jumlah soal

jumlah benar akan diakumulasikan di akhir soal

jumlah benar player 25% lebih kecil dari jumlah benar : 
Coba lagi ya. atau ngulang sd nya

jumlah benar player lebih besar sama dengan 25% dan 50% lebih kecil dari jumlah benar : 
oke lah masih mending

jumlah benar player lebih besar sama dengan 50% dan 75% lebih kecil dari jumlah benar : 
sip lah masih di atas standar

jumlah benar player lebih besar sama dengan 75% dan 99% lebih kecil dari jumlah benar : 
anda benar-benar matematika wan

dan jumlah benar 100%
PURRRRRFECT!! 

*/