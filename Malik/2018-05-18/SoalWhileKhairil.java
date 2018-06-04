/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 9:13PM

Soal :

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
RALAT :
kalau mengulang skor kembali di reset dan hitungan jumlah baru
*/
import java.util.Scanner;
import java.util.Random;
public class SoalWhileKhairil{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int pilihLevel, jmlSoal, soal, soalSatu, soalDua, jawaban, kunciJawaban, pointBenar, pointSalah, level, akumulasi;
		int nol, satu, dua, tiga, empat, lima, enam, sepuluh, duaLima, limaPuluh, tujuhLima, seratus, sembilanSembilan, ribu, puluh, ratusRibu, juta;
		String reset;

		nol 	= 0;	empat 	= 4; 	duaLima 	= 25; 	sembilanSembilan  	= 99; 		juta 	= 1000000;
		satu 	= 1; 	lima 	= 5; 	limaPuluh 	= 50;  	ribu 				= 1000;
		dua 	= 2;	enam 	= 6; 	tujuhLima 	= 75; 	puluh 				= 10000;
		tiga 	= 3; 	sepuluh = 10; 	seratus 	= 100; 	ratusRibu 			= 100000;

		soal 	= 1;
		soalSatu= 0;
		soalDua	= 0;
		jmlSoal	= 2;

		while( soal <= jmlSoal ){
			System.out.println();
			System.out.println();
			System.out.println("==========================================");
			System.out.println("            KUIS BERHITUNG CERIA          ");
			System.out.println("==========================================");
			System.out.print("Pilih Level (LvL 1-6) : ");
			pilihLevel = scan.nextInt();

			System.out.print("Masukan jumlah soal yang ingin dikerjakan : ");
			jmlSoal = scan.nextInt();

			level = pilihLevel;
			pointBenar	= nol;
			pointSalah	= nol;
			while( soal <= jmlSoal && level == pilihLevel  ){
				if ( pilihLevel == satu ) {
					soalSatu = random.nextInt(sepuluh)+satu;
					soalDua	 = random.nextInt(sepuluh)+satu;
				}else if ( pilihLevel == dua ) {
					soalSatu = random.nextInt(seratus-sepuluh)+sepuluh;
					soalDua	 = random.nextInt(seratus-sepuluh)+sepuluh;
				}else if ( pilihLevel == tiga ) {
					soalSatu = random.nextInt(ribu-seratus)+seratus;
					soalDua	 = random.nextInt(ribu-seratus)+seratus;
				}else if ( pilihLevel == empat ) {
					soalSatu = random.nextInt(puluh-ribu)+ribu;
					soalDua	 = random.nextInt(puluh-ribu)+ribu;
				}else if ( pilihLevel == lima ) {
					soalSatu = random.nextInt(ratusRibu-puluh)+puluh;
					soalDua	 = random.nextInt(ratusRibu-puluh)+puluh;
				}else if ( pilihLevel == enam ) {
					soalSatu = random.nextInt(juta-ratusRibu)+ratusRibu;
					soalDua	 = random.nextInt(juta-ratusRibu)+ratusRibu;
				}
				System.out.println();
				System.out.println("==================================================");
				System.out.print("Hasil penjumlahan dari "+soalSatu+" + "+soalDua+" : ");
				jawaban = scan.nextInt();
				kunciJawaban	= soalSatu+soalDua;
				System.out.println("Jawaban : "+kunciJawaban);
				if ( jawaban == kunciJawaban ) {
					pointBenar += satu;
					System.out.println("Benar   : "+pointBenar);
					System.out.println("Salah   : "+pointSalah);
				}else{
					pointSalah += satu;
					System.out.println("Benar   : "+pointBenar);
					System.out.println("Salah   : "+pointSalah);
				}
				if ( soal == jmlSoal ) {
					System.out.println();
					akumulasi 	= (pointBenar*seratus)/soal;
					if ( akumulasi < duaLima ) {
						System.out.print("Maaf, Coba lagi");
					}else if ( akumulasi > duaLima && akumulasi < limaPuluh ) {
						System.out.print("Okelah masih mending");
					}else if ( akumulasi > limaPuluh && akumulasi < tujuhLima ) {
						System.out.print("Siplah masih diatas standar");
					}else if ( akumulasi > tujuhLima && akumulasi < sembilanSembilan ) {
						System.out.print("Anda benar benar matematikawan");
					}else if ( akumulasi == seratus ) {
						System.out.print("PURRRRRFECT");
					}
					System.out.println();
					soal 	   = satu;	
					jmlSoal    = nol;
					pilihLevel = nol;
				}
				if( soal > jmlSoal ) {
					System.out.println();
					System.out.print("Apakah anda ingin mengulang atau tidak (Y/N) : ");
					reset = scan.next();
					if ( reset.equals("Y") ) {
						pointSalah = nol;
						pointBenar = nol;
						soal 	   = satu;	
						jmlSoal    = dua;
						pilihLevel = nol;
					}
				}
				soal++;
			}
		}
	}
}