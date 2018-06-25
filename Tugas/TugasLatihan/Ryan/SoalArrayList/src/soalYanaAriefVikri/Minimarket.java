package soalYanaAriefVikri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *SoalArrayList
 * Minimarket.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 14.54.38 22 Jun 2018
 */
public class Minimarket {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int pilih, total;
		String hari, pilihan;
		
		Object roti = new Object("Sari Roti Cheese", 4500, "Senin" );
		Object coklat = new Object("Silver Queen", 11200, "Senin" , "Selasa", "Rabu", "Sabtu");
		Object sabun = new Object("Lifebouy Lemonfresh", 6500, "Senin" , "Selasa");
		Object tisu = new Object("Paseo 200 pl", 11500, "Senin" , "Rabu", "Sabtu");
		Object susu = new Object("Ultramilk Coklat", 4500, "Selasa" , "Kamis", "Jumat", "Minggu");
		Object oat = new Object("Quecker oats", 9500, "Selasa" , "Kamis", "Jumat");
		Object minuman = new Object("Mogu mogu", 7800, "Rabu" );
		Object susu2 = new Object("Bear Brand", 8500, "Kamis" );
		Object teh = new Object("Teh kotak", 11200, "Jumat" );
		Object coklat2 = new Object("Cadbury", 12500, "Sabtu" );
		Object air = new Object("Aqua", 2500, "Sabtu" );
		Object minuman2 = new Object("Floridina", 3200, "Minggu" );
		Object snack = new Object("Tic tac", 9500, "Minggu" );
		
		ArrayList<Object> listBarang = new ArrayList<Object>(Arrays.asList(roti,coklat,sabun,tisu,susu,oat,minuman,susu2,teh,coklat2,air,minuman2,snack));
		
		System.out.println("==================================");
		System.out.println("             MINIMARKET           ");
		System.out.println("==================================");
		System.out.println("\nMenu : ");
		System.out.println("1. Penghasilan setiap hari\r\n" + 
				"2. Penghasilan seminggu\r\n" + 
				"3. Penghasilan sebulan\n");
		System.out.print("Masukan Pilihan Anda : ");
		pilih = key.nextInt();
		do {
			if (pilih == 1) {
				total = 0;
				System.out.print("Masukan nama hari : ");
				hari = key.next();
				for (Object list : listBarang) {
					for (String nama : list.hari) {
						if (hari.equalsIgnoreCase(nama)) {
							total = total + list.getHarga();
						}
					}
				}
				System.out.println("Total Hari "+hari+" Rp."+total);
			}
			else if (pilih == 2) {
				total = 0;
				for (Object list : listBarang) {
					for (int i = 0; i < list.hari.size(); i++) {
						total = total + list.getHarga();
					}
				}
				System.out.println("Total Seminggu Rp."+total);
			}
			else if (pilih == 3) {
				total = 0;
				for (Object list : listBarang) {
					for (int i = 0; i < list.hari.size(); i++) {
						total = total + list.getHarga();
					}
				}
				System.out.println("Total Seminggu Rp."+total*4);
			}
			System.out.print("Pilih menu lagi? (ya/tidak)");
			pilihan = key.next();
		}while(pilihan.equalsIgnoreCase("ya"));
		
	}

}
