package KhairilRizaldiRicha;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hasilHarian1 = 0,hasilHarian2 = 0,hasilHarian3 = 0,hasilHarian4 = 0,hasilHarian5 = 0,hasilHarian6 = 0,hasilHarian7 = 0;
		int tiketTerjual1=0, tiketTerjual2=0, tiketTerjual3=0, tiketTerjual4=0, tiketTerjual5=0, tiketTerjual6=0, tiketTerjual7=0;
		int index=0, penghasilanMingguan=0, tiketMingguan=0, banding1=0, banding2=0, jenisTiketTerbanyak=0, jenisTiketTerkecil=0;
		int banyakTiket=0;
		String pilih="";
		
		Bioskop kelasReguler = new Bioskop("reguler", 35000, 80, 50, 50, 75, 20, 100, 100, 100);
		Bioskop kelasVip = new Bioskop("vip", 50000, 30, 20, 20, 23, 50, 60, 60 , 60);
		Bioskop kelasVvip = new Bioskop("vvip", 75000, 15, 30, 30, 30, 25, 40, 40, 40);
	
		ArrayList<String> namaHari = new ArrayList<>();
		namaHari.add("senin");
		namaHari.add("selasa");
		namaHari.add("rabu");
		namaHari.add("kamis");
		namaHari.add("jumat");
		namaHari.add("sabtu");
		namaHari.add("minggu");
		
		ArrayList<Bioskop> penjualanTiket = new ArrayList<>();
		penjualanTiket.add(kelasReguler);
		penjualanTiket.add(kelasVip);
		penjualanTiket.add(kelasVvip);
		
		ArrayList<Integer> penghasilanHarian = new ArrayList<>();
		ArrayList<Integer> banyakTiketTerjual = new ArrayList<>();
		ArrayList<Integer> banyakTiketBerdasarkanjenis = new ArrayList<>();
		ArrayList<Integer> maxTiket = new ArrayList<>();
		ArrayList<String> jenisTiket = new ArrayList<>();
		
		for (Bioskop bioskop : penjualanTiket) {
			hasilHarian1 += (bioskop.terjualHari1 * bioskop.getHargaTiket());
			tiketTerjual1 += bioskop.terjualHari1;
			hasilHarian2 += (bioskop.terjualHari2 * bioskop.getHargaTiket());
			tiketTerjual2 += bioskop.terjualHari2;
			hasilHarian3 += (bioskop.terjualHari3 * bioskop.getHargaTiket());
			tiketTerjual3 += bioskop.terjualHari3;
			hasilHarian4 += (bioskop.terjualHari4 * bioskop.getHargaTiket());
			tiketTerjual4 += bioskop.terjualHari4;
			hasilHarian5 += (bioskop.terjualHari5 * bioskop.getHargaTiket());
			tiketTerjual5 += bioskop.terjualHari5;
			hasilHarian6 += (bioskop.terjualHari6 * bioskop.getHargaTiket() + 10000);
			tiketTerjual6 += bioskop.terjualHari6;
			hasilHarian7 += (bioskop.terjualHari7 * bioskop.getHargaTiket() + 10000);
			tiketTerjual7 += bioskop.terjualHari7;
			banyakTiketBerdasarkanjenis.add(bioskop.terjualHari1 + bioskop.terjualHari2 + bioskop.terjualHari3 + bioskop.terjualHari4 + bioskop.terjualHari5 + bioskop.terjualHari6 + bioskop.terjualHari7);
			maxTiket.add(bioskop.maxTiket * 7);
			jenisTiket.add(bioskop.kelasTiket);
			index++;
			if(index==penjualanTiket.size()) {
				penghasilanHarian.add(hasilHarian1);
				penghasilanHarian.add(hasilHarian2);
				penghasilanHarian.add(hasilHarian3);
				penghasilanHarian.add(hasilHarian4);
				penghasilanHarian.add(hasilHarian5);
				penghasilanHarian.add(hasilHarian6);
				penghasilanHarian.add(hasilHarian7);
				
				banyakTiketTerjual.add(tiketTerjual1);
				banyakTiketTerjual.add(tiketTerjual2);
				banyakTiketTerjual.add(tiketTerjual3);
				banyakTiketTerjual.add(tiketTerjual4);
				banyakTiketTerjual.add(tiketTerjual5);
				banyakTiketTerjual.add(tiketTerjual6);
				banyakTiketTerjual.add(tiketTerjual7);
			}
			
			
		}
		do {
		System.out.println("=====================");
		System.out.println("	Bioskop 79");
		System.out.println("=====================");
		System.out.println("1.Total penjualan tiket perhari");
		System.out.println("2.Total penjualan tiket seminggu");
		System.out.println("3.Jenis tiket terbanyak dijual dalam sebulan");
		System.out.println("4.Jenis tiket tersedikit dijualn dalam sebulan");
		System.out.println("5.Rata-rata jumlah penjualan dari ketiga kelas masing-masing tiket perminggu");
		System.out.println("6.Presentai rasio penjualan setiap kelas");
		
		System.out.println("======================");
		Scanner key = new  Scanner(System.in);
		System.out.print("Masukan pilihan : ");
		pilih = key.nextLine();
		
		if(pilih.equals("1")) {
			//penghasilanharian
			index=0;
			System.out.println("penghasilan harian");
			for (Integer integer : penghasilanHarian) {
				System.out.println("Total penghasilan hari " + namaHari.get(index)+ " sebesar Rp." +integer);
				penghasilanMingguan += integer;
				index++;
			}
		}
		else if(pilih.equals("2")) {
			//penghasilanmingguan
			System.out.print("penghasilan mingguan sebesar Rp.");
			System.out.println(penghasilanMingguan);
		}
		else if(pilih.equals("3")) {
			index = 0;
			int index2 =0;
			jenisTiketTerbanyak = banyakTiketBerdasarkanjenis.get(0);
			for (Integer integer : banyakTiketBerdasarkanjenis) {
				if(jenisTiketTerbanyak < integer) {
				jenisTiketTerbanyak = integer;	
				index2 = index;
				}
			index++;
			}
			System.out.print("Jenis tiket paling banyak terjual " + jenisTiket.get(index2) + " sebanyak ");
			System.out.println(jenisTiketTerbanyak);
		}
		else if(pilih.equals("4")) {
			index = 0;
			int index2 =0;
			jenisTiketTerbanyak = banyakTiketBerdasarkanjenis.get(0);
			for (Integer integer : banyakTiketBerdasarkanjenis) {
				if(jenisTiketTerbanyak > integer) {
				jenisTiketTerkecil = integer;	
				index2=index;
				}
			index++;
			}
			System.out.print("Jenis tiket paling sedikit terjual " + jenisTiket.get(index2) + " sebanyak ");
			System.out.println(jenisTiketTerkecil);
		}
		else if(pilih.equals("5")) {
			System.out.println("rata-rata jumlah penjualan tiket perkelas selama sebulan");
			index = 0;
			for (Integer integer : banyakTiketBerdasarkanjenis) {
				double temp;
				temp = integer;
				System.out.println("Rata-rata ticket " +jenisTiket.get(index)+ " terjual perhari  : " + integer/7);
				System.out.println("Rata-rata ticket " +jenisTiket.get(index)+ " terjual perminggu: " + integer/7 * 4);
			index++;
			}
		}
		else if(pilih.equals("6")) {
			
			System.out.println("presentasi rasio perkelas");
			for(int index2=0; index2 <4; index2++) {
				System.out.println("Minggu ke " + (index2 + 1));
				for(index=0; index < maxTiket.size(); index++) {
					if(index2 == 0) {
						banyakTiket = banyakTiketBerdasarkanjenis.get(index);
						System.out.println("Presentasi rasio " + jenisTiket.get(index) + " yaitu " + (banyakTiket*100)/maxTiket.get(index) + "%");
						}
					else
					{	banyakTiket = banyakTiketBerdasarkanjenis.get(index);
						banyakTiket = banyakTiket + (banyakTiket*(5*index2)/100); 
						System.out.println("Kenaikan Presentasi rasio " + jenisTiket.get(index) + " yaitu " +(banyakTiket*100)/maxTiket.get(index) + "%");
					}
				}
			}
		}
		System.out.println("Coba lagi (y/n) ?");
		pilih = key.next();
		}while(pilih.equals("y"));
		
	
		
		
		
		
		
		
		
	
		
	}

}


/*
		System.out.println("banyak tiket terjual perhari");
		for (Integer integer : banyakTiketTerjual) {
			System.out.println(integer);
		}
		
		System.out.println("banyak tiket terjual perkelas");
		for (Integer integer : banyakTiketBerdasarkanjenis) {
			System.out.println(integer);
		} 
 */
 