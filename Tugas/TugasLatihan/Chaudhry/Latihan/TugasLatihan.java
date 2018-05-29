/*
	DATE CREATED : 25 MEI 2018
	AUTHOR		 : - NURDHIAT CHAUDHARY MALIK
				   - YANA NURYANA
*/
import java.util.Scanner;				   
public class TugasLatihan{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int maxBerat, penghasilanMinggu, penghasilanBulan;
		int laba, hargaBeli;
		int menu, hari, max, min, indexHari, perbandingan1, perbandingan2, totalSemangka, totalPisang, totalMangga, buah, day, penjualanSemangka, penjualanPisang, penjualanMangga, buahMaxMin;
		String inputMenu, inputHari, inputHariBanding1 = "", inputHariBanding2 = "", lanjutkan;
		maxBerat 			= 20;
		penghasilanMinggu 	= perbandingan1 = totalPisang = totalSemangka = totalMangga = buah = day = buahMaxMin = 0;
		penghasilanBulan 	= perbandingan2 = penjualanMangga = penjualanPisang = penjualanSemangka = 0;
		max 				= laba = hargaBeli = 0;
		min 				= 10000000;

		String[] namaHari 	= {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
		String[] namaBuah 	= {"Semangka", "Pisang", "Mangga"};
		int[] semangka 		= {12, 15, 11, 8, 20, 10, 14};
		int[] pisang 		= {10, 14, 15, 7, 20, 13, 16};
		int[] mangga 		= {13, 12, 9, 15, 20, 9, 13};
		int[] harga 		= {18000, 15000, 10000}; 

		int[] semangkaHari	 	= new int[semangka.length];
		int[] pisangHari 		= new int[pisang.length];
		int[] manggaHari 		= new int[mangga.length];
		int[] totalPerHari 		= new int[semangka.length];
		int[] totalBuah 		= new int[namaBuah.length];
		int[] penghasilanBuah	= new int[namaBuah.length];

		

		// Proses menghitung Total harga buah per hari
		for (int index = 0; index < semangka.length; index++) {
			semangkaHari[index] = semangka[index]*harga[0];
		}
		for (int index = 0; index < pisang.length; index++) {
			pisangHari[index] = pisang[index]*harga[1];
		}
		for (int index = 0; index < mangga.length; index++) {
			manggaHari[index] = mangga[index]*harga[2];
		}

		// proses menghitung total harga per hari
		for (int index = 0; index < semangka.length; index++) {
			totalPerHari[index] = semangkaHari[index] + pisangHari[index] + manggaHari[index];
		}

		// proses penghasilan per minggu
		for (int index=0; index<namaHari.length; index++) {
			// System.out.println(namaHari[index]+" : "+totalPerHari[index]);
			penghasilanMinggu += totalPerHari[index];
		}

		// porses penghasilan per bulan
			penghasilanBulan = penghasilanMinggu * 4;

		// proses penghasilan buah terbesar terkecil
			for (int index=0; index < semangkaHari.length; index++) {
				penjualanSemangka += semangkaHari[index];
			}
			for (int index=0; index < pisangHari.length; index++) {
				penjualanPisang += pisangHari[index];
			}
			for (int index=0; index < manggaHari.length; index++) {
				penjualanMangga += manggaHari[index];
			}
			penghasilanBuah[0] = penjualanSemangka;
			penghasilanBuah[1] = penjualanPisang;
			penghasilanBuah[2] = penjualanMangga;
			

	do{

		System.out.println("[1]  --> Penghasilan perhari ");
		System.out.println("[2]  --> Penghasilan perminggu ");
		System.out.println("[3]  --> Penghasilan perbulan ");
		System.out.println("[4]  --> Penghasilan Terbesar ");
		System.out.println("[5]  --> Penghasilan Terkecil ");
		System.out.println("[6]  --> Perbandingan penghasilan ");
		System.out.println("[7]  --> Buah yang paling banyak terjual selama seminggu");
		System.out.println("[8]  --> Buah yang memiliki penghasilan penjualan terbesar selama seminggu ");
		System.out.println("[9]  --> Buah yang memiliki penghasilan penjualan terkecil selama seminggu ");
		System.out.println("[10] --> Hitung penghasilan laba penjualan selama sebulan ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("");
		
		do{
			System.out.print("Masukan menu yang diinginkan 1 - 10 :");
			inputMenu = key.nextLine();
			menu = Integer.parseInt(inputMenu);

			if (inputMenu.equals("1")) {
				
				do{
					System.out.print("Inputan Hari senin - minggu [0-6] : ");
					inputHari = key.nextLine();

					hari = Integer.parseInt(inputHari);
					if (inputHari.equals("0")) {
						System.out.println("Penghasilan hari senin : "+totalPerHari[hari]);
					}
					else if (inputHari.equals("1")) {
						System.out.println("Penghasilan hari Selasa : "+totalPerHari[hari]);
					}
					else if (inputHari.equals("2")) {
						System.out.println("Penghasilan hari Rabu : "+totalPerHari[hari]);
					}
					else if (inputHari.equals("3")) {
						System.out.println("Penghasilan hari Kamis : "+totalPerHari[hari]);
					}
					else if (inputHari.equals("4")) {
						System.out.println("Penghasilan hari Jumat : "+totalPerHari[hari]);
					}
					else if (inputHari.equals("5")) {
						System.out.println("Penghasilan hari Sabtu : "+totalPerHari[hari]);
					}
					else if (inputHari.equals("6")) {
						System.out.println("Penghasilan hari Minggu : "+totalPerHari[hari]);
					}
					else {
						System.out.println("Masukkan hari 0-6");
					}

				}while(hari < 0 && hari > 6 && !inputHari.matches("[0-6]"));

			}
			else if (inputMenu.equals("2")) {
				for (int index=0; index<namaHari.length; index++) {
					System.out.println(namaHari[index]+" : "+totalPerHari[index]);
					// penghasilanMinggu += totalPerHari[index];
				}
				System.out.println("\nTotal penghasilan per minggu : "+penghasilanMinggu);
			}
			else if (inputMenu.equals("3")) {
				System.out.println("Total penghasilan per Bulan : "+penghasilanBulan);
			}
			else if (inputMenu.equals("4")) {
			for (int index=0; index < namaHari.length; index++) {
				if (totalPerHari[index] > max) {
					max = totalPerHari[index];
					
					day = index;
				}
			}				
				System.out.println("Penghasilan Terbesar pada hari : "+namaHari[day]+", Penghasilan : " +max);
			}
			else if (inputMenu.equals("5")) {
				min = penghasilanMinggu;
				for (int index=0; index < namaHari.length; index++) {
					if (totalPerHari[index] < min) {
						min = totalPerHari[index];

						day = index;
					}
				}
				System.out.println("Penghasilan Terkecil pada hari : "+namaHari[day]+", Penghasilan : "+min);
			}
			else if (inputMenu.equals("6")) {
				
				while(inputHariBanding1.equals("") && inputHariBanding1.matches("[A-Z a-z]*") ){
					System.out.print("Masukan Hari Ke 1 : ");
					inputHariBanding1 = key.nextLine();

					if(inputHariBanding1.equals("Senin") || inputHariBanding1.equals("Selasa") || inputHariBanding1.equals("Rabu") || inputHariBanding1.equals("Kamis") || inputHariBanding1.equals("Jumat") || inputHariBanding1.equals("Sabtu") || inputHariBanding1.equals("Minggu")){
						
						for (int index = 0; index < namaHari.length; index++) {
							if (namaHari[index].equals(inputHariBanding1)) {
								perbandingan1 = totalPerHari[index];
							}
						}
					}
					else{
						System.out.println("-- Hari tidak ada --");
						inputHariBanding1 = "";
					}
				}

				while(inputHariBanding2.equals("") && inputHariBanding2.matches("[A-Z a-z]*")){
					System.out.print("Masukan Hari Ke 2 : ");
					inputHariBanding2 = key.nextLine();
					
					if(inputHariBanding2.equals("Senin") || inputHariBanding2.equals("Selasa") || inputHariBanding2.equals("Rabu") || inputHariBanding2.equals("Kamis") || inputHariBanding2.equals("Jumat") || inputHariBanding2.equals("Sabtu") || inputHariBanding2.equals("Minggu")){
						for (int index = 0; index < namaHari.length; index++) {
							if (namaHari[index].equals(inputHariBanding2)) {
								perbandingan2 = totalPerHari[index];		
							}
						}
					}
					else{
						System.out.println("-- Hari tidak ada --");
						inputHariBanding2 = "";
					}
				}
				System.out.println("Perbandingan antara hari "+inputHariBanding1+" dan hari "+inputHariBanding2+" --> " +perbandingan1+" : "+perbandingan2+"");
				if (perbandingan1 > perbandingan2) {
					System.out.println("Pendapatan Hari "+inputHariBanding1+" Lebih besar");
				}
				else if(perbandingan2 > perbandingan1){
					System.out.println("Pendapatan Hari "+inputHariBanding2+" Lebih besar");
				}
			}
			else if (inputMenu.equals("7")) {
				
				for (int index = 0; index < namaHari.length; index++) {
					totalSemangka += semangka[index];
					totalPisang += pisang[index];
					totalMangga += mangga[index];
				}
				totalBuah[0] = totalSemangka;
				totalBuah[1] = totalPisang;
				totalBuah[2] = totalMangga;

				for (int index = 0; index < totalBuah.length; index++) {
					if (totalBuah[index] > max) {
						max = totalBuah[index];
						
						buah = index;
					}
				}

				System.out.println("Buah "+namaBuah[buah]+", Total "+max+" kg");
			}
			else if (inputMenu.equals("8")) {

				System.out.println("penjaualan Semangka per minggu: "+penjualanSemangka);
				System.out.println("penjaualan Pisang per minggu: "+penjualanPisang);
				System.out.println("penjaualan Mangga per minggu: "+penjualanMangga);

				for (int index=0; index < namaBuah.length; index++) {
					if (penghasilanBuah[index] > max) {
						max = penghasilanBuah[index];
						buahMaxMin = index;
					}
				}
				System.out.println("Buah dengan penghasilan terbesar selama seminggu: "+namaBuah[buahMaxMin]+" jumlah: "+max);
			}
			else if (inputMenu.equals("9")) {
				min = penghasilanMinggu;
				System.out.println("penjaualan Semangka per minggu: "+penjualanSemangka);
				System.out.println("penjaualan Pisang per minggu: "+penjualanPisang);
				System.out.println("penjaualan Mangga per minggu: "+penjualanMangga);

				for (int index=0; index < namaBuah.length; index++) {
					if (penghasilanBuah[index] < min) {
						min = penghasilanBuah[index];
						buahMaxMin = index;
					}
				}
				System.out.println("Buah dengan penghasilan terbesar selama seminggu: "+namaBuah[buahMaxMin]+" jumlah: "+min);
			}
			else if (inputMenu.equals("10")) {
				hargaBeli 	 = (penghasilanBulan*20)/100;
				laba		 = hargaBeli;
				System.out.println("Laba dari penjualan adalah Rp "+laba);
			}

		}while(menu < 1 && menu > 10 && !inputMenu.matches("[0-9]*"));

		System.out.println("");
		System.out.print("Mau menghitung yang lain | Y / T | ?");
		lanjutkan = key.nextLine();

	}while(lanjutkan.equals("Y"));

	}
}