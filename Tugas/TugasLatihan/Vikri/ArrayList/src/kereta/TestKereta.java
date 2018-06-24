/*
  Created By Vikri
  21/06/2018
  10:00
*/

package kereta;

import java.util.ArrayList;

public class TestKereta {
	public static void main(String[] args) {
		int total = 0, hari1 = 0, hari2 = 0, hari3 = 0, hari4 = 0, hari5 = 0, hari6 = 0, hari7 = 0;
		Kereta krt = new Kereta("Ekonomi" ,18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta krt2 = new Kereta("Bisni" ,35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta krt3 = new Kereta("Eksekutif" ,80000, 40, 21, 11, 16, 12, 35, 40);
		
		ArrayList<Kereta> ar = new ArrayList<Kereta>();
		ar.add(krt);
		ar.add(krt2);
		ar.add(krt3);
		
		for(Kereta train2:ar) {
			hari1 += train2.getHari1()*train2.getTiket();
			hari2 += train2.getHari2()*train2.getTiket();
			hari3 += train2.getHari3()*train2.getTiket();
			hari4 += train2.getHari4()*train2.getTiket();
			hari5 += train2.getHari5()*train2.getTiket();
			hari6 += train2.getHari6()*train2.getTiket();
			hari7 += train2.getHari7()*train2.getTiket();
		}
		
		System.out.println("Hari ke 1: "+hari1);
		System.out.println("Hari ke 2: "+hari2);
		System.out.println("Hari ke 3: "+hari3);
		System.out.println("Hari ke 4: "+hari4);
		System.out.println("Hari ke 5: "+hari5);
		System.out.println("Hari ke 6: "+hari6);
		System.out.println("Hari ke 7: "+hari7);
		
		for(Kereta train : ar) {
			System.out.println(train.toString());
			total += train.getJumlah();
		}
		
		System.out.println("\nTotal Penjualan: "+total);
	}
}
