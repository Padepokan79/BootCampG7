package kereta;

import java.util.*;

public class KeretaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0, totalPerhari=0;
		int banyakHari=7;
		
		KeretaApi train01=new KeretaApi(18000, 120, 100, 50, 30, 20, 150, 110);
		KeretaApi train02=new KeretaApi(35000, 50, 15, 13, 10, 20, 55, 60);
		KeretaApi train03=new KeretaApi(80000, 40, 21, 11, 16, 12, 35, 40);
		
		HashMap<String, KeretaApi> kereta=new HashMap<String, KeretaApi>();
		kereta.put("Ekonomi", train01);
		kereta.put("Bisnis", train02);
		kereta.put("Eksekutif", train03);
		
		for(int hari=1; hari<=banyakHari; hari++) {
			totalPerhari=0;
			for(Map.Entry<String, KeretaApi> obj:kereta.entrySet()) {
				KeretaApi ob = obj.getValue();
				totalPerhari+=ob.pemasukan(hari);
			}
			System.out.println("Total Pemasukan hari ke-"+hari+" "+totalPerhari);
		}
		
		System.out.println();
		for(Map.Entry<String, KeretaApi> obj:kereta.entrySet()) {
			KeretaApi ob = obj.getValue();
			System.out.println("Pemasukan Kereta "+obj.getKey()+" adalah sebesar "+ob.pemasukan());
			total+=ob.pemasukan();
		}
		
		System.out.println("\nTotal Pemasukan "+total);
	
	}

}
