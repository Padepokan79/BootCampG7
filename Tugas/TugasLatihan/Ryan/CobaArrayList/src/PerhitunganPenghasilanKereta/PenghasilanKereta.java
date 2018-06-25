package PerhitunganPenghasilanKereta;

import java.util.ArrayList;
import java.util.Iterator;

public class PenghasilanKereta {

	public static void main(String[] args) {
		Kereta ekonomi = new Kereta(120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis = new Kereta(50, 15, 13, 10, 20, 55, 60);
		Kereta eksekutif = new Kereta(40, 21, 11, 16, 12, 35, 40);
		
		ArrayList<Kereta> penumpang = new ArrayList<Kereta>();
		penumpang.add(ekonomi);
		penumpang.add(bisnis);
		penumpang.add(eksekutif);
		
		int totalPerbulan = 0;
		for (int i = 1; i < 8; i++) {
			int totalPerHari=0;
			int a=0;
			for (Kereta kereta : penumpang) {
				totalPerHari = totalPerHari + kereta.getHargaPerHari(i,a);
				a++;
			}
			System.out.println("Hari ke "+i+" "+totalPerHari);
			totalPerbulan = totalPerbulan+totalPerHari;
		}
		System.out.println("----------------------");
		System.out.println("Total perbulan : "+totalPerbulan);

	}

}
