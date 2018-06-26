package Kereta;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index;
		int tempPenghasilan1 =0, tempPenghasilan2=0, tempPenghasilan3=0, tempPenghasilan4=0, tempPenghasilan5=0, tempPenghasilan6=0, tempPenghasilan7=0, penghasilanSeminggu = 0;
		int penghasilanHari1 =0, penghasilanHari2=0, penghasilanHari3=0, penghasilanHari4=0, penghasilanHari5=0, penghasilanHari6=0, penghasilanHari7=0;
		
		Kereta ekonomi = new Kereta("ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis = new Kereta("bisnis",35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta executive = new Kereta("executive",80000, 40, 21, 11, 16, 12, 35, 40);
	
		HashMap<Integer, Kereta> listKereta = new HashMap<>();
		listKereta.put(1, ekonomi);
		listKereta.put(2, bisnis);
		listKereta.put(3, executive);
		
		HashMap<Integer, Integer> penghasilanHarian = new HashMap<>();
		HashMap<Integer, String> namaHari = new HashMap<>();
		namaHari.put(1, "senin");
		namaHari.put(2, "selasa");
		namaHari.put(3, "rabu");
		namaHari.put(4, "kamis");
		namaHari.put(5, "jumat");
		namaHari.put(6, "sabtu");
		namaHari.put(7, "minggu");
		
		index =1;
		for(Map.Entry<Integer, Kereta> entry : listKereta.entrySet()) {
			
			Kereta k = entry.getValue();
			
			tempPenghasilan1 = k.getHargaTicket() * k.hari1;
			penghasilanHari1 += tempPenghasilan1;
			tempPenghasilan2 = k.getHargaTicket() * k.hari2;
			penghasilanHari2 += tempPenghasilan2;
			tempPenghasilan3 = k.getHargaTicket() * k.hari3;
			penghasilanHari3 += tempPenghasilan3;
			tempPenghasilan4 = k.getHargaTicket() * k.hari4;
			penghasilanHari4 += tempPenghasilan4;
			tempPenghasilan5 = k.getHargaTicket() * k.hari5;
			penghasilanHari5 += tempPenghasilan5;
			tempPenghasilan6 = k.getHargaTicket() * k.hari6;
			penghasilanHari6 += tempPenghasilan6;
			tempPenghasilan7 = k.getHargaTicket() * k.hari7;
			penghasilanHari7 += tempPenghasilan7;
			
			if(index==listKereta.size())
			{
				penghasilanHarian.put(1, penghasilanHari1);
				penghasilanHarian.put(2, penghasilanHari2);
				penghasilanHarian.put(3, penghasilanHari3);
				penghasilanHarian.put(4, penghasilanHari4);
				penghasilanHarian.put(5, penghasilanHari5);
				penghasilanHarian.put(6, penghasilanHari6);
				penghasilanHarian.put(7, penghasilanHari7);
			}
			index++;
		}
		//print for biasa
		for(index=1; index <= penghasilanHarian.size();index++) {
			 
			System.out.println("Penghasilan hari " + namaHari.get(index) + " sebesar Rp." + penghasilanHarian.get(index));
			penghasilanSeminggu += penghasilanHarian.get(index);
		}
		System.out.println();
		//print for each
		index=1;
		for(Map.Entry<Integer, Integer> entry : penghasilanHarian.entrySet()) {
			Integer i = entry.getValue();
			System.out.println("Penghasilan hari " + namaHari.get(index) + " sebesar Rp." + penghasilanHarian.get(index));
		index++;
		}
		System.out.println("Penghasilan mingguan : " + penghasilanSeminggu);
	}

}
