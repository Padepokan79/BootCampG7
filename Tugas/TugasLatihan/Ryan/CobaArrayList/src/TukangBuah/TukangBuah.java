package TukangBuah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TukangBuah {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int menu, temp=0, cek=0;
		String hari, pilihan1,pilihan2;
		Buah semangka = new Buah("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah pisang = new Buah("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		Buah mangga = new Buah("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);
		
		ArrayList<String> namaHari = new ArrayList<>(Arrays.asList("Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"));
		ArrayList<Buah> buah = new ArrayList<Buah>();
		buah.add(semangka);
		buah.add(pisang);
		buah.add(mangga);
		
		ArrayList<Integer> penghasilan = new ArrayList<Integer>();
		for (int i = 0; i < namaHari.size(); i++) {
			temp = 0;
			for (Buah buah2 : buah) {
				temp = temp + buah2.terjual.get(i)*buah2.getHargaBuah();
			}
			penghasilan.add(temp);
		}
		for (Integer integer : penghasilan) {
			System.out.println(integer);
		}
		
		System.out.println("\t\tPEDAGANG BUAH\t\t");
		System.out.println("1. Penghasilan Perhari");
		System.out.println("2. Penghasilan Perminggu");
		System.out.println("3. Penghasilan Sebulan");
		System.out.println("4. Penghasilan Terkecil");
		System.out.println("5. Penghasilan Terbesar");
		System.out.println("6. Perbandingan Penghasilan");
		System.out.println("7. Buah yang paling banyak terjual selama seminggu");
		System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu");
		System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu");
		System.out.println("10.Hitung Penghasilan Laba penjual selama sebulan");
		System.out.println();
		System.out.print("Masukan Menu yang diiginkan 1 s.d 10 : ");
		menu = key.nextInt();
		
		System.out.println("--------------------------------------------");
		if (menu == 1) {
			System.out.print("Masukan nama hari : ");
			hari = key.next();
			for (Buah totalHari : buah) {
				temp = totalHari.penghasilanHarian(hari);
			}
			System.out.println(temp);
			System.out.println("Penghasilan hari "+hari+" adalah Rp."+ penghasilan.get(temp));
		}
		else if (menu == 2) {
			temp = 0;
			for (Buah buah2 : buah) {
				System.out.println("Penghasilan buah "+buah2.getNamaBuah()+" Rp."+buah2.penghasilanMingguan());
				temp = temp + buah2.penghasilanMingguan();
			}
			System.out.println("Penghasilan mingguan Rp."+temp);
		}
		else if(menu == 3) {
			temp = 0;
			for (Buah buah2 : buah) {
				temp = temp + buah2.penghasilanMingguan()*4;
			}
			System.out.println("Penghasilan perbulan Rp."+temp);
		}
		else if (menu == 4) {
			temp = penghasilan.get(0);
			for(int i = 0 ; i < penghasilan.size() ; i++){
				if (penghasilan.get(i) > temp) {
					temp = penghasilan.get(i);
					cek = i;
				}
			}
			System.out.println("Terbesar dalam minggu ini hari "+namaHari.get(cek)+" Rp."+temp);
		}
		else if (menu == 5) {
			temp = penghasilan.get(0);
			for(int i = 0 ; i < penghasilan.size() ; i++){
				if (penghasilan.get(i) < temp) {
					temp = penghasilan.get(i);
					cek = i;
				}
			}
			System.out.println("Terkecil dalam minggu ini hari "+namaHari.get(cek)+" Rp."+temp);
		}
		else if (menu == 6) {
			System.out.print("Masukan Hari pertama : ");
			pilihan1 = key.next();
			System.out.print("Masukan Hari kedua : ");
			pilihan2 = key.next();
		}
		else if (menu == 7) {
			for (Buah buah1 : buah) {
				
			}
		}
		else if (menu == 8) {
//			mangga.terjual
		}
		else if (menu == 9) {
			
		}
		else if (menu == 10) {
			
		}
		
	}

}
