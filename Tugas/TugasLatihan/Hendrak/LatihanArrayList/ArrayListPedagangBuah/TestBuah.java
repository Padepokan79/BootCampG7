//Created by : Hendra Kurniawan
//Date 		 : 22 Juni 2018 Time : 1:15 AM
//Modified   :
package ArrayListPedagangBuah;
import java.util.*;
import java.util.Scanner;

public class TestBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempPenghasilan =0, tempPenghasilan2=0, tempPenghasilan3=0, tempPenghasilan4=0, tempPenghasilan5=0, tempPenghasilan6=0, tempPenghasilan7=0;
		int penghasilanHari =0, penghasilanHari2=0, penghasilanHari3=0, penghasilanHari4=0, penghasilanHari5=0, penghasilanHari6=0, penghasilanHari7=0;
		int literasi =0, indexHari=0, indexNama =0, banding1=0, banding2=0,penghasilanBuahTerbanyak=0,penghasilanBuahTerkecil = 0;
		int penghasilanPerminggu=0, penghasilanBulanan=0, penghasilanTerkecil=0, penghasilanTerbesar = 0, buahTerbanyak, laba;
		String pilih="", hari1, hari2, valHuruf="h",valAngka="a",valMenu="m";
		int index=0;
		boolean cek = false;
		
		Scanner key = new Scanner(System.in);
		Validasi val =new Validasi();
		
		Buah buahSemangka = new Buah("semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah buahPisang = new Buah("pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		Buah buahMangga = new Buah("mangga", 10000, 13, 12,  9,15, 20,  9, 13);
		//Buah buahMelon = new Buah("melon", 20000, 15, 10, 16, 17, 20, 13, 18);
		
		ArrayList<Integer> penghasilanHarian = new ArrayList<>();
		ArrayList<Buah> listBuah = new ArrayList<Buah>();
		listBuah.add(buahSemangka);
		listBuah.add(buahPisang);
		listBuah.add(buahMangga);
		//listBuah.add(buahMelon);
		
		ArrayList<String> namaHari = new ArrayList<>();
		namaHari.add("senin");
		namaHari.add("selasa");
		namaHari.add("rabu");
		namaHari.add("kamis");
		namaHari.add("jumat");
		namaHari.add("sabtu");
		namaHari.add("minggu");
		
		ArrayList<String> namaBuah = new ArrayList<>();
		for (Buah buah : listBuah) {
		   namaBuah.add(buah.namaBuah);
		}
		
		ArrayList<Integer> hargaBuah = new ArrayList<>();
		for(Buah buah : listBuah) {
			hargaBuah.add(buah.getHargaBuah()); 
		}
		
		ArrayList<Integer> banyakBuah = new ArrayList<>();
		for (Buah buah : listBuah) {
			if(buah.namaBuah.equals(namaBuah.get(index)))
			banyakBuah.add(buah.terjual1 + buah.terjual2 + buah.terjual3 + buah.terjual4 + buah.terjual5 + buah.terjual6 + buah.terjual7) ;
		index++;
		}	
		
		ArrayList<Integer> penghasilanBuahMinggu = new ArrayList<>();
		for ( index =0; index < namaBuah.size(); index++) {
			penghasilanBuahMinggu.add(banyakBuah.get(index)*hargaBuah.get(index));
		}	
		
		//mencari penghasilan harian
		literasi = 0;
		for (Buah buah : listBuah) {
			
			tempPenghasilan = buah.terjual1 * buah.getHargaBuah();
			penghasilanHari += tempPenghasilan;
			tempPenghasilan2 = buah.terjual2 * buah.getHargaBuah();
			penghasilanHari2 += tempPenghasilan2;
			tempPenghasilan3 = buah.terjual3 * buah.getHargaBuah();
			penghasilanHari3 += tempPenghasilan3;
			tempPenghasilan4 = buah.terjual4 * buah.getHargaBuah();
			penghasilanHari4 += tempPenghasilan4;
			tempPenghasilan5 = buah.terjual5 * buah.getHargaBuah();
			penghasilanHari5 += tempPenghasilan5;
			tempPenghasilan6 = buah.terjual6 * buah.getHargaBuah();
			penghasilanHari6 += tempPenghasilan6;
			tempPenghasilan7 = buah.terjual7 * buah.getHargaBuah();
			penghasilanHari7 += tempPenghasilan7;
			literasi++;
			if(literasi == listBuah.size())
			{
				penghasilanHarian.add(penghasilanHari);
				penghasilanHarian.add(penghasilanHari2);
				penghasilanHarian.add(penghasilanHari3);
				penghasilanHarian.add(penghasilanHari4);
				penghasilanHarian.add(penghasilanHari5);
				penghasilanHarian.add(penghasilanHari6);
				penghasilanHarian.add(penghasilanHari7);
			}
			
		}
		//mencari penghasilan mingguan
		for(index = 0 ; index < penghasilanHarian.size(); index++) {
			penghasilanPerminggu += penghasilanHarian.get(index);
		}
		
		//mencari penghasilan bulanan
		penghasilanBulanan = penghasilanPerminggu * 4;
		do {
		System.out.println("===========================================================");
		System.out.println("PEDAGANG BUAH");
		System.out.println("===========================================================");
		System.out.println("1.Penghasilan Perhari");
		System.out.println("2.Penghasilan Perminggu");
		System.out.println("3.Penghasilan Perbulan");
		System.out.println("4.Penghasilan Terbesar");
		System.out.println("5.Penghasilan Terkecil");
		System.out.println("6.Perbandingan Penghasilan");
		System.out.println("7.Buah yang paling banyak terjual selama seminggu");
		System.out.println("8.Buah yang memiliki penghasilan terbesar selama seminggu");
		System.out.println("9.Buah yang memiliki penghasilan terkecil selama seminggu");
		System.out.println("10.Hitung penghasilan laba penjual selama sebulan");
		System.out.println("===========================================================");
		pilih = val.inputDanValidasi("Masukan pilihan : ", pilih, cek, key, valMenu);
		
		if(pilih.equals("1")) {
			pilih = val.inputDanValidasi("Masukan Hari : ", pilih, cek, key, valHuruf);
			for(index = 0 ; index < namaHari.size();index++) {
				if(pilih.equals(namaHari.get(index))) {
					System.out.println("Penghasilan hari " + namaHari.get(index) +  " sebesar " + penghasilanHarian.get(index) );
				}
			}
		}
		else if(pilih.equals("2")) {
			for( index = 0 ; index < namaHari.size();index++) {
					System.out.println("Penghasilan hari " + namaHari.get(index) + " sebesar " + penghasilanHarian.get(index) );
			}
			System.out.println("Penghailsn Mingguan : " + penghasilanPerminggu);
		}
		else if(pilih.equals("3")) {
			System.out.println("Penghailsn Bulanan : " + penghasilanBulanan);
		}
		else if(pilih.equals("4")) {
			penghasilanTerbesar = penghasilanHarian.get(0);
			for( index = 1 ; index < penghasilanHarian.size(); index++) {
				if(penghasilanTerbesar < penghasilanHarian.get(index)) {
					indexHari = index;
					penghasilanTerbesar = penghasilanHarian.get(index);	
				}
			}
			System.out.println("Penghasilan terbesar yaitu hari " + namaHari.get(indexHari) + " dengan total penjualan " + penghasilanTerbesar);
		}
		else if(pilih.equals("5")) {
			penghasilanTerkecil = penghasilanHarian.get(0);
			for( index = 1 ; index < penghasilanHarian.size(); index++) {
				if(penghasilanTerkecil > penghasilanHarian.get(index)) {
					indexHari = index;
					penghasilanTerkecil = penghasilanHarian.get(index);
				}
			}
			System.out.println("Penghasilan terkecil yaitu hari " + namaHari.get(indexHari) + " dengan total penjualan " + penghasilanTerkecil);
		}
		else if(pilih.equals("6")) {
			hari1 = val.inputDanValidasi("Masukan Hari ke 1 : ", pilih, cek, key, valHuruf);
			hari2 = val.inputDanValidasi("Masukan Hari ke 2 : ", pilih, cek, key, valHuruf);
			
			for( index = 0; index < namaHari.size(); index++) {
				if(hari1.equals(namaHari.get(index))) {
					banding1 = penghasilanHarian.get(index);
				}
				
				if(hari2.equals(namaHari.get(index))) {
					banding2 = penghasilanHarian.get(index);
				}
			}
			if(banding1 > banding2) {
				System.out.println("Penghasilan terbesar pada hari " + hari1 +", Perbandingan hari " + hari1 + " dan " + hari2 + " adalah " + (banding1 - banding2) + "" );
			}else
			{
				System.out.println("Penghasilan terbesar pada hari " + hari2 +", Perbandingan hari " + hari1 + " dan " + hari2 + " adalah " + (banding2 - banding1) + "" );
			}
		}
		else if(pilih.equals("7")) {
			indexNama = 0;
			index=0;
			buahTerbanyak = banyakBuah.get(0);
			for(index=1; index < banyakBuah.size(); index++) {
				if(buahTerbanyak < banyakBuah.get(index)) {
					buahTerbanyak = banyakBuah.get(index);
					indexNama = index;
				}
			}
			System.out.println("Buah yang paling banyak terjual dalam seminggu yaitu " + namaBuah.get(indexNama) + " dengan banyak buah terjual " + buahTerbanyak);
		}
		else if(pilih.equals("8")) {
			
			penghasilanBuahTerbanyak = penghasilanBuahMinggu.get(0);
			for(index=1; index < penghasilanBuahMinggu.size();index++){
				if(penghasilanBuahTerbanyak< penghasilanBuahMinggu.get(index))
				{
					penghasilanBuahTerbanyak = penghasilanBuahMinggu.get(index);
					indexNama =index;
				}
			}
			System.out.println("Penghasilan buah terbanyak dalam seminggu yaitu " + namaBuah.get(indexNama) + " dengan penghasilan " + penghasilanBuahTerbanyak);
		}
		else if(pilih.equals("9")) {
			penghasilanBuahTerkecil = penghasilanBuahMinggu.get(0);
			for(index=1; index < penghasilanBuahMinggu.size();index++){
				if(penghasilanBuahTerkecil > penghasilanBuahMinggu.get(index))
				{
					penghasilanBuahTerkecil = penghasilanBuahMinggu.get(index);
					indexNama =index;
				}
			}
			System.out.println("Penghasilan buah terkecil dalam seminggu yaitu " + namaBuah.get(indexNama) + " dengan penghasilan " + penghasilanBuahTerkecil);
		
		}
		else if(pilih.equals("10")) {
			laba = (int) (penghasilanBulanan * 0.2);
			System.out.println("Laba yang didapat dalam sebulan yaitu " + laba);
		}
		System.out.println("=======================================================");
		pilih = val.inputDanValidasi("Mau menghitung yang lain (ya/tidak) ? ", pilih, cek, key, valHuruf);
		}while(pilih.equals("ya"));
	}

}
