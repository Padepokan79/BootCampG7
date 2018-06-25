/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-21
 * 
 * */

package ArrayListKereta;

import java.util.*;

public class KeretaApp {

	public static void main(String[] args) {
		int penghasilanHari1 = 0, penghasilanHari2 = 0, penghasilanHari3 = 0, penghasilanHari4 = 0,
				penghasilanHari5 = 0, penghasilanHari6 = 0, penghasilanHari7 = 0;
		
		Kereta kereta = new Kereta();
		ArrayList<Kereta> arr = new ArrayList<Kereta>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		Kereta eko = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta bis = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta exc = new Kereta("Executive", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		arr.add(eko);
		arr.add(bis);
		arr.add(exc);
		
		for(Kereta kar : arr) {
			penghasilanHari1 += kar.getHarga()*kar.hariKe1;
			penghasilanHari2 += kar.getHarga()*kar.hariKe2;
			penghasilanHari3 += kar.getHarga()*kar.hariKe3;
			penghasilanHari4 += kar.getHarga()*kar.hariKe4;
			penghasilanHari5 += kar.getHarga()*kar.hariKe5;
			penghasilanHari6 += kar.getHarga()*kar.hariKe6;
			penghasilanHari7 += kar.getHarga()*kar.hariKe7;
		}
		System.out.println("Penghasilan hari 1 : "+penghasilanHari1);
		System.out.println("Penghasilan hari 2 : "+penghasilanHari2);
		System.out.println("Penghasilan hari 3 : "+penghasilanHari3);
		System.out.println("Penghasilan hari 4 : "+penghasilanHari4);
		System.out.println("Penghasilan hari 5 : "+penghasilanHari5);
		System.out.println("Penghasilan hari 6 : "+penghasilanHari6);
		System.out.println("Penghasilan hari 7 : "+penghasilanHari7);
		
		
		System.out.println();
		System.out.println("Penghasilan 7 hari : "+(penghasilanHari1+penghasilanHari2+penghasilanHari3+penghasilanHari4+penghasilanHari5+penghasilanHari6+penghasilanHari7));
		
		
		
		
		
		
		
	}

}
