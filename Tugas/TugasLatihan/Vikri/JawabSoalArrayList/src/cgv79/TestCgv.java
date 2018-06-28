// Created By vikri
// 22/06/2018
// 10:25

package cgv79;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCgv {
	public static void main(String[] args) {
		int menu, seminggu = 0;
		
		Cgv cgv = new Cgv("Regular", 45000, 55000, 120, 84, 50, 90, 67, 78,34,96);
		Cgv cgv2 = new Cgv("Starium", 50000, 60000, 150, 85, 50, 90, 67, 78,34,96);
		Cgv cgv3 = new Cgv("SweetBox", 55000, 70000, 40, 35, 32, 25, 39, 35, 40, 40);
		Cgv cgv4 = new Cgv("Velvet", 90000, 125000, 30, 25, 15, 20, 30, 26, 30, 30);
	
		ArrayList<Cgv> al = new ArrayList<Cgv>();
		ArrayList<Integer> temporary = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		al.add(cgv);
		al.add(cgv2);
		al.add(cgv3);
		al.add(cgv4);
		
		System.out.print("Masukan Menu: ");
		menu = scan.nextInt();
		
		if(menu == 1) {
			for(Cgv a:al) {
				System.out.println(a.getKelas());
				System.out.println("  - "+a.hari[0]+" \t:"+a.getHari1()*a.getWeekdays());
				System.out.println("  - "+a.hari[1]+" \t:"+a.getHari2()*a.getWeekdays());
				System.out.println("  - "+a.hari[2]+" \t:"+a.getHari3()*a.getWeekdays());
				System.out.println("  - "+a.hari[3]+" \t:"+a.getHari4()*a.getWeekdays());
				System.out.println("  - "+a.hari[4]+" \t:"+a.getHari5()*a.getWeekdays());
				System.out.println("  - "+a.hari[5]+" \t:"+a.getHari6()*a.getWeekend());
				System.out.println("  - "+a.hari[6]+" \t:"+a.getHari7()*a.getWeekend());
			}
		} else if(menu == 2) {
			for(Cgv a:al) {
				int temp = 0;
				temp += a.getHari1()*a.getWeekdays();
				temp += a.getHari2()*a.getWeekdays();
				temp += a.getHari3()*a.getWeekdays();
				temp += a.getHari4()*a.getWeekdays();
				temp += a.getHari5()*a.getWeekdays();
				temp += a.getHari6()*a.getWeekend();
				temp += a.getHari7()*a.getWeekend();
				seminggu += temp;
				System.out.println(a.getKelas()+" \t: "+temp);
			}
			System.out.println("Total Penjualan Seminggu : "+seminggu);
		} else if(menu == 3) {
			for(Cgv a:al) {
				System.out.println(a.getKelas());
				System.out.println("  - "+a.hari[0]+" \t:"+a.getHari1());
				System.out.println("  - "+a.hari[1]+" \t:"+a.getHari2());
				System.out.println("  - "+a.hari[2]+" \t:"+a.getHari3());
				System.out.println("  - "+a.hari[3]+" \t:"+a.getHari4());
				System.out.println("  - "+a.hari[4]+" \t:"+a.getHari5());
				System.out.println("  - "+a.hari[5]+" \t:"+a.getHari6());
				System.out.println("  - "+a.hari[6]+" \t:"+a.getHari7());
			}
		} else if(menu == 4) {
			for(Cgv a:al) {
				int temp = 0;
				temp += a.getHari1();
				temp += a.getHari2();
				temp += a.getHari3();
				temp += a.getHari4();
				temp += a.getHari5();
				temp += a.getHari6();
				temp += a.getHari7();
				seminggu += temp;
				System.out.println(a.getKelas()+" : "+temp);
			}
			System.out.println("Total Penjualan Seminggu : "+seminggu);
		} else if(menu == 5) {
			String tanya, tanya2;
			
			System.out.print("Masukan tiket pertama: ");
			tanya = scan.next();
			
			System.out.print("Masukan tiket kedua: ");
			tanya2 = scan.next();
		
			for(Cgv cek:al) {
				if(tanya.equals(cek.getKelas())) {
					int temp = 0;
					temp += cek.getHari1()*cek.getWeekdays();
					temp += cek.getHari2()*cek.getWeekdays();
					temp += cek.getHari3()*cek.getWeekdays();
					temp += cek.getHari4()*cek.getWeekdays();
					temp += cek.getHari5()*cek.getWeekdays();
					temp += cek.getHari6()*cek.getWeekend();
					temp += cek.getHari7()*cek.getWeekend();
					seminggu += temp;
					
					System.out.println("Total Penjualan tiket "+cek.getKelas()+" Seminggu : "+temp);
				}
				if(tanya2.equals(cek.getKelas())) {
					int temp = 0;
					temp += cek.getHari1()*cek.getWeekdays();
					temp += cek.getHari2()*cek.getWeekdays();
					temp += cek.getHari3()*cek.getWeekdays();
					temp += cek.getHari4()*cek.getWeekdays();
					temp += cek.getHari5()*cek.getWeekdays();
					temp += cek.getHari6()*cek.getWeekend();
					temp += cek.getHari7()*cek.getWeekend();
					seminggu += temp;
					
					System.out.println("Total Penjualan tiket "+cek.getKelas()+" Seminggu : "+temp);
				}
			}
		}
	}
}
