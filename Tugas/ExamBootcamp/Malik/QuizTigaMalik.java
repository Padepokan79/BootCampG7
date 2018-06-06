/*
Create By 	: Malik Chaudhary
Time Create : 2018-05-29 9:55AM
Soal 		:

Tabungan dimana setiap tahunnya anggota harus membayar setiap harinya 
sebesar 31rb pada tanggal ke 1, 30rb pada tanggal ke 2,
sampai 1rb pada tanggal 31. beranggotakan 4 orang.
selama 4 Diawali pada bulan januari sampai April (Tabungan Selalu Dimulai dari januari). 
Berapakah Besar tabungan keluarga tersebut?

Batasan:
-User input anggota keluarga tidak boleh kurang dari 2.
-User input anggota keluarga tidak boleh lebih dari 6.
-User input Lama Tabungan tidak boleh kurang dari 1.
-User input Lama Tabungan tidak boleh lebih dari 12.
-User input hanya menerima angka saja.

Petunjuk:
- if else
- looping for
- do while
- while
- array*
- swicth - case*
*Jika dibutuhkan

Hasil yang diinginkan:

Tabungan Keluarga.

Masukan Jumlah keluarga : 4
Masukan Lama tabungan : 3

Tabungan Pada bulan pertama sebesar 1984000
Tabungan Pada bulan kedua sebesar 1624000
Tabungan Pada bulan ketiga sebesar 1984000

Total Tabungan Selama 3 Bulan dengan 4 anggota keluarga adalah 5592000


Hasil yang diinginkan:

Tabungan Keluarga.

Masukan Jumlah keluarga : 2
Masukan Lama tabungan : 2

Tabungan Pada bulan pertama sebesar 992000
Tabungan Pada bulan kedua sebesar 812000

Total Tabungan Selama 3 Bulan dengan 4 anggota keluarga adalah 1804000

Masukan Jumlah keluarga : 1
Maaf, Jumlah keluarga Tidak boleh kurang dari 2.
Silahkan input kembali.

Masukan Lama tabungan : 0
Maaf, Lama tabungan tidak boleh kurang dari 1.
Silahkan input kembali.


Masukan Jumlah keluarga : 9
Maaf, Jumlah keluarga tidak boleh lebih dari 6.
Silahkan input kembali.

Masukan Lama tabungan : 15
Maaf, Lama tabungan tidak boleh lebih dari 12.
Silahkan input kembali.

Masukan Lama tabungan : aaaaaaa
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.
=======================================================
*/

import java.util.Scanner;
public class QuizTigaMalik{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String jmlKeluargaString,lamaTabunganString;
		int[] arrayBulan = {31000,28000,31000,30000,31000,30000,31000,31000,30000,31000,30000,31000};
		int jmlKeluarga, lamaTabungan, tabunganJan, tabunganFeb, tabunganMar, tabunganApr, tabunganMei, 
		tabunganJuni, tabunganJuli, tabunganAgs, tabunganSep, tabunganOkt, tabunganNov, tabunganDes, minTabungan, 
		penguranganTabunganhari, totalTabungan, minBulanSatu, minBulanDua, minBulanTiga, minBulaEmpat, minBulanLima,
		minBulanEnam, minBulanTujuh, minBulanDelapan, minBulanSembilan, minBulanSepuluh, minBulanSebelas, minBulanDuaBelas, minJmlKeluarga, maxJmlKeluarga,
		minLamaTabungan, maxLamaTabungan;

		tabunganJan  = 0; 	tabunganJuli 	= 0; 	penguranganTabunganhari	= 1000; 	minBulaEmpat 	= 3; 	minBulanSepuluh 	= 9; 	maxLamaTabungan 	= 12;
		tabunganFeb  = 0; 	tabunganAgs 	= 0; 	minTabungan 			= 1000; 	minBulanLima 	= 4; 	minBulanSebelas 	= 10;
		tabunganMar	 = 0; 	tabunganSep 	= 0;	totalTabungan 			= 0; 		minBulanEnam 	= 5; 	minBulanDuaBelas 	= 12;
		tabunganApr  = 0; 	tabunganOkt 	= 0; 	minBulanSatu 			= 0; 		minBulanTujuh 	= 6; 	minJmlKeluarga 		= 2;
		tabunganMei  = 0; 	tabunganNov 	= 0; 	minBulanDua 			= 1; 		minBulanDelapan = 7; 	maxJmlKeluarga 		= 6;
		tabunganJuni = 0; 	tabunganDes 	= 0; 	minBulanTiga 			= 2; 		minBulanSembilan= 8; 	minLamaTabungan 	= 1;
		jmlKeluarga  = 0;

		System.out.println();
		System.out.println("Tabungan Keluarga ");
		System.out.println();
		System.out.print("Masukan Jumlah keluarga : ");
		jmlKeluargaString = scan.next();

		do{	
			if ( !jmlKeluargaString.matches("([0-9])*") ) {
				System.out.println();
				System.out.println("Maaf, inputan yang diterima hanya berupa angka ");
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Masukan Jumlah keluarga : ");
				jmlKeluargaString = scan.next();
			}
			if ( jmlKeluargaString.matches("([0-9])") ) {
				jmlKeluarga  = Integer.parseInt(jmlKeluargaString);
				if ( jmlKeluarga < minJmlKeluarga ) {
					System.out.println();
					System.out.println("Maaf, jumlah keluarga tidak boleh kurang dari "+minJmlKeluarga);
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Masukan Jumlah keluarga : ");
					jmlKeluargaString = scan.next();
				}else if ( jmlKeluarga > maxJmlKeluarga ) {
					System.out.println();
					System.out.println("Maaf, jumlah keluarga tidak boleh lebih dari "+maxJmlKeluarga);
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Masukan Jumlah keluarga : ");
					jmlKeluargaString = scan.next();
				}
			}
			
		}while(jmlKeluarga < minJmlKeluarga || jmlKeluarga > maxJmlKeluarga || !jmlKeluargaString.matches("([0-9])*") );
			
		
		
