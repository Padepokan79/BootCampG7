/*
	DATE CREATED : 20 MEI 2018
	TIME CREATED : 13.30 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	Membuat kuis berhitung ceria. 
	Tiap Level memiliki kesulitan yang berbeda
	untuk level 1 hitungan angka 1-10
	untuk level 2 hitungan angka 10-100
	untuk level 3 hitungan angka 100-1000
	untuk level 4 hitungan angka 1000-10.000
	untuk level 5 hitungan angka 10.000-100.000
	untuk level 6 hitungan angka 100.000-1.000.000

	player dapat memilih level tersebut dengan jumlah soalnya
	max soal 100

	- apabila player mengulang maka dapat memilih lagi
	  dengan memilih kembali level dan jumlah soal
	- kalau mengulang lagi score direset dan hitungan kembali baru

	jumlah benar akan diakumulasikan di akhir soal

	jumlah benar player 25% lebih kecil dari jumlah soal : 
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
import java.util.Scanner;
import java.util.Random;
public class DoWhileKhairil{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int angkaLv01, angkaLv02, angkaLv03, angkaLv04, angkaLv05, angkaLv06;
		int angkaRand01, angkaOne, noSoal, hitung, angkaRand02, inputJawaban, skore, lv01, lv02, lv03, lv04, lv05, lv06, inputLevel, inputJmlSoal, angkaSatu, maxSoal;
		String inputReset;
		double persent25, persent50, persent75, persent99, jwbBenar;

		persent99 = 99.0/100;	
		persent75 = 75.0/100;
		persent50 = 50.0/100;
		persent25 = 25.0/100;
		angkaLv01 = 10;
		angkaLv02 = 100;
		angkaLv03 = 1000;
		angkaLv04 = 10000;
		angkaLv05 = 100000;
		angkaLv06 = 1000000;
		lv01 = angkaSatu = angkaOne = 1;
		lv02 = 2;
		lv03 = 3;
		lv04 = 4;
		lv05 = 5;
		lv06 = 6;
		maxSoal = 100;
		jwbBenar = hitung = angkaRand01 = angkaRand02 = 0;
		
		

	while(angkaSatu <= 1){

		System.out.println("");
		System.out.println("KUIS BERHITUNG CERIA");
		System.out.print("Pilih Level Soal           | 1 - 6 |          : ");
		inputLevel = keyboard.nextInt();
		System.out.print("Berapa jumlah soal yang diinginkan | Max->100 : ");
		inputJmlSoal = keyboard.nextInt();


		while(angkaOne <= inputJmlSoal && angkaOne > 0 && inputJmlSoal <= maxSoal && inputLevel <= lv06 && inputLevel > 0){

			if (inputLevel == 1) {
				angkaRand01 = rand.nextInt(angkaLv01) + 1;
				angkaRand02 = rand.nextInt(angkaLv01) + 1;
			}
			else if (inputLevel == 2) {
				angkaRand01 = rand.nextInt(angkaLv02 - angkaLv01) + angkaLv01;
				angkaRand02 = rand.nextInt(angkaLv02 - angkaLv01) + angkaLv01;
			}
			else if (inputLevel == 3) {
				angkaRand01 = rand.nextInt(angkaLv03 - angkaLv02) + angkaLv02;
				angkaRand02 = rand.nextInt(angkaLv03 - angkaLv02) + angkaLv02;
			}
			else if (inputLevel == 4) {
				angkaRand01 = rand.nextInt(angkaLv04 - angkaLv03) + angkaLv03;
				angkaRand02 = rand.nextInt(angkaLv04 - angkaLv03) + angkaLv03;
			}
			else if (inputLevel == 5) {
				angkaRand01 = rand.nextInt(angkaLv05 - angkaLv04) + angkaLv04;	
				angkaRand02 = rand.nextInt(angkaLv05 - angkaLv04) + angkaLv04;	
			}
			else if (inputLevel == 6) {
				angkaRand01 = rand.nextInt(angkaLv06 - angkaLv05) + angkaLv05;
				angkaRand02 = rand.nextInt(angkaLv06 - angkaLv05) + angkaLv05;
			}
				System.out.println("");
				System.out.println("No. "+(angkaOne));
					System.out.print("Berapa hasil dari "+angkaRand01+" + "+angkaRand02+"? ");
					inputJawaban = keyboard.nextInt();
				hitung = angkaRand01+angkaRand02;
				System.out.println("KJ : "+(hitung));
				if (inputJawaban == hitung) {
					jwbBenar += 1;
				}else{
					jwbBenar += 0;
				}

			if (angkaOne == inputJmlSoal) {

				System.out.println("-----------------------------------------");
				System.out.print("Apakah anda ingin mengulang |Y/N| ? ");
				inputReset = keyboard.next();
				
				if (inputReset.equals("Y")) {
					jwbBenar = 0;
					angkaOne = 0;
					inputLevel = 0;
				}
				else{
					System.out.println("Jawaban Benar : "+jwbBenar+" dari "+inputJmlSoal+" soal.");

					if ( jwbBenar <= (inputJmlSoal*persent25) ) {
						System.out.println("Coba lagi yaa");
					}
					else if ( jwbBenar >= (inputJmlSoal*persent25) && jwbBenar <= (inputJmlSoal*persent50) ) {
						System.out.println("Oke lah masih mending");
					}
					else if ( jwbBenar >= (inputJmlSoal*persent50) && jwbBenar <= (inputJmlSoal*persent75) ) {
						System.out.println("Masih diatas standard");
					}
					else if ( jwbBenar >= (inputJmlSoal*persent75) && jwbBenar <= (inputJmlSoal*persent99) ) {
						System.out.println("Anda benar-benar Matematikawan");
					}
					else if( jwbBenar == inputJmlSoal ){
						System.out.println("HASIL YANG SEMPURNA");
					}

					angkaSatu += 1;
				}

				System.out.println("-----------------------------------------");
			}

			angkaOne += 1;
		}

			if (inputJmlSoal > maxSoal) {
				System.out.println("");
				System.out.println("---------- Maximal jumlah soal 100 !! ----------");
			}
			if (inputLevel > lv06 || inputLevel == 0) {
				System.out.println("");
				System.out.println("---------- Level tidak tercantum dalam sistem !! ----------");
			}
	}


	}
}