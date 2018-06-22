import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ShowBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	key 		= new Scanner(System.in);
		Buah	buah		= new Buah();
		Buah	semangka	= new Buah("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah	pisang		= new Buah("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		Buah	mangga		= new Buah("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);
		
		String 	inputMenu, lanjutkan, inputHariBanding1 = "", inputHariBanding2 = "";
		int 	menu, jumlahHari = 7, perbandingan1, perbandingan2, totHarian,
				jumlahJualSemangka = 0, jumlahJualPisang = 0, jumlahJualMangga = 0;

		double 	pendapatanMingguan	 		= 0,         
				pendapatanBulanan	 		= 0,
				jumlahPenghasilanSemangka 	= 0, 
				jumlahPenghasilanPisang 	= 0, 
				jumlahPenghasilanMangga 	= 0,
				hargaBeli = 0, laba =0;
		
		ArrayList<Buah> listBuah = new ArrayList<Buah>();
		listBuah.add(semangka);
		listBuah.add(pisang);
		listBuah.add(mangga);
		
		ArrayList<String> listHari = new ArrayList<String>();
		listHari.add("Senin");
		listHari.add("Selasa");
		listHari.add("Rabu");
		listHari.add("Kamis");
		listHari.add("Jumat");
		listHari.add("Sabtu");
		listHari.add("Minggu");
		
		ArrayList<String> listNamaBuah = new ArrayList<String>();
		listNamaBuah.add(semangka.getNamaBuah());
		listNamaBuah.add(pisang.getNamaBuah());
		listNamaBuah.add(mangga.getNamaBuah());
		
		ArrayList<Integer> listJumlahSemangka = new ArrayList<Integer>();
		listJumlahSemangka.add(semangka.getHari1());
		listJumlahSemangka.add(semangka.getHari2());
		listJumlahSemangka.add(semangka.getHari3());
		listJumlahSemangka.add(semangka.getHari4());
		listJumlahSemangka.add(semangka.getHari5());
		listJumlahSemangka.add(semangka.getHari6());
		listJumlahSemangka.add(semangka.getHari7());
		
		ArrayList<Integer> listJumlahPisang = new ArrayList<Integer>();
		listJumlahPisang.add(pisang.getHari1());
		listJumlahPisang.add(pisang.getHari2());
		listJumlahPisang.add(pisang.getHari3());
		listJumlahPisang.add(pisang.getHari4());
		listJumlahPisang.add(pisang.getHari5());
		listJumlahPisang.add(pisang.getHari6());
		listJumlahPisang.add(pisang.getHari7());
		
		ArrayList<Integer> listJumlahMangga = new ArrayList<Integer>();
		listJumlahMangga.add(mangga.getHari1());
		listJumlahMangga.add(mangga.getHari2());
		listJumlahMangga.add(mangga.getHari3());
		listJumlahMangga.add(mangga.getHari4());
		listJumlahMangga.add(mangga.getHari5());
		listJumlahMangga.add(mangga.getHari6());
		listJumlahMangga.add(mangga.getHari7());
		
		ArrayList<Integer> listJumlahBuah = new ArrayList<Integer>();
		
		ArrayList<Double> listHarian = new ArrayList<Double>();
		
		ArrayList<Double> listPenghasilan = new ArrayList<Double>();
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		for(Integer jmlSemangka : listJumlahSemangka) {
			jumlahJualSemangka += jmlSemangka;
		}
		listJumlahBuah.add(jumlahJualSemangka);
		jumlahPenghasilanSemangka = jumlahJualSemangka * semangka.getHargaBuah();
		listPenghasilan.add(jumlahPenghasilanSemangka);
		
		for(Integer jmlPisang : listJumlahPisang) {
			jumlahJualPisang += jmlPisang;
		}
		listJumlahBuah.add(jumlahJualPisang);
		jumlahPenghasilanPisang = jumlahJualPisang * pisang.getHargaBuah();
		listPenghasilan.add(jumlahPenghasilanPisang);
		
		for(Integer jmlMangga : listJumlahMangga) {
			jumlahJualMangga += jmlMangga;
		}
		listJumlahBuah.add(jumlahJualMangga);
		jumlahPenghasilanMangga = jumlahJualMangga * mangga.getHargaBuah();
		listPenghasilan.add(jumlahPenghasilanMangga);
		
		do{
			System.out.println("[1]   Penghasilan perhari ");
			System.out.println("[2]   Penghasilan perminggu ");
			System.out.println("[3]   Penghasilan perbulan ");
			System.out.println("[4]   Penghasilan Terbesar ");
			System.out.println("[5]   Penghasilan Terkecil ");
			System.out.println("[6]   Perbandingan penghasilan ");
			System.out.println("[7]   Buah yang paling banyak terjual selama seminggu");
			System.out.println("[8]   Buah yang memiliki penghasilan penjualan terbesar selama seminggu ");
			System.out.println("[9]   Buah yang memiliki penghasilan penjualan terkecil selama seminggu ");
			System.out.println("[10]  Hitung penghasilan laba penjualan selama sebulan ");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("");
			
			do{
				System.out.print("Masukan menu yang diinginkan 1 - 10 :");
				inputMenu = key.nextLine();
				menu = Integer.parseInt(inputMenu);				
				System.out.println();
				if (inputMenu.equals("1")) {
					penghasilanHarian(jumlahHari, listBuah, listHarian);
				}
				else if (inputMenu.equals("2")) {
					penghasilanHarian(jumlahHari, listBuah, listHarian);
					for(Double harian : listHarian)
						pendapatanMingguan += harian;
					System.out.println("\nPendapatan Mingguan : " +pendapatanMingguan);
				}
				else if (inputMenu.equals("3")) {
					penghasilanHarian(jumlahHari, listBuah, listHarian);
					for(Double harian : listHarian)
						pendapatanMingguan += harian;
					pendapatanBulanan = pendapatanMingguan * 4;
					System.out.println("\nPendapatan Mingguan : " +String.format("%.0f", pendapatanMingguan));
					System.out.println("Pendapatan Bulanan : " +String.format("%.0f", pendapatanBulanan));
				}
				else if (inputMenu.equals("4")) {
					penghasilanHarian(jumlahHari, listBuah, listHarian);
					for(Double harian : listHarian)
						pendapatanMingguan += harian;	
					Object max = Collections.max(listHarian);
					System.out.println("\nPenghasilan Terbesar adalah pada hari " +listHari.get(listHarian.indexOf(Collections.max(listHarian)))+" Rp "+max);
				}
				else if (inputMenu.equals("5")) {
					penghasilanHarian(jumlahHari, listBuah, listHarian);
					for(Double harian : listHarian)
						pendapatanMingguan += harian;	
					Object min = Collections.min(listHarian);
					System.out.println("\nPenghasilan Terkecil adalah pada hari " +listHari.get(listHarian.indexOf(Collections.min(listHarian)))+" Rp "+min);
				}
				else if (inputMenu.equals("6")) {
//					penghasilanHarian(jumlahHari, listBuah, listHarian);
//					for(Double harian : listHarian)
//						pendapatanMingguan += harian;	
//					
//					while(inputHariBanding1.equals("") && inputHariBanding1.matches("[A-Z a-z]*") ){
//						System.out.print("Masukan Hari Ke 1 : ");
//						inputHariBanding1 = key.nextLine();
//						if(inputHariBanding1.equalsIgnoreCase("Senin") || inputHariBanding1.equals("Selasa") || inputHariBanding1.equals("Rabu") || inputHariBanding1.equals("Kamis") || inputHariBanding1.equals("Jumat") || inputHariBanding1.equals("Sabtu") || inputHariBanding1.equals("Minggu")){
//							
//							for(String hari : listHari) {
//								for	(int har=0; har < listHari.size(); har++) {
//									if (hari.equalsIgnoreCase(inputHariBanding1)) {
////										perbandingan1 = listHarian.get(1);
//									}
//								}
//							}
//						}
//						else{
//							System.out.println("-- Hari tidak ada --");
//							inputHariBanding1 = "";
//						}
////						System.out.print("Masukan Hari Ke 2 : ");
////						inputHariBanding2 = key.nextLine();
//					}
					int day1 = 0;
					int day2 = 0;
					System.out.println("6. Perbandingan Penghasilan");
					System.out.println("Masukan Hari kesatu");
					inputHariBanding1 = key.nextLine();
					System.out.println("Masukan Hari Kedua");
					inputHariBanding2 = key.nextLine();
					for(int dayx=1; dayx<=jumlahHari; dayx++) {
						totHarian=0;
						for(Buah obj: listBuah) {
							totHarian+=obj.pendapatanHarian(dayx);
						}
						tempList.add(totHarian);
						System.out.println("Total pemasukan hari "+ buah.checkDaily(dayx) + " " + totHarian);
					}
					day1=buah.checkDays(inputHariBanding1);
					System.out.println("Panggil Hari Satu "+ buah.checkDaily(day1+1) + " " + tempList.get(day1));

					day2=buah.checkDays(inputHariBanding2);
					System.out.println("Panggil Hari Satu "+ buah.checkDaily(day2+1) + " " + tempList.get(day2));
					
					if ((tempList.get(day1)-tempList.get(day2))==0) {
						System.out.println("Harga Sama");
					}else if ((tempList.get(day1)-tempList.get(day2))>0) {
						System.out.println("Penghasilan hari " + inputHariBanding1 + ", Lebih Besar dari " + inputHariBanding2);
					}else {
						System.out.println("Penghasilan hari " + inputHariBanding2 + ", Lebih Besar dari " + inputHariBanding1);
					}

				}
				else if (inputMenu.equals("7")) {
					System.out.println("Total Penjualan Semangka : "+jumlahJualSemangka);
					System.out.println("Total Penjualan Pisang   : "+jumlahJualPisang);
					System.out.println("Total Penjualan Mangga   : "+jumlahJualMangga);
					Object max = Collections.max(listJumlahBuah);
					System.out.println("Buah yang paling laku terjual adalah "+listNamaBuah.get(listJumlahBuah.indexOf(Collections.max(listJumlahBuah))));
				}
				else if (inputMenu.equals("8")) {	
					System.out.println("Total Penghasilan Semangka : "+jumlahPenghasilanSemangka);
					System.out.println("Total Penghasilan Pisang   : "+jumlahPenghasilanPisang);
					System.out.println("Total Penghasilan Mangga   : "+jumlahPenghasilanMangga);
					Object max = Collections.max(listPenghasilan);
					System.out.println("Buah dengan penghasilan tertinggi adalah "+listNamaBuah.get(listPenghasilan.indexOf(Collections.max(listPenghasilan))));
				}
				else if (inputMenu.equals("9")) {	
					System.out.println("Total Penghasilan Semangka : "+jumlahPenghasilanSemangka);
					System.out.println("Total Penghasilan Pisang   : "+jumlahPenghasilanPisang);
					System.out.println("Total Penghasilan Mangga   : "+jumlahPenghasilanMangga);
					Object min = Collections.min(listPenghasilan);
					System.out.println("Buah dengan penghasilan terendah adalah "+listNamaBuah.get(listPenghasilan.indexOf(Collections.min(listPenghasilan))));
				}
				else if (inputMenu.equals("10")) {	
					penghasilanHarian(jumlahHari, listBuah, listHarian);
					for(Double harian : listHarian)
						pendapatanMingguan += harian;
					pendapatanBulanan = pendapatanMingguan * 4;
					
					hargaBeli 	 = (pendapatanBulanan*20)/100;
					laba		 = hargaBeli;
					System.out.println("Laba dari penjualan adalah Rp "+laba);
				}
			}while(menu < 1 && menu > 10 && !inputMenu.matches("[0-9]*"));
			
			System.out.println("");
			System.out.print("Mau menghitung yang lain | Y / T | ?");
			lanjutkan = key.nextLine();
		}while(lanjutkan.equals("Y"));
	}

	private static void penghasilanHarian(int jumlahHari, ArrayList<Buah> listBuah, ArrayList<Double> listHarian) {
		double pendapatanHarian;
		for(int hari=1; hari <= jumlahHari; hari++) {
			pendapatanHarian = 0;
			for(Buah hargaBuahH : listBuah) {
				pendapatanHarian += hargaBuahH.pendapatanHarian(hari);
			}
			System.out.println("Hari ke " +hari+ " Rp. "+pendapatanHarian);
			listHarian.add(pendapatanHarian);
		}
	}

}