		System.out.print("Masukan lama tabungan   : ");
		lamaTabunganString = scan.next();
		System.out.println();
		lamaTabungan = Integer.parseInt(lamaTabunganString);

		do{	
			if ( !lamaTabunganString.matches("([0-9])*") ) {
				System.out.println();
				System.out.println("Maaf, inputan yang diterima hanya berupa angka ");
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Masukan lama tabungan   : ");
				lamaTabunganString = scan.next();
			}
			if ( jmlKeluargaString.matches("([0-9])") ) {
				jmlKeluarga  = Integer.parseInt(jmlKeluargaString);
				if ( lamaTabungan < minLamaTabungan ) {
				System.out.println();
				System.out.println("Maaf, jumlah lama tabungan tidak boleh kurang dari "+minLamaTabungan);
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Masukan lama tabungan   : ");
				lamaTabunganString = scan.next();
			}else if ( lamaTabungan > maxLamaTabungan ) {
				System.out.println();
				System.out.println("Maaf, jumlah lama tabungan tidak boleh lebih dari "+maxLamaTabungan);
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Masukan lama tabungan   : ");
				lamaTabunganString = scan.next();
			
			}
			
		}while(lamaTabungan < minLamaTabungan || lamaTabungan > maxLamaTabungan || !lamaTabunganString.matches("([0-9])*") );

		
		if ( lamaTabungan > minBulanSatu ) {
			for (int tabungan=arrayBulan[minBulanSatu]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganJan += tabungan;
			}
				System.out.println("Tabungan pada bulan pertama      :Rp. "+(tabunganJan*jmlKeluarga));
		}if ( lamaTabungan > minBulanDua) {
			for (int tabungan=arrayBulan[minBulanDua]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganFeb += tabungan;
			}
				System.out.println("Tabungan pada bulan kedua        :Rp. "+(tabunganFeb*jmlKeluarga));
		}if ( lamaTabungan > minBulanTiga) {
			for (int tabungan=arrayBulan[minBulanTiga]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganMar += tabungan;
			}
				System.out.println("Tabungan pada bulan ketiga       :Rp. "+(tabunganMar*jmlKeluarga));
		}if ( lamaTabungan > minBulaEmpat) {
			for (int tabungan=arrayBulan[minBulaEmpat]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganApr += tabungan;
			}
				System.out.println("Tabungan pada bulan keempat      :Rp. "+(tabunganApr*jmlKeluarga));
		}if ( lamaTabungan > minBulanLima) {
			for (int tabungan=arrayBulan[minBulanLima]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganMei += tabungan;
			}
				System.out.println("Tabungan pada bulan kelima       :Rp. "+(tabunganMei*jmlKeluarga));
		}if ( lamaTabungan > minBulanEnam) {
			for (int tabungan=arrayBulan[minBulanEnam]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganJuni += tabungan;
			}
				System.out.println("Tabungan pada bulan keenam       :Rp. "+(tabunganJuni*jmlKeluarga));
		}if ( lamaTabungan > minBulanTujuh) {
			for (int tabungan=arrayBulan[minBulanTujuh]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganJuli += tabungan;
			}
				System.out.println("Tabungan pada bulan ketujuh      :Rp. "+(tabunganJuli*jmlKeluarga));
		}if ( lamaTabungan > minBulanDelapan) {
			for (int tabungan=arrayBulan[minBulanDelapan]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganAgs += tabungan;
			}
				System.out.println("Tabungan pada bulan kedelapan    :Rp. "+(tabunganAgs*jmlKeluarga));
		}if ( lamaTabungan > minBulanSembilan) {
			for (int tabungan=arrayBulan[minBulanSembilan]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganSep += tabungan;
			}
				System.out.println("Tabungan pada bulan kesembilan   :Rp. "+(tabunganSep*jmlKeluarga));
		}if ( lamaTabungan > minBulanSepuluh) {
			for (int tabungan=arrayBulan[minBulanSepuluh]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganOkt += tabungan;
			}
				System.out.println("Tabungan pada bulan kesepuluh    :Rp. "+(tabunganOkt*jmlKeluarga));
		}if ( lamaTabungan > minBulanSebelas) {
			for (int tabungan=arrayBulan[minBulanSebelas]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganNov += tabungan;
			}
				System.out.println("Tabungan pada bulan kesebelas    :Rp. "+(tabunganNov*jmlKeluarga));
		}if ( lamaTabungan > minBulanDuaBelas) {
			for (int tabungan=arrayBulan[minBulanDuaBelas]; tabungan>=minTabungan; tabungan -= penguranganTabunganhari) {
				tabunganDes += tabungan;
			}
				System.out.println("Tabungan pada bulan keduabelas   :Rp. "+(tabunganDes*jmlKeluarga));
		}

		totalTabungan = (tabunganJan*jmlKeluarga)+(tabunganFeb*jmlKeluarga)+(tabunganMar*jmlKeluarga)+(tabunganApr*jmlKeluarga)+
		(tabunganMei*jmlKeluarga)+(tabunganJuni*jmlKeluarga)+(tabunganJuli*jmlKeluarga)+(tabunganAgs*jmlKeluarga)+(tabunganSep*jmlKeluarga)+
		(tabunganOkt*jmlKeluarga)+(tabunganNov*jmlKeluarga)+(tabunganDes*jmlKeluarga);
		System.out.println("Total tabungan selama "+lamaTabungan+" bulan dengan "+jmlKeluarga+" anggota keluarga adalah Rp. "+totalTabungan);
	}
}