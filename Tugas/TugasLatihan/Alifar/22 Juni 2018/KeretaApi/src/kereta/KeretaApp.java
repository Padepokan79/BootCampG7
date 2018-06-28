package kereta;

import java.util.*;

public class KeretaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0, totalPerhari=0;
		int banyakHari=7;
		
		KeretaApi train01=new KeretaApi("ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		KeretaApi train02=new KeretaApi("bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		KeretaApi train03=new KeretaApi("eksekutif", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		ArrayList<KeretaApi> kereta=new ArrayList<KeretaApi>();
		kereta.add(train01);
		kereta.add(train02);
		kereta.add(train03);
		
		for(int hari=1; hari<=banyakHari; hari++) {
			totalPerhari=0;
			for(KeretaApi obj:kereta)
				totalPerhari+=obj.pemasukan(hari);
			System.out.println("Total Pemasukan hari ke-"+hari+" "+totalPerhari);
		}
		
		System.out.println();
		for(KeretaApi obj:kereta) {
			System.out.println("Pemasukan Kereta "+obj.getGerbong()+" adalah sebesar "+obj.pemasukan());
			total+=obj.pemasukan();
		}
		
		System.out.println("\nTotal Pemasukan "+total);
	
	}

}
