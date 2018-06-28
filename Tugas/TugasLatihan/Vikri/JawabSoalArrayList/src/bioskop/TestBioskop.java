// Created By Vikri
// 22/06/2018

package bioskop;

import java.util.ArrayList;
import java.util.Scanner;

import cgv79.Cgv;

public class TestBioskop {
	public static void main(String[] args) {
		int menu;
		Bioskop regular = new Bioskop("Regular", 35000, 80, 50, 50, 75, 20, 100, 100);
		Bioskop vip = new Bioskop("Vip", 50000, 30, 20, 20, 23, 50, 60, 60);
		Bioskop vvip = new Bioskop("Regular", 35000, 80, 50, 50, 75, 20, 100, 100);
		ArrayList<Bioskop> al = new ArrayList<Bioskop>();
		
		al.add(regular);
		al.add(vip);
		al.add(vvip);
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Masukan Menu: ");
		menu = scan.nextInt();
		
		if(menu == 1) {
			for(Bioskop a:al) {
				System.out.println(a.getKelas());
				System.out.println("  - "+a.hari[0]+" \t:"+a.getHari1()*a.getHarga());
				System.out.println("  - "+a.hari[1]+" \t:"+a.getHari2()*a.getHarga());
				System.out.println("  - "+a.hari[2]+" \t:"+a.getHari3()*a.getHarga());
				System.out.println("  - "+a.hari[3]+" \t:"+a.getHari4()*a.getHarga());
				System.out.println("  - "+a.hari[4]+" \t:"+a.getHari5()*a.getHarga());
				System.out.println("  - "+a.hari[5]+" \t:"+a.getHari6()*a.getHarga());
				System.out.println("  - "+a.hari[6]+" \t:"+a.getHari7()*a.getHarga());
			}
		}
	}
}
