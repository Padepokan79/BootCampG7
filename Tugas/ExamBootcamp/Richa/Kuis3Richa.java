/* 
Created by  		: Richa Fitria
Date/hour			: 29 Mei 2018/ 9.21 AM
Updated by			: 
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Random;

public class Kuis3Richa{
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int jmlKeluargaInt, lamaTabunganInt, totalTabunganPerBulan, totalTabungan;
		String jmlKeluarga, lamaTabungan;

		String [] bulan = {"pertama", "kedua", "ketiga", "keempat", "kelima", "keenam", "ketujuh", "kedelapan", "kesembilan", "kesepuluh", "kesebelas", "keduabelas"};
		int [] totalHari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		boolean cek = false;

		System.out.println("Tabungan Keluarga.");
		System.out.println();


		do {
			System.out.print ("Masukan Jumlah keluarga : ");
			jmlKeluarga = keyboard.next();
			if (jmlKeluarga.matches ("[23456]|[789]|1[0-2]")) {
				cek = false;
			}
			else if (jmlKeluarga.matches ("[01]")) {
				System.out.println("Maaf, Jumlah keluarga Tidak boleh kurang dari 2.\nSilahkan input kembali.");
				cek = true;
			}
			else if (jmlKeluarga.matches ("[789]|[0-9][1-9]+")) {
				System.out.println("Maaf, Jumlah keluarga tidak boleh lebih dari 6.\nSilahkan input kembali.");
				cek = true;
			}
			else if (jmlKeluarga.matches ("[^0-9]+")) {
				System.out.println("Maaf, Jumlah keluarga tidak boleh lebih dari 6.\nSilahkan input kembali.");
				cek = true;
			}
			

		} while (cek==true);

		jmlKeluargaInt = Integer.parseInt (jmlKeluarga);

		do {
			System.out.print ("Masukan Lama tabungan : ");
			lamaTabungan = keyboard.next ();
			if (lamaTabungan.matches ("[23456]|[789]|1[0-2]")) {
				cek = false;
			}
			else if (lamaTabungan.matches ("[0]")) {
				System.out.println("Maaf, Lama tabungan tidak boleh kurang dari 1.");
				cek = true;
			}
			else if (lamaTabungan.matches ("[1-9][1-9]+")) {
				System.out.println("Maaf, Lama tabungan tidak boleh lebih dari 12.");
				cek = true;
			}
			else if (lamaTabungan.matches ("[^0-9]+")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.");
				cek = true;
			}
			

		} while (cek==true);

		lamaTabunganInt = Integer.parseInt (lamaTabungan);


		totalTabunganPerBulan = 0;
		totalTabungan = 0;
		System.out.println();
		for (int index = 0; index < lamaTabunganInt; index++) {
			for (int index1 = totalHari[index]; index1 > 0 ; index1--) {
				totalTabunganPerBulan = totalTabunganPerBulan + (index1*1000);
			}
			System.out.println("Tabungan Pada bulan " + bulan [index] + " sebesar " + totalTabunganPerBulan*jmlKeluargaInt);
			totalTabungan = totalTabungan+ (totalTabunganPerBulan*jmlKeluargaInt);
			totalTabunganPerBulan = 0;
		}

		System.out.println();
		System.out.println("Total Tabungan Selama " + lamaTabungan + " Bulan dengan " + jmlKeluarga + " anggota keluarga adalah " + totalTabungan);
	}
}

/*
3. Tabungan Keluarga

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

*/