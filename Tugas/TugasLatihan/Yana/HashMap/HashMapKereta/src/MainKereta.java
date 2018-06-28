import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kereta	ekonomi		= new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta	bisnis		= new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta	executive	= new Kereta("Executive", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		double 	totalPendapatanHari1 = 0,
				totalPendapatanHari2 = 0,
				totalPendapatanHari3 = 0,
				totalPendapatanHari4 = 0,
				totalPendapatanHari5 = 0,
				totalPendapatanHari6 = 0,
				totalPendapatanHari7 = 0,
				totalPendapatanSemua = 0;
		int		idx = 0;
		
		HashMap<String, Kereta> listKereta = new HashMap<String, Kereta>();
		listKereta.put("E202", ekonomi);
		listKereta.put("B042", bisnis);
		listKereta.put("E005", executive);
		
		//Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
		Map<String, Kereta> mapListKereta = new TreeMap<String, Kereta>(listKereta);
		
		for(Map.Entry hmkereta : listKereta.entrySet()) {
			Kereta oKereta = (Kereta) hmkereta.getValue();
			System.out.println(hmkereta.getKey()+ " : "+oKereta.getKelas());
		}
		System.out.println();
		for(Map.Entry hmkereta : mapListKereta.entrySet()) {
			Kereta oKereta = (Kereta) hmkereta.getValue();
			System.out.println(hmkereta.getKey()+ " : "+oKereta.getKelas());
		}
		
		HashMap<String, Double> listPendapatanEkonomi = new HashMap<String, Double>();
		HashMap<String, Double> listPendapatanBisnis = new HashMap<String, Double>();
		HashMap<String, Double> listPendapatanExecutive = new HashMap<String, Double>();
		HashMap<String, Double> listPendapatanHarian = new HashMap<String, Double>();
		
		for(Map.Entry kereta : listKereta.entrySet()) {
			Kereta obKereta = (Kereta) kereta.getValue();
			double pendapatanHari1 	= obKereta.getHarga() * obKereta.getHari1();
			double pendapatanHari2	= obKereta.getHarga() * obKereta.getHari2();
			double pendapatanHari3	= obKereta.getHarga() * obKereta.getHari3();
			double pendapatanHari4	= obKereta.getHarga() * obKereta.getHari4();
			double pendapatanHari5	= obKereta.getHarga() * obKereta.getHari5();
			double pendapatanHari6	= obKereta.getHarga() * obKereta.getHari6();
			double pendapatanHari7	= obKereta.getHarga() * obKereta.getHari7();
			double totalPendapatan	= pendapatanHari1 + pendapatanHari2 + pendapatanHari3 + pendapatanHari4 + pendapatanHari5 + pendapatanHari6 + pendapatanHari7;
			totalPendapatanHari1 	= totalPendapatanHari1 + pendapatanHari1;
			if (idx == 2) {
				listPendapatanEkonomi.put("Senin", pendapatanHari1);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Senin", pendapatanHari1);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Senin", pendapatanHari1);
			}
			listPendapatanHarian.put("Senin", totalPendapatanHari1);
			totalPendapatanHari2 	= totalPendapatanHari2 + pendapatanHari2;
			if (idx == 2) {
				listPendapatanEkonomi.put("Selasa", pendapatanHari2);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Selasa", pendapatanHari2);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Selasa", pendapatanHari2);
			}
			listPendapatanHarian.put("Selasa", totalPendapatanHari2);
			totalPendapatanHari3 	= totalPendapatanHari3 + pendapatanHari3;
			if (idx == 2) {
				listPendapatanEkonomi.put("Rabu", pendapatanHari3);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Rabu", pendapatanHari3);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Rabu", pendapatanHari3);
			}
			listPendapatanHarian.put("Rabu", totalPendapatanHari3);
			totalPendapatanHari4 	= totalPendapatanHari4 + pendapatanHari4;
			if (idx == 2) {
				listPendapatanEkonomi.put("Kamis", pendapatanHari4);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Kamis", pendapatanHari4);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Kamis", pendapatanHari4);
			}
			listPendapatanHarian.put("Kamis", totalPendapatanHari4);
			totalPendapatanHari5 	= totalPendapatanHari5 + pendapatanHari5;
			if (idx == 2) {
				listPendapatanEkonomi.put("Jumat", pendapatanHari5);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Jumat", pendapatanHari5);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Jumat", pendapatanHari5);
			}
			listPendapatanHarian.put("Jumat", totalPendapatanHari5);
			totalPendapatanHari6 	= totalPendapatanHari6 + pendapatanHari6;
			if (idx == 2) {
				listPendapatanEkonomi.put("Sabtu", pendapatanHari6);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Sabtu", pendapatanHari6);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Sabtu", pendapatanHari6);
			}
			listPendapatanHarian.put("Sabtu", totalPendapatanHari6);
			totalPendapatanHari7 	= totalPendapatanHari7 + pendapatanHari7;
			if (idx == 2) {
				listPendapatanEkonomi.put("Minggu", pendapatanHari7);
			}
			else if (idx == 1) {
				listPendapatanBisnis.put("Minggu", pendapatanHari7);
			}
			else if (idx == 0) {
				listPendapatanExecutive.put("Minggu", pendapatanHari7);
			}
			listPendapatanHarian.put("Minggu", totalPendapatanHari7);
			totalPendapatanSemua	= totalPendapatanHari1 + totalPendapatanHari2 + totalPendapatanHari3 + totalPendapatanHari4 + totalPendapatanHari5 + totalPendapatanHari6 + totalPendapatanHari7;
			/*System.out.println(
					"\nKelas Kereta      : "+obKereta.getKelas()+ 
					"\nHarga Tiket       : "+obKereta.getHarga()+ 
					"\nPenumpang Hari-1  : "+obKereta.getHari1()+ 
					"\nPendapatan Hari-1 : "+pendapatanHari1+ 
					"\nPendapatan Hari-2 : "+pendapatanHari2+ 
					"\nPendapatan Hari-3 : "+pendapatanHari3+ 
					"\nPendapatan Hari-4 : "+pendapatanHari4+ 
					"\nPendapatan Hari-5 : "+pendapatanHari5+ 
					"\nPendapatan Hari-6 : "+pendapatanHari6+ 
					"\nPendapatan Hari-7 : "+pendapatanHari7+ 
					"\nTOTAL PENDAPATAN  : "+String.format("%.0f", totalPendapatan));*/

			idx++;
		}

		System.out.println();
		System.out.println("Pendapatan Kelas EKONOMI");
		for(Map.Entry listEkonomi : listPendapatanEkonomi.entrySet()) {
			System.out.println(listEkonomi);
		}
		
		System.out.println();
		System.out.println("Pendapatan Kelas Bisnis");
		for(Map.Entry listBisnis : listPendapatanBisnis.entrySet()) {
			System.out.println(listBisnis);
		}
		
		System.out.println();
		System.out.println("Pendapatan Kelas EXECUTIVE");
		for(Map.Entry listExecutive : listPendapatanExecutive.entrySet()) {
			System.out.println(listExecutive);
		}
		
		System.out.println();
		System.out.println("PENDAPATAN HARIAN COLLECTIVE");
		for(Map.Entry listPendapatan : listPendapatanHarian.entrySet()) {
			System.out.println(listPendapatan);
		}
	}

}
