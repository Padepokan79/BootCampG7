/* 
Created by  		: Richa Fitria dan Khairil
Date/hour			: 24 Mei 2018/ 12.49 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class PedagangBuah {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double totalSenin, jumlahTotalHari = 0, jumlahTotalMinggu = 0, totalHari = 0, jumlahTotalHariSenin, jumlahTotalHariSelasa, jumlahTotalHariRabu, jumlahTotalHariKamis, jumlahTotalHariJumat, jumlahTotalHariSabtu, jumlahTotalHariMinggu, totalHariSenin, totalHariSelasa, totalHariRabu, totalHariKamis, totalHariJumat, totalHariSabtu, totalHariMinggu, jumlahTotalMingguan, jualBulanan, minimum, maximum;
		double rasioKamis, rasioMinggu;
		String hari1 = "", hari2 = "", inputHari= " ", inputHari1 = " ", inputHari2 = " ", inputMenu = "";

		jumlahTotalHariSenin = jumlahTotalHariSelasa = jumlahTotalHariRabu = jumlahTotalHariKamis = jumlahTotalHariJumat = jumlahTotalHariSabtu = jumlahTotalHariMinggu = totalHariSenin = totalHariSelasa = totalHariRabu = totalHariKamis = totalHariJumat = totalHariSabtu = totalHariMinggu = jumlahTotalMingguan = jualBulanan = minimum = maximum = 0;
		rasioMinggu = rasioKamis = 0.0;

		String [] buah = {"semangka", "pisang", "mangga"};
		String [] hari = {"senin","selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
		int [] hargaKiloan = {18000, 15000, 10000 };
		int [] jualSenin = {12, 10, 13};
		int [] jualSelasa = {15, 14, 12};
		int [] jualRabu = {11, 15, 9};
		int [] jualKamis = {8, 7, 15};
		int [] jualJumat = {20, 20, 20};
		int [] jualSabtu = {10, 13, 9};
		int [] jualMinggu = {14, 16, 13};

		for (int index = 0; index < buah.length; index++ ) {
			if (inputHari.equals ("senin")) {
				totalHari = hargaKiloan [index] * jualSenin[index];
			}	
			else if (inputHari.equals ("selasa")) {
				totalHari = hargaKiloan [index] * jualSelasa[index];
			}
			else if (inputHari.equals ("rabu")) {
				totalHari = hargaKiloan [index] * jualRabu[index];
			}
			else if (inputHari.equals ("kamis")) {
				totalHari = hargaKiloan [index] * jualKamis[index];
			}
			else if (inputHari.equals ("jumat")) {
				totalHari = hargaKiloan [index] * jualJumat[index];
			}
			else if (inputHari.equals ("sabtu")) {
				totalHari = hargaKiloan [index] * jualSabtu[index];
			}
			else if (inputHari.equals ("minggu")) {
				totalHari = hargaKiloan [index] * jualMinggu[index];
			}
			jumlahTotalHari = jumlahTotalHari + totalHari; 

			totalHariSenin = hargaKiloan[index] * jualSenin[index];
			jumlahTotalHariSenin = jumlahTotalHariSenin + totalHariSenin;  

			totalHariSelasa = hargaKiloan[index] * jualSelasa[index]; 
			jumlahTotalHariSelasa = jumlahTotalHariSelasa + totalHariSelasa;  
			
			totalHariRabu = hargaKiloan[index] * jualRabu[index]; 
			jumlahTotalHariRabu = jumlahTotalHariRabu + totalHariRabu;  
			
			totalHariKamis = hargaKiloan[index] * jualKamis[index];
			jumlahTotalHariKamis = jumlahTotalHariKamis + totalHariKamis;   
			
			totalHariJumat = hargaKiloan[index] * jualJumat[index]; 
			jumlahTotalHariJumat = jumlahTotalHariJumat + totalHariJumat;  
			
			totalHariSabtu = hargaKiloan[index] * jualSabtu[index]; 
			jumlahTotalHariSabtu = jumlahTotalHariSabtu + totalHariSabtu;  
			
			totalHariMinggu = hargaKiloan[index] * jualMinggu[index];
			jumlahTotalHariMinggu = jumlahTotalHariMinggu + totalHariMinggu;  		

		}

		double[] jualMingguan = {jumlahTotalHariSenin, jumlahTotalHariSelasa, jumlahTotalHariRabu, jumlahTotalHariKamis, jumlahTotalHariJumat,  jumlahTotalHariSabtu, jumlahTotalHariMinggu};
		for (int index1 = 0; index1 < jualMingguan.length; index1++) {
			jumlahTotalMingguan = jumlahTotalMingguan + jualMingguan[index1];

		}

		jualBulanan = jumlahTotalMingguan * 4;

		minimum = jualMingguan[0];
		for(int index = 0; index < jualMingguan.length; index++ ) {

			if (jualMingguan[index] < minimum) {
				minimum = jualMingguan[index];
			}
			if (jualMingguan[index] > maximum) {
				maximum = jualMingguan[index];
			}
		}

		minimum = jualMingguan[0];
		for(int index = 0; index < hari.length; index++) {
			if (jualMingguan[index] < minimum) {
					minimum = jualMingguan[index];
					hari1 = hari[index];
			}
		}

		maximum = 0;
		for(int index1 = 0; index1 < hari.length; index1++) {
			if (jualMingguan[index1] > maximum) {
					maximum = jualMingguan[index1];
					hari2 = hari[index1];
			}
		}


		int [] jualSemangka = {jualSenin[0], jualSelasa[0], jualRabu[0], jualKamis[0], jualJumat[0], jualSabtu[0], jualMinggu[0]};
		int [] jualPisang = {jualSenin[1], jualSelasa[1], jualRabu[1], jualKamis[1], jualJumat[1], jualSabtu[1], jualMinggu[1]};
		int [] jualMangga = {jualSenin[2], jualSelasa[2], jualRabu[2], jualKamis[2], jualJumat[2], jualSabtu[2], jualMinggu[2]};


		int totalJualSemangka, totalJualPisang, totalJualMangga;
		totalJualSemangka = totalJualPisang = totalJualMangga = 0;

		for(int index = 0; index < jualSemangka.length; index++) {
			totalJualSemangka = totalJualSemangka + jualSemangka [index];
			totalJualPisang = totalJualPisang + jualPisang [index];
			totalJualMangga = totalJualMangga + jualMangga [index];
		}

		int [] arrTotalJualBuah = {totalJualSemangka, totalJualPisang, totalJualMangga};

		int maximumBuah = 0;
		String namaMaxBuah = " ";
		for(int index = 0; index < arrTotalJualBuah.length; index++) {
			if (arrTotalJualBuah[index] > maximumBuah) {
				maximumBuah = arrTotalJualBuah[index];
				namaMaxBuah = buah [index];
			}
		}
		


		int [] hargaTotalSemangka = new int [jualSemangka.length];
		int [] hargaTotalPisang = new int [jualPisang.length];
		int [] hargaTotalMangga = new int [jualMangga.length];
		int hargaTotalSemuaSemangka, hargaTotalSemuaPisang, hargaTotalSemuaMangga;
		hargaTotalSemuaSemangka = hargaTotalSemuaPisang = hargaTotalSemuaMangga = 0;


		for (int index=0; index<jualSemangka.length; index++) {
			hargaTotalSemangka [index] = jualSemangka [index] * hargaKiloan [0];
			hargaTotalPisang [index] = jualPisang [index] * hargaKiloan [1];
			hargaTotalMangga [index] = jualMangga [index] * hargaKiloan [2];
			hargaTotalSemuaSemangka = hargaTotalSemuaSemangka + hargaTotalSemangka[index]; 
			hargaTotalSemuaPisang = hargaTotalSemuaPisang + hargaTotalPisang[index]; 
			hargaTotalSemuaMangga = hargaTotalSemuaMangga + hargaTotalMangga[index]; 
		}	

		int [] arrHargaTotalBuah = {hargaTotalSemuaSemangka, hargaTotalSemuaPisang, hargaTotalSemuaMangga};

		int maximumHargaBuah = 0;
		String namaMaxHargaBuah = " ";
		//hargaTotalSemangka = hargaTotalPisang = hargaTotalMangga =0;

		for(int index = 0; index < arrHargaTotalBuah.length; index++) {
			if (arrHargaTotalBuah[index] > maximumHargaBuah) {
				maximumHargaBuah = hargaTotalSemangka[index];
				namaMaxHargaBuah = buah [index];
			}
		}
		
		int minimumHargaBuah = arrHargaTotalBuah[0];
		String namaMinHargaBuah = " ";

		for(int index = 0; index < arrHargaTotalBuah.length; index++) {
			if (arrHargaTotalBuah[index] < minimumHargaBuah) {
				minimumHargaBuah = hargaTotalSemangka[index];
				namaMinHargaBuah = buah [index];
			}
		}
		

		double laba = 0.2, labaPenjualan;
		labaPenjualan = laba * jualBulanan; 

		System.out.println("PEDAGANG BUAH");
		System.out.println("1. Penghasilan Perhari");
		System.out.println("2. Penghasilan Perminggu");
		System.out.println("3. Penghasilan Sebulan");
		System.out.println("4. Penghasilan terkecil");
		System.out.println("5. Penghasilan terbesar");
		System.out.println("6. Perbandingan Penghasilan");
		System.out.println("7. Buah yang paling banyak terjual selama seminggu.");
		System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.");
		System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.");
		System.out.println("10.Hitung Penghasilan Laba penjual selama sebulan.");
		System.out.println("==============================================================");

			
		while(!inputMenu.matches["0-9"]) {
			System.out.print("Masukan Menu yang diinginkan 1 s.d 10:");
			System.out.println();
			inputMenu = keyboard.next();	
			if(inputMenu.matches["0-9"]) {
				System.out.println("Maaf yang anda input salah, Silahkan inputkan berupa angka dari 1 s.d 10.");
			}				
			int inputMenuInt = Integer.parseInt(inputMenu);
			if(inputMenuInt == 1) {
				//penghasilan per hari
				System.out.println("Penghasilan per hari " + inputHari + " adalah " + jumlahTotalHari); //harian
			}
			else if(inputMenuInt == 2) {
				//penghasilan per minggu
				System.out.println("Penghasilan per minggu " + jumlahTotalMingguan); //mingguan	
			}
			else if(inputMenuInt == 3) {
				//penghasilan per bulan
				System.out.printf("Penghasilan per bulan %.2f",jualBulanan); //bulanan	 
			}
			else if(inputMenuInt == 4) {
				//penghasilan terkecil
				System.out.println("Penghasilan terbesar " + maximum + " pada hari " + hari2); //terbesar	
			}
			else if(inputMenuInt == 5) {
				//penghasilan terbesar
				System.out.println("Penghasilan terkecil " + minimum + " pada hari " + hari1); //terkecil	
			}
			else if(inputMenuInt == 6) {
				while(!inputHari1.matches["seninselasarabukamisjumatsabtuminggu"]) {
				System.out.print("Masukan hari ke 1:");
				System.out.println();
				inputHari1 = keyboard.next();	
				}
				
				while (!inputHari2.matches["seninselasarabukamisjumatsabtuminggu"]) {
				System.out.print("Masukan hari ke 2:");
				System.out.println();
				inputHari2 = keyboard.next();
				}
			rasioKamis = jualMingguan[3]/jualMingguan[3];
			rasioMinggu = jualMingguan[6]/jualMingguan[3];
			System.out.printf("Perbandingan hari kamis dan minggu adalah " + rasioKamis + " : %.2f", rasioMinggu); //terkecil
			System.out.println();	
				//penghasilan perbandingan
			}
			else if(inputMenuInt == 7) {
				//buah paling banyak terjual selama seminggu
				System.out.println("Buah yang paling banyak terjual selama seminggu adalah " + namaMaxBuah);
			}
			else if(inputMenuInt == 8) {
				//Buah yang memiliki penghasilan penjualan terbesar selama seminggu
				System.out.println("Buah yang memiliki penghasilan penjualan terbesar selama seminggu adalah " + namaMaxHargaBuah);
			}
			else if(inputMenuInt == 9) {
				//Buah yang memiliki penghasilan penjualan terkecil selama seminggu
				System.out.println("Buah yang memiliki penghasilan penjualan terkecil selama seminggu adalah " + namaMinHargaBuah);
			}
			else if(inputMenuInt == 10) {
				//jika mengambil laba 20%
				System.out.println("Penghasilan Laba penjual selama sebulan, jika penjual mengambil untuk  sebanyak 20% dari harga jual " + labaPenjualan);

			}
		}


	}
}