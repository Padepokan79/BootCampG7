package AlifharAndrianRyan;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBioskop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key			= new Scanner(System.in);
		Bioskop reguler 	= new Bioskop("Reguler", 45000, 55000,15, 15, 15, 15, 15, 20, 20);
		Bioskop starium 	= new Bioskop("Starium", 50000, 60000, 10, 10, 10, 10, 10, 15, 15);
		Bioskop sweetbox 	= new Bioskop("Sweetbox", 55000, 70000,  5,  5,  5,  5,  5,  8,  8);
		Bioskop redvelvet 	= new Bioskop("Redvelvet", 90000, 125000, 8, 8, 8, 8, 8, 9, 9);
		
		String 	lanjutkan, inputMenu, inputBioskop1, inputBioskop2;
		int 	menu, jumlahHari = 7, jumlahTiket, tiketMingguan = 0;
		double	pendapatanHarian, pendapatanMingguan = 0, penghasilan1 = 0, penghasilan2 = 0;
		
		ArrayList<Bioskop> listBioskop = new ArrayList<Bioskop>();
		listBioskop.add(reguler);
		listBioskop.add(starium);
		listBioskop.add(sweetbox);
		listBioskop.add(redvelvet);
		
		ArrayList<String> listJenisBioskop = new ArrayList<String>();
		listJenisBioskop.add(reguler.getJenisTiket());
		listJenisBioskop.add(starium.getJenisTiket());
		listJenisBioskop.add(sweetbox.getJenisTiket());
		listJenisBioskop.add(redvelvet.getJenisTiket());
		
		ArrayList<Double> listHarian = new ArrayList<Double>();
		
		ArrayList<Integer> listTiketHarian = new ArrayList<Integer>();
		
		do{
			System.out.println("[1]   Penghasilan perhari ");
			System.out.println("[2]   Penghasilan perminggu ");
			System.out.println("[3]   Total Tiket terjual perhari ");
			System.out.println("[4]   Total Tiket terjual perminggu ");
			System.out.println("[5]   Perbandingan penjualan ");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("");
			
			do{
				System.out.print("Masukan menu yang diinginkan 1 - 5 :");
				inputMenu = key.nextLine();
				menu = Integer.parseInt(inputMenu);				
				System.out.println();
				if (inputMenu.equals("1")) {
					pendapatanHarian(inputMenu, jumlahHari, listBioskop, listHarian);
				}
				else if (inputMenu.equals("2")) {
					pendapatanHarian(inputMenu, jumlahHari, listBioskop, listHarian);
					for(Double harian : listHarian)
						pendapatanMingguan += harian;
					System.out.println("\nPendapatan Mingguan : " +pendapatanMingguan);
				}
				else if (inputMenu.equals("3")) {
					tiketHarian(inputMenu, jumlahHari, listBioskop, listTiketHarian);
				}
				else if (inputMenu.equals("4")) {
					tiketHarian(inputMenu, jumlahHari, listBioskop, listTiketHarian);
					for(Integer harian : listTiketHarian)
						tiketMingguan += harian;
					System.out.println("\nJumlah Tiket PerMinggu : " +tiketMingguan);
				}
				else if (inputMenu.equals("5")) {
					System.out.println("Masukan Hari kesatu");
					inputBioskop1 = key.nextLine();
					System.out.println("Masukan Hari Kedua");
					inputBioskop2 = key.nextLine();
					
					for(Bioskop bioskop : listBioskop) {
						if (inputBioskop1.equals(bioskop.getJenisTiket())) {
							for(int hari=1; hari <= jumlahHari; hari++) {	
							penghasilan1 += bioskop.pendapatanHarian(hari);
							}
						}
						if (inputBioskop2.equals(bioskop.getJenisTiket())) {
							for(int hari=1; hari <= jumlahHari; hari++) {					
							penghasilan2 += bioskop.pendapatanHarian(hari);
							}
						}
					}
					System.out.println("Pendapatan Mingguan "+inputBioskop1+" adalah "+penghasilan1);
					System.out.println("Pendapatan Mingguan "+inputBioskop2+" adalah "+penghasilan2);
					if (penghasilan1 > penghasilan2) {
						System.out.println("Pendapatan "+inputBioskop1+" lebih besar dari "+inputBioskop2);
					}
					else if (penghasilan2 > penghasilan1) {
						System.out.println("Pendapatan "+inputBioskop2+" lebih besar dari "+inputBioskop1);
					}
					else if (penghasilan1 == penghasilan2) {
						System.out.println("Pendapatan "+inputBioskop1+" sama dengan "+inputBioskop2);
					}
				}
			}while(menu < 1 && menu > 10 && !inputMenu.matches("[0-9]*"));
			
			System.out.println("");
			System.out.print("Mau menghitung yang lain | Y / T | ?");
			lanjutkan = key.nextLine();
		}while(lanjutkan.equals("Y"));
			
	}

	private static void tiketHarian(String inputMenu, int jumlahHari, ArrayList<Bioskop> listBioskop,
			ArrayList<Integer> listTiketHarian) {
		int jumlahTiket;
		for(int hari=1; hari <= jumlahHari; hari++) {
			jumlahTiket = 0;
			for(Bioskop hargaTiket : listBioskop) {
				jumlahTiket += hargaTiket.tiketHarian(hari);
			}
			if (inputMenu.equals("3"))
			System.out.println("Hari ke " +hari+ " Rp. "+jumlahTiket);
			listTiketHarian.add(jumlahTiket);
		}
	}

	private static void pendapatanHarian(String inputMenu, int jumlahHari, ArrayList<Bioskop> listBioskop,
			ArrayList<Double> listHarian) {
		double pendapatanHarian;
		for(int hari=1; hari <= jumlahHari; hari++) {
			pendapatanHarian = 0;
			for(Bioskop hargaTiket : listBioskop) {
				pendapatanHarian += hargaTiket.pendapatanHarian(hari);
			}
			if (inputMenu.equals("1")) 
			System.out.println("Hari ke " +hari+ " Rp. "+pendapatanHarian);
			listHarian.add(pendapatanHarian);
		}
	}

}
