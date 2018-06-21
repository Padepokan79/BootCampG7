package LatihanKeretaArrayList;

import java.util.ArrayList;

import bootcamp.Person;

public class APPKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0, totalPemasukan=0;
		
		Kereta ekonomi = new Kereta(18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis = new Kereta(35000, 50, 12, 13, 10, 20, 55, 60);
		Kereta eksekutif = new Kereta(80000, 40, 21, 11, 16, 12, 35, 40);
		
		ArrayList<Kereta> train = new ArrayList<Kereta>();
		train.add(ekonomi);
		train.add(bisnis);
		train.add(eksekutif);
		
		
		for (int hari=1; hari<8; hari++) {
			totalPemasukan=0;
			for (Kereta printKereta : train) {
				totalPemasukan=printKereta.pendapatanPerhari(hari);
			}
			System.out.println("Penjualan tiket hari ke-"+hari+"Total : "+totalPemasukan);
		}
		System.out.println();
		
		for (Kereta printKereta : train) {
			System.out.println("Total : "+printKereta.getHargaTotal());
			total+=printKereta.getHargaTotal();
		}
		System.out.println();
		System.out.println("Total keseluruhan : "+total);
		
		

	}
}
