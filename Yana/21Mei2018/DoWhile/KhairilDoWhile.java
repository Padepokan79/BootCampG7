/*
Creted by	: Yana
Time		: 19 Mei 2018 17.26
*/

import java.util.Scanner;
import java.util.Random;

public class KhairilDoWhile{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int	jumlahSoal, level, soal, bilangan1, bilangan2,
			jawabanKomputer, jawabanPlayer, jumlahBenar, persentase;

		bilangan1	= 0;
		bilangan2	= 0;
		jumlahBenar = 0;
		soal 		= 0;

		System.out.print("Masukkan Level (1-6): ");
		level = keyboard.nextInt();
		System.out.print("Masukkan jumlah soal (1-100): ");
		jumlahSoal = keyboard.nextInt();
		System.out.println();

		do{
			soal ++;

			if (level == 1) {
				bilangan1 = random.nextInt(10)+1;
				bilangan2 = random.nextInt(10)+1;
			}
			else if (level == 2) {
				bilangan1 = random.nextInt(90)+11;
				bilangan2 = random.nextInt(90)+11;
			}
			else if (level == 3) {
				bilangan1 = random.nextInt(900)+101;
				bilangan2 = random.nextInt(900)+101;
			}
			else if (level == 4) {
				bilangan1 = random.nextInt(9000)+1001;
				bilangan2 = random.nextInt(9000)+1001;
			}
			else if (level == 5) {
				bilangan1 = random.nextInt(90000)+10001;
				bilangan2 = random.nextInt(90000)+10001;
			}
			else if (level == 6) {
				bilangan1 = random.nextInt(900000)+100001;
				bilangan2 = random.nextInt(900000)+100001;
			}

			System.out.println("Pertanyaan ke "+soal);
			System.out.print(bilangan1+ " + "+bilangan2+" = ");
			jawabanKomputer	= bilangan1 + bilangan2;
			jawabanPlayer = keyboard.nextInt();
			if (jawabanPlayer == jawabanKomputer) {
				jumlahBenar = jumlahBenar + 1;
			}

		}while(soal < jumlahSoal);

		jumlahBenar = jumlahBenar;
		persentase	= jumlahBenar * 100 / jumlahSoal;

		System.out.println();

		if (persentase < 25) {
			System.out.println("Coba lagi ya! atau ngulang SD nya");
		}
		else if (persentase >= 25 && persentase < 50) {
			System.out.println("OKE lah masih mending");			
		}
		else if (persentase >= 50 && persentase < 75) {
			System.out.println("Sip lah masih di atas standar");			
		}
		else if (persentase >= 75 && persentase < 99) {
			System.out.println("Anda benar-benar matematikawan");			
		}
		else if (persentase == 100) {
			System.out.println("PURRFECT!");			
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