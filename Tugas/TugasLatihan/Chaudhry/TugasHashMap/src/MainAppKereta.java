import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * DATE CREATED : 25 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

public class MainAppKereta {

	public static void main(String[] args) {
		int senin, selasa, rabu, kamis, jumat, sabtu, minggu, income;
		senin = selasa = rabu = kamis = jumat = sabtu = minggu = income = 0;
		
		Kereta krtEko = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta krtBis = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta krtEks = new Kereta("Eksekutif", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		Map<Integer, Kereta> listKrt = new LinkedHashMap<Integer, Kereta>();
		listKrt.put(1, krtEko);
		listKrt.put(2, krtBis);
		listKrt.put(3, krtEks);
		
		Map<Integer, String> namaHari = new LinkedHashMap<Integer, String>();
		namaHari.put(7, "minggu");
		namaHari.put(2, "selasa");
		namaHari.put(3, "rabu");
		namaHari.put(4, "kamis");
		namaHari.put(5, "jumat");
		namaHari.put(6, "sabtu");
		namaHari.put(1, "senin");
		
		HashMap<Integer, Integer> listIncome = new HashMap<Integer, Integer>();
		for (Map.Entry<Integer, Kereta> data : listKrt.entrySet()) {
			Kereta krt = data.getValue();
			senin 	+= krt.getHargaTiket()*krt.jmlPenumpangSatu;
			selasa 	+= krt.getHargaTiket()*krt.jmlPenumpangDua;
			rabu 	+= krt.getHargaTiket()*krt.jmlPenumpangTiga;
			kamis 	+= krt.getHargaTiket()*krt.jmlPenumpangEmpat;
			jumat 	+= krt.getHargaTiket()*krt.jmlPenumpangLima;
			sabtu 	+= krt.getHargaTiket()*krt.jmlPenumpangEnam;
			minggu 	+= krt.getHargaTiket()*krt.jmlPenumpangTujuh;
		}
		listIncome.put(1, senin);
		listIncome.put(2, selasa);
		listIncome.put(3, rabu);
		listIncome.put(4, kamis);
		listIncome.put(5, jumat);
		listIncome.put(6, sabtu);
		listIncome.put(7, minggu);
		
		System.out.println("PT. KERETA API");
		System.out.println("BANDUNG - BEKASI");
		System.out.println("===========================================");
		for(int index = 1; index <= namaHari.size(); index++) {
			System.out.println("Penghasilan pada hari "+namaHari.get(index)+" : Rp."+listIncome.get(index));
			income += listIncome.get(index);
		}
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("Total Penghasilan selama 7 hari : Rp."+income);
	}
}
