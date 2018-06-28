package SoalAlifarAndrianRyan;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hasilHarian1 = 0,hasilHarian2 = 0,hasilHarian3 = 0,hasilHarian4 = 0,hasilHarian5 = 0,hasilHarian6 = 0,hasilHarian7 = 0;
		int tiketTerjual1=0, tiketTerjual2=0, tiketTerjual3=0, tiketTerjual4=0, tiketTerjual5=0, tiketTerjual6=0, tiketTerjual7=0;
		int index=0, penghasilanMingguan=0, tiketMingguan=0, banding1=0, banding2=0;
		String pilih="", tiket1="", tiket2="";
		
		Cinema tiketReguler = new Cinema("reguler", 45000, 55000, 120, 1, 20, 30, 40, 30, 50, 50);
		Cinema tiketStarium = new Cinema("starium", 50000, 60000, 150, 1, 20, 30, 40, 30, 50, 50);
		Cinema tiketSweetbox = new Cinema("sweetbox", 55000, 70000, 40, 0, 15, 20, 25, 30, 40, 40);
		Cinema tiketVelvet = new Cinema("velvet", 90000, 125000, 30, 0, 1, 15, 20, 10, 30, 30);
	
		ArrayList<String> namaHari = new ArrayList<>();
		namaHari.add("senin");
		namaHari.add("selasa");
		namaHari.add("rabu");
		namaHari.add("kamis");
		namaHari.add("jumat");
		namaHari.add("sabtu");
		namaHari.add("minggu");
		
		ArrayList<Cinema> penjualanTiket = new ArrayList<>();
		penjualanTiket.add(tiketReguler);
		penjualanTiket.add(tiketStarium);
		penjualanTiket.add(tiketSweetbox);
		penjualanTiket.add(tiketVelvet);
		
		ArrayList<Integer> penghasilanHarian = new ArrayList<>();
		ArrayList<Integer> banyakTiketTerjual = new ArrayList<>();
		ArrayList<String> jenisTiket = new ArrayList<>();
		ArrayList<Integer> banyakTiketBerdasarkanjenisWeekend = new ArrayList<>();
		ArrayList<Integer> banyakTiketBerdasarkanjenisWeekdays = new ArrayList<>();
		ArrayList<Integer> penghasilanBerdasarkanJenisTiket = new ArrayList<>();
		
		for (Cinema tiket : penjualanTiket) {
			jenisTiket.add(tiket.jenisTicket);
		}
		
		
		
		//mencari penghasilanharian, ticketterjual, 
		for (Cinema cinema : penjualanTiket) {
			hasilHarian1 += (cinema.terjualHari1 * cinema.getHargaWeekdays());
			tiketTerjual1 += cinema.terjualHari1;
			hasilHarian2 += (cinema.terjualHari2 * cinema.getHargaWeekdays());
			tiketTerjual2 += cinema.terjualHari2;
			hasilHarian3 += (cinema.terjualHari3 * cinema.getHargaWeekdays());
			tiketTerjual3 += cinema.terjualHari3;
			hasilHarian4 += (cinema.terjualHari4 * cinema.getHargaWeekdays());
			tiketTerjual4 += cinema.terjualHari4;
			hasilHarian5 += (cinema.terjualHari5 * cinema.getHargaWeekdays());
			tiketTerjual5 += cinema.terjualHari5;
			hasilHarian6 += (cinema.terjualHari6 * cinema.getHargaWeekend());
			tiketTerjual6 += cinema.terjualHari6;
			hasilHarian7 += (cinema.terjualHari7 * cinema.getHargaWeekend());
			tiketTerjual7 += cinema.terjualHari7;
			banyakTiketBerdasarkanjenisWeekdays.add(cinema.terjualHari1 + cinema.terjualHari2 + cinema.terjualHari3 + cinema.terjualHari4 + cinema.terjualHari5);
			banyakTiketBerdasarkanjenisWeekend.add(cinema.terjualHari6 + cinema.terjualHari7);
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
		
		for (Integer harian : penghasilanHarian) {
			penghasilanMingguan += harian;
		}
		
		for (Integer tiket : banyakTiketTerjual) {
			tiketMingguan += tiket;
		}
		index = 0;
		for (Cinema cinema : penjualanTiket) {
				penghasilanBerdasarkanJenisTiket.add(banyakTiketBerdasarkanjenisWeekdays.get(index)*cinema.getHargaWeekdays() + banyakTiketBerdasarkanjenisWeekend.get(index) * cinema.getHargaWeekend());
		index++;
		}
		do {
		System.out.println("====================");
		System.out.println("       79 CGV       ");
		System.out.println("====================");
		System.out.println("1.Mencari Penjualan perhari");
		System.out.println("2.Mencari penjualan perminggu");
		System.out.println("3.Total tiket yang terjual perhari");
		System.out.println("4.total tiket yang terjual perminggu");
		System.out.println("5.Perbandingan penjualan antara 2 jenis tiket berbeda (perminggu)");
		System.out.println("======================================================");
		System.out.print("Masukan pilihan : ");
		Scanner key = new Scanner(System.in);
		pilih = key.next();
		
		if(pilih.equals("1")) {
			for(index=0; index < penghasilanHarian.size();index++) {
				System.out.println("Penjualan tiket pada hari " + namaHari.get(index) + " , sebesar Rp."+penghasilanHarian.get(index));
			}
		}
		else if(pilih.equals("2")) {
			System.out.println("Penjualan tiket mingguan sebesar Rp." + penghasilanMingguan);
		}
		else if(pilih.equals("3")) {
			for(index=0; index < banyakTiketTerjual.size();index++) {
				System.out.println("Penjualan tiket pada hari " + namaHari.get(index) + " , sebanyak "+ banyakTiketTerjual.get(index));
			}
		}
		else if(pilih.equals("4")) {
			System.out.println("Penjualan tiket mingguan sebanyak " + tiketMingguan);
		}
		else if(pilih.equals("5")) {
			System.out.println("Masukan jenis tiket 1 : ");
			tiket1 = key.next();
			System.out.println("Masukan jenis tiket 2 : ");
			tiket2 = key.next();
			for(index=0; index < jenisTiket.size();index++) {
				if(tiket1.equals(jenisTiket.get(index)))
				{
					banding1 = penghasilanBerdasarkanJenisTiket.get(index);
				}
				if(tiket2.equals(jenisTiket.get(index)))
				{
					banding2 = penghasilanBerdasarkanJenisTiket.get(index);
				}
				
				
			}
			if(banding1 > banding2) {
				System.out.println("Penghasilan terbesar yaitu tiket " + tiket1 +", Perbandingan tiket " + tiket1 + " dan " + tiket2 + " adalah " + (banding1 - banding2) + "" );
			}
			else if(banding2 > banding1) {
				System.out.println("Penghasilan terbesar yaitu tiket " + tiket2 +", Perbandingan tiket " + tiket2 + " dan " + tiket1 + " adalah " + (banding2 - banding1) + "" );
			}
			else if(banding1 == banding2) {
				System.out.println("Penghasilan sama.");
			}
		}
		System.out.print("Pilih menu lagi (y/t)?");
		pilih = key.next();
		}while(pilih.equals("y"));
	}

}
