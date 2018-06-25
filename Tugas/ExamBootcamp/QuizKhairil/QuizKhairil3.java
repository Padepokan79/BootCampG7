/*
	 Program     : Quiz
     Creator     : Khairil
     Created At  : 29 Mei 2018 09:45 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

class QuizKhairil3 {
	public static void main(String[] args) {
		Scanner inputD = new Scanner(System.in);
		int jumKeluargaInt, lamaTabunganInt, duit, maxJan, maxFeb, maxMar, maxApr, maxMei, maxJun, maxJul, maxAgus, maxSept, maxOkt, maxNov, maxDes, minKel, maxKel, minLama, maxLama, totalDuit, maxBulan, totalDuitSemuaKeluargaJan, totalDuitSemuaKeluargaFeb, totalDuitSemuaKeluargaMar, totalDuitSemuaKeluargaApr, totalDuitSemuaKeluargaMei, totalDuitSemuaKeluargaJun, totalDuitSemuaKeluargaJul, totalDuitSemuaKeluargaAgus, totalDuitSemuaKeluargaSep, totalDuitSemuaKeluargaOkt, totalDuitSemuaKeluargaNov, totalDuitSemuaKeluargaDes, totalDuitSemuaKeluarga, total;
		String jumKeluarga, lamaTabungan;
		Boolean adjustment = false;

		minKel = 2;
		maxKel = 6;
		minLama = 1;
		maxLama = 12;
		maxJan = maxMar = maxMei = maxJul = maxAgus = maxOkt = maxDes = 31;
		maxFeb = 28;
		maxApr = maxJun = maxSept = maxNov = 30;
		duit = 32000;
		totalDuit = 0;
		maxBulan = 12;
		total = 0;

		jumKeluargaInt = lamaTabunganInt = 0;
		totalDuitSemuaKeluargaJan = 0;
		totalDuitSemuaKeluargaFeb = 0;
		totalDuitSemuaKeluargaMar = 0;
		totalDuitSemuaKeluargaApr = 0;
		totalDuitSemuaKeluargaMei = 0;
		totalDuitSemuaKeluargaJun = 0;
		totalDuitSemuaKeluargaJul = 0;
		totalDuitSemuaKeluargaAgus = 0;
		totalDuitSemuaKeluargaSep = 0;
		totalDuitSemuaKeluargaOkt = 0;
		totalDuitSemuaKeluargaNov = 0;
		totalDuitSemuaKeluargaDes = 0;
		totalDuitSemuaKeluarga = 0;

		while(adjustment == false) {
			System.out.print("Masukan Jumlah keluarga : ");
			jumKeluarga = inputD.next();	

			if(jumKeluarga.matches("[0-9-]+")) {
				jumKeluargaInt = Integer.parseInt(jumKeluarga);
				if(jumKeluargaInt < minKel) {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali.");
					adjustment = false;
				}
				else if(jumKeluargaInt > maxKel) {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh lebih dari 6.");
					System.out.println("Silahkan input kembali.");
					adjustment = false;
				}
				else {
					adjustment = true;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
				adjustment = false;
			}
			
			System.out.print("Masukan Lama Tabungan : ");
			lamaTabungan = inputD.next();

			if(lamaTabungan.matches("[0-9-]+")) {
				lamaTabunganInt = Integer.parseInt(lamaTabungan);
				if(lamaTabunganInt < minLama) {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali.");
					adjustment = false;
				}
				else if(lamaTabunganInt > maxLama) {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh lebih dari 6.");
					System.out.println("Silahkan input kembali.");
					adjustment = false;
				}
				else {
					adjustment = true;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
				adjustment = false;
			}
		}

		if(lamaTabunganInt == 1) {
			for(int index1 = 1; index1 <= maxJan; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaJan = totalDuit * jumKeluargaInt;
			}			
			System.out.println("Total Tabungan Bulan Januari " + totalDuitSemuaKeluargaJan);
		}
		if(lamaTabunganInt <= 2) {
			for(int index1 = 1; index1 <= maxFeb; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaFeb = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Februari " + totalDuitSemuaKeluargaFeb);
		}
		if(lamaTabunganInt <= 3) {
			for(int index1 = 1; index1 <= maxMar; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaMar = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Maret " + totalDuitSemuaKeluargaMar);
		}
		if(lamaTabunganInt <= 4) {
			for(int index1 = 1; index1 <= maxApr; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaApr = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan April " + totalDuitSemuaKeluargaApr);
		}
		if(lamaTabunganInt <= 5) {
			for(int index1 = 1; index1 <= maxMei; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaMei = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Mei " + totalDuitSemuaKeluargaMei);
		}
		if(lamaTabunganInt <= 6) {
			for(int index1 = 1; index1 <= maxJun; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaJun = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Juni " + totalDuitSemuaKeluargaJun);
		}
		if(lamaTabunganInt <= 7) {
			for(int index1 = 1; index1 <= maxJul; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaJul = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Juli " + totalDuitSemuaKeluargaJul);
		}
		if(lamaTabunganInt <= 8) {
			for(int index1 = 1; index1 <= maxAgus; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaAgus = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Agustus " + totalDuitSemuaKeluargaAgus);
		}
		if(lamaTabunganInt <= 9) {
			for(int index1 = 1; index1 <= maxSept; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaSep = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan September " + totalDuitSemuaKeluargaSep);
		}
		if(lamaTabunganInt <= 10) {
			for(int index1 = 1; index1 <= maxOkt; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaOkt = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Oktober " + totalDuitSemuaKeluargaOkt);
		}
		if(lamaTabunganInt <= 11) {
			for(int index1 = 1; index1 <= maxNov; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaNov = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan November " + totalDuitSemuaKeluargaNov);
		}
		if(lamaTabunganInt <= 12) {
			for(int index1 = 1; index1 <= maxDes; index1++) {
				duit-=1000;
				totalDuit = totalDuit + duit;
				totalDuitSemuaKeluargaDes = totalDuit * jumKeluargaInt;
			}
			System.out.println("Total Tabungan Bulan Desember " + totalDuitSemuaKeluargaDes);
		}

		System.out.println("Total Tabungan Selama " + lamaTabunganInt + " Bulan dengan " + jumKeluargaInt + " anggota keluarga adalah " + totalDuitSemuaKeluarga);

	}
}