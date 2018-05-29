/*
Date Created	: 29 May 2018, 09:49:29 AM
Date Done		: 29 May 2018, 11:19:11 AM
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class Quizz3Tabungan {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
		int[] jlhHari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String jlhAnggota, lamaNabung;
		int		validation, validate, jlhAnggotaInt, lamaNabungInt, jlhBulan, totBulan, tabunganAkhir, nol, harian, totHarian, totTabungan, maxNabung, minNabung,
				maxAnggota, minAnggota, satu, uangDefault;

		totHarian = totTabungan = nol = tabunganAkhir = totBulan = jlhBulan = jlhAnggotaInt = lamaNabungInt = validate = 0;
		satu = minNabung = harian = validation = 1;
		maxNabung = 12;
		minAnggota = 2;
		maxAnggota = 6;
		uangDefault = 1000;

		jlhAnggota = lamaNabung = "";

        do{
			System.out.println();
        	System.out.print("Masukan Jumlah keluarga: ");
	        jlhAnggota = inputKey.nextLine();
	        if (jlhAnggota.matches("[0-9-]+")) {
				jlhAnggotaInt = Integer.parseInt(jlhAnggota);
				if (jlhAnggotaInt < minAnggota) {
	        		System.out.println("Maaf, jumlah keluarga tidak boleh kurang dari 2.");
	        		System.out.println("Silahkan Input Kembali");
	        		System.out.println();
	        		validate = nol;
				}else if (jlhAnggotaInt > maxAnggota) {
	        		System.out.println("Maaf, jumlah keluarga tidak boleh lebih dari 6.");
	        		System.out.println("Silahkan Input Kembali");
	        		System.out.println();
	        		validate = nol;
				}else {
					do{
						System.out.print("Masukan Lama tabungan : ");
						lamaNabung = inputKey.nextLine();
				        System.out.println();
						if (lamaNabung.matches("[0-9-]+")) {
							lamaNabungInt = Integer.parseInt(lamaNabung);
				        	if (lamaNabungInt < minNabung) {
				        		System.out.println("Maaf, lama tabungan tidak boleh kurang dari 1.");
				        		System.out.println("Silahkan Input Kembali");
				        		System.out.println();
				        		validate = nol;
				        	}else if (lamaNabungInt > maxNabung) {
				        		System.out.println("Maaf, lama tabungan tidak boleh lebih dari 12.");
				        		System.out.println("Silahkan Input Kembali");
				        		System.out.println();
				        		validate = nol;
				        	}else {
				        		validate++;
				        	}
			        	}else{
				        	System.out.println("Maaf, input yang diterima hanya berupa angka.");
				        	System.out.println("Silahkan Input Kembali");
				        	System.out.println();
				        	validate = nol;
			        	}
			        } while (validate < validation);
				}
	        }else {
	        	System.out.println("Maaf, input yang diterima hanya berupa angka.");
	        	System.out.println("Silahkan Input Kembali");
	        	System.out.println();
	        	validate = nol;
	        }
		}while (validate < validation);

		for (int index = nol; index <= lamaNabungInt-satu; index++) {
			System.out.print("Tabungan Pada bulan " + bulan[index] + " sebesar ");
			jlhBulan++;
			harian = satu; totHarian = nol; totTabungan = nol;
			for (int indexNabung = nol; indexNabung < jlhHari[index]; indexNabung++) {
				harian = (indexNabung+satu) * uangDefault;
				totHarian+=harian;
			}
			// System.out.println(totHarian);
			totTabungan = totHarian * jlhAnggotaInt;
			System.out.println(totTabungan);
			tabunganAkhir += totTabungan;
		}
		totBulan += jlhBulan;
		System.out.println("Total Tabungan Selama " + totBulan + " Bulan dengan " + jlhAnggotaInt + " anggota keluarga adalah " + tabunganAkhir);

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