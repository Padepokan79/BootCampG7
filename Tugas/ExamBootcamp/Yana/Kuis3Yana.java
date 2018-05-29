/*
Created by 	: Yana
Date 		: 29 Mei 2018
Start 		: 09.01
End 		: 10.02
Modif Start : 11.**
Modif End   : 11.**
*/

import java.util.Scanner;

public class Kuis3Yana{
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		String 	strjumlahKeluarga, strlamaTabungan;
		int 	batasMinKel, batasMaxKel, batasMinLama, batasMaxLama;
		int 	jumlahKeluarga, lamaTabungan, totalTabungan;
		int 	januari, februari, maret, april, mei, juni, juli, agustus, sempember, oktober, nopember, desember;
		int 	tabunganJanuari, tabunganFebruari, tabunganMaret, tabunganApril, tabunganMei, tabunganJuni,
				tabunganJuli, tabunganAgustus, tabunganSeptember, tabunganOktober, tabunganNopember, tabunganDesember;
		int 	bulanKe1 = 1, bulanKe2 = 2, bulanKe3 = 3, bulanKe4 = 4, bulanKe5 = 5, bulanKe6 = 6, bulanKe7 = 7,
				bulanKe8 = 8, bulanKe9 = 9, bulanKe10 = 10, bulanKe11 = 11, bulanKe12 = 12;

		januari 		= maret = mei = juli = agustus = oktober = desember = 31;
		februari 		= 28;
		april 			= juni = sempember = nopember = 30;
		tabunganJanuari	= tabunganFebruari = tabunganMaret = tabunganApril = tabunganMei = tabunganJuni =
						  tabunganJuli = tabunganAgustus = tabunganSeptember = tabunganOktober = tabunganNopember =
						  tabunganDesember = totalTabungan = 0 ;

		jumlahKeluarga 	= lamaTabungan = 0;
		batasMinKel 	= 2; //batas minimum jumlah keluarga
		batasMaxKel 	= 6; //batas maksimum jumlah keluarga
		batasMinLama 	= 1; //batas minimum lama menabung
		batasMaxLama 	= 6; //batas maksimu lama menabung

		//pertanyaan jumlah keluarga
		do{
			System.out.print("Masukan Jumlah keluarga: ");
			strjumlahKeluarga = input.nextLine();
			if (strjumlahKeluarga.matches("[0-9]*")) {
				jumlahKeluarga = Integer.parseInt(strjumlahKeluarga);
				if (jumlahKeluarga < batasMinKel) {
					System.out.println("Maaf, jumlah keluarga tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali");
				}
				else if (jumlahKeluarga > batasMaxKel) {
					System.out.println("Maaf, jumlah keluarga tidak boleh lebih dari 6.");
					System.out.println("Silahkan input kembali");
				}
			}
			else if (strjumlahKeluarga.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}	
		}while(strjumlahKeluarga.matches("[^0-9]*") || strjumlahKeluarga.equals("") || jumlahKeluarga < batasMinKel || jumlahKeluarga > batasMaxKel);

		//pertanyaan lama menabung
		do{
			System.out.print("Masukan Lama Tabungan: ");
			strlamaTabungan = input2.nextLine();
			if (strlamaTabungan.matches("[0-9]*")) {
				lamaTabungan = Integer.parseInt(strlamaTabungan);
				if (lamaTabungan < batasMinLama) {
					System.out.println("Maaf, jumlah bulan tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali");
				}
				else if (lamaTabungan > batasMaxLama) {
					System.out.println("Maaf, jumlah bulan tidak boleh lebih dari 12.");
					System.out.println("Silahkan input kembali");
				}
			}
			else if (strlamaTabungan.matches("[^0-9]")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali");
			}	
		}while(strlamaTabungan.matches("[^0-9]*") || lamaTabungan < batasMinLama || lamaTabungan > batasMaxLama);

		//ketentuan input dan bulan

		//ketentuan lama bulan dan tabungan
		// for (int bulan=12; bulan > 0; bulan--) {
			
		// }
		if (lamaTabungan >= bulanKe12) {
			for (int tabungan=desember; tabungan > 0; tabungan--) {
				tabunganDesember = tabunganDesember + tabungan;
			}
			tabunganDesember = tabunganDesember * jumlahKeluarga;
		System.out.println("Tabungan bulan keduabelas adalah "+tabunganDesember+"000");	
		}
		if (lamaTabungan >= bulanKe11) {
			for (int tabungan=nopember; tabungan > 0; tabungan--) {
				tabunganNopember = tabunganNopember + tabungan;
			}
			tabunganNopember = tabunganNopember * jumlahKeluarga;
		System.out.println("Tabungan bulan kesebelas adalah  "+tabunganNopember+"000");			
		}
		if (lamaTabungan >= bulanKe10) {
			for (int tabungan=oktober; tabungan > 0; tabungan--) {
				tabunganOktober = tabunganOktober + tabungan;
			}
			tabunganOktober = tabunganOktober * jumlahKeluarga;
		System.out.println("Tabungan bulan kesepuluh adalah  "+tabunganOktober+"000");			
		}
		if (lamaTabungan >= bulanKe9) {
			for (int tabungan=sempember; tabungan > 0; tabungan--) {
				tabunganSeptember = tabunganSeptember + tabungan;
			}
			tabunganSeptember = tabunganSeptember * jumlahKeluarga;
		System.out.println("Tabungan bulan kesembilan adalah "+tabunganSeptember+"000");			
		}
		if (lamaTabungan >= bulanKe8) {
			for (int tabungan=agustus; tabungan > 0; tabungan--) {
				tabunganAgustus = tabunganAgustus + tabungan;
			}
			tabunganAgustus = tabunganAgustus * jumlahKeluarga;
		System.out.println("Tabungan bulan kedelapan adalah  "+tabunganAgustus+"000");			
		}
		if (lamaTabungan >= bulanKe7) {
			for (int tabungan=juli; tabungan > 0; tabungan--) {
				tabunganJuli = tabunganJuli + tabungan;
			}
			tabunganJuli = tabunganJuli * jumlahKeluarga;
		System.out.println("Tabungan bulan ketujuh adalah    "+tabunganJuli+"000");			
		}
		if (lamaTabungan >= bulanKe6) {
			for (int tabungan=juni; tabungan > 0; tabungan--) {
				tabunganJuni = tabunganJuni + tabungan;
			}
			tabunganJuni = tabunganJuni * jumlahKeluarga;
		System.out.println("Tabungan bulan keenam adalah     "+tabunganJuni+"000");			
		}
		if (lamaTabungan >= bulanKe5) {
			for (int tabungan=mei; tabungan > 0; tabungan--) {
				tabunganMei = tabunganMei + tabungan;
			}
			tabunganMei = tabunganMei * jumlahKeluarga;
		System.out.println("Tabungan bulan kelima adalah     "+tabunganMei+"000");			
		}
		if (lamaTabungan >= bulanKe4) {
			for (int tabungan=april; tabungan > 0; tabungan--) {
				tabunganApril = tabunganApril + tabungan;
			}
			tabunganApril = tabunganApril * jumlahKeluarga;
		System.out.println("Tabungan bulan keempat adalah    "+tabunganApril+"000");			
		}
		if (lamaTabungan >= bulanKe3) {
			for (int tabungan=maret; tabungan > 0; tabungan--) {
				tabunganMaret = tabunganMaret + tabungan;
			}
			tabunganMaret = tabunganMaret * jumlahKeluarga;
		System.out.println("Tabungan bulan ketiga adalah     "+tabunganMaret+"000");			
		}
		if (lamaTabungan >= bulanKe2) {
			for (int tabungan=februari; tabungan > 0; tabungan--) {
				tabunganFebruari = tabunganFebruari + tabungan;
			}
			tabunganFebruari = tabunganFebruari * jumlahKeluarga;
		System.out.println("Tabungan bulan kedua adalah      "+tabunganFebruari+"000");			
		}
		if (lamaTabungan >= 1) {
			for (int tabungan=januari; tabungan > 0; tabungan--) {
				tabunganJanuari = tabunganJanuari + tabungan;
			}
			tabunganJanuari = tabunganJanuari * jumlahKeluarga;
		System.out.println("Tabungan bulan pertama adalah    "+tabunganJanuari+"000");
		}
		totalTabungan = tabunganJanuari + tabunganFebruari + tabunganMaret + tabunganApril + tabunganMei +
						tabunganJuni + tabunganJuli + tabunganAgustus + tabunganSeptember + tabunganOktober +
						tabunganNopember + tabunganDesember; 
		System.out.println();
		System.out.println("Total penghasilan selama"+lamaTabungan+" dengan "+jumlahKeluarga+" anggota keluarga adalah "+totalTabungan+"000");	
	}
}