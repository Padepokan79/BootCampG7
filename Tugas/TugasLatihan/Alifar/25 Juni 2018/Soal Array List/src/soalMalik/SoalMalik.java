package soalMalik;

import java.util.*;

/**
 * Created by : Alifhar Juliansyah
 * Jun 25, 2018
 * 8:50:18 AM
 */

public class SoalMalik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total, total2;
		HashMap<Integer, Integer> minggu=new HashMap<>();
		minggu.put(1, 0);
		minggu.put(2, 2);
		minggu.put(3, 1);
		minggu.put(4, -2);
		
		HashMap<String, Integer> hariFanta=new HashMap<String, Integer>();
		hariFanta.put("Senin", 3);
		hariFanta.put("Selasa", 15);
		hariFanta.put("Sabtu", 5);
		hariFanta.put("Minggu", 3);
				
		HashMap<String, Integer> hariTaro=new HashMap<String, Integer>();
		hariTaro.put("Senin", 10);
		hariTaro.put("Selasa", 20);
		hariTaro.put("Kamis", 18);
		hariTaro.put("Sabtu", 6);
		hariTaro.put("Minggu", 3);
		
		HashMap<String, Integer> hariShampoo=new HashMap<String, Integer>();
		hariShampoo.put("Rabu", 3);
		hariShampoo.put("Sabtu", 12);
		
		HashMap<String, Integer> hariTissue=new HashMap<String, Integer>();
		hariTissue.put("Selasa", 3);
		hariTissue.put("Sabtu", 10);
		
		HashMap<String, Integer> hariIce=new HashMap<String, Integer>();
		hariIce.put("Selasa", 12);
		hariIce.put("Kamis", 2);
		hariIce.put("Sabtu", 15);
		hariIce.put("Minggu", 2);
		
		Object fanta=new Object("Fanta", 7000, hariFanta);
		Object taro=new Object("Taro", 3000, hariTaro);
		Object shampoo=new Object("Shampoo Clear", 12000, hariShampoo);
		Object tissue=new Object("Tissue", 2000, hariTissue);
		Object ice=new Object("Ice Creadm Magnum", 10000, hariIce);
		
		ArrayList<Object> listObject=new ArrayList<Object>(Arrays.asList(fanta, taro, shampoo, tissue, ice));		
		Object tempObj;
		
//		for(int totalminggu=1; totalminggu<=4; totalminggu++) {
//			total=0;
//			for(Object list: listObject) {
//				total+=list.hitung(minggu.get(totalminggu));
//			}
//			System.out.println("Penghasilan minggu ke-"+totalminggu+" adalah "+total);
//		}

		total=0;
		for(Object list: listObject) {
			total+=list.hitung(minggu.get(3));
		}
		System.out.println("Penghasilan minggu ke-3 adalah "+total);

		total2=0;
		for(Object list: listObject) {
			total2+=list.hitung(minggu.get(4));
		}
		System.out.println("Selisih penghasilan minggu ketiga dan keempat adalah "+(total-total2));

		tempObj=listObject.get(0);
		for(int index=1; index<listObject.size(); index++)
			if(listObject.get(index).getTotalItem(minggu.get(1))>tempObj.getTotalItem(minggu.get(1)))
				tempObj=listObject.get(index);
		total2=0;
		for(int totalminggu=1; totalminggu<=4; totalminggu++) 
			total2+=tempObj.getTotalItem(minggu.get(totalminggu));
		System.out.println("Item yang paling banyak terjual selama sebulan adalah "+tempObj.getNama()+" dengan total "+total2);

	}

}
