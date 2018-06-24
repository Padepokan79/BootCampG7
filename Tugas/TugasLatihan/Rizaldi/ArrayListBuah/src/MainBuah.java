import java.util.*;
public class MainBuah {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		String hari1, hari2, pick;
		
		Buah semangka	= new Buah("Semangka", 18000.0, 12, 15, 11, 8, 20, 10, 14);
		Buah Pisang		= new Buah("Pisang", 15000.0, 10, 14, 15, 7, 20, 13, 16);
		Buah Mangga		= new Buah("Mangga", 10000.0, 13, 12, 9, 15, 20, 9, 13);
		
		System.out.println("Menu Aplikasi Penjualan Buah");
		System.out.println("=====================================");
		System.out.println("1. Penghasilan Perhari");
		System.out.println("2. Penghasilan Seminggu");
		System.out.println("3. Penghasilan Sebulan");
		System.out.println("4. Penghasilan Terbesar");
		System.out.println("5. Penghasilan Terkecil");
		System.out.println("6. Perbandingan Penghasilan antara dua hari");
		System.out.println("7. Buah paling banyak terjual dalam seminggu");
		System.out.println("8. Buah penghasilan terbesar");
		System.out.println("9. Buah penghasilan terkecil");
		System.out.println("1. Laba penghasilan perbulan sebanyak 20% dari harga jual");
		System.out.println("Silakan Pilih Menu : ");
		pick = kb.next();
		
		ArrayList<Buah> listBuah = new ArrayList<Buah>();
		listBuah.add(semangka);
		listBuah.add(Pisang);
		listBuah.add(Mangga);
		
		ArrayList<String> namaHari = new ArrayList<String>();
		namaHari.add("senin");
		namaHari.add("selasa");
		namaHari.add("rabu");
		namaHari.add("kamis");
		namaHari.add("jumat");
		namaHari.add("sabtu");
		namaHari.add("minggu");
		
		ArrayList<String> namaBuah = new ArrayList<String>();
		namaBuah.add("semangka");
		namaBuah.add("pisang");
		namaBuah.add("Mangga");
		
		Double totalPemasukanHari1=0.0;
		Double totalPemasukanHari2=0.0;
		Double totalPemasukanHari3=0.0;
		Double totalPemasukanHari4=0.0;
		Double totalPemasukanHari5=0.0;
		Double totalPemasukanHari6=0.0;
		Double totalPemasukanHari7=0.0;
		
		for(Buah total:listBuah) {
			totalPemasukanHari1 += total.getHargaBuah()*total.getDay1();
			totalPemasukanHari2 += total.getHargaBuah()*total.getDay2();
			totalPemasukanHari3 += total.getHargaBuah()*total.getDay3();
			totalPemasukanHari4 += total.getHargaBuah()*total.getDay4();
			totalPemasukanHari5 += total.getHargaBuah()*total.getDay5();
			totalPemasukanHari6 += total.getHargaBuah()*total.getDay6();
			totalPemasukanHari7 += total.getHargaBuah()*total.getDay7();
		}
		Double weekly = totalPemasukanHari1+totalPemasukanHari2+totalPemasukanHari3+totalPemasukanHari4+totalPemasukanHari5+totalPemasukanHari6+totalPemasukanHari7;
		Double monthly = weekly*4;
		
		ArrayList<Double> listPenghasilanPerhari = new ArrayList<Double>();
		listPenghasilanPerhari.add(totalPemasukanHari1);
		listPenghasilanPerhari.add(totalPemasukanHari2);
		listPenghasilanPerhari.add(totalPemasukanHari3);
		listPenghasilanPerhari.add(totalPemasukanHari4);
		listPenghasilanPerhari.add(totalPemasukanHari5);
		listPenghasilanPerhari.add(totalPemasukanHari6);
		listPenghasilanPerhari.add(totalPemasukanHari7);
		
		ArrayList<Integer> qtySemangka = new ArrayList<Integer>();
		qtySemangka.add(semangka.day1);
		qtySemangka.add(semangka.day2);
		qtySemangka.add(semangka.day3);
		qtySemangka.add(semangka.day4);
		qtySemangka.add(semangka.day5);
		qtySemangka.add(semangka.day6);
		qtySemangka.add(semangka.day7);
		
		ArrayList<Integer> qtyPisang = new ArrayList<Integer>();
		qtyPisang.add(Pisang.day1);
		qtyPisang.add(Pisang.day2);
		qtyPisang.add(Pisang.day3);
		qtyPisang.add(Pisang.day4);
		qtyPisang.add(Pisang.day5);
		qtyPisang.add(Pisang.day6);
		qtyPisang.add(Pisang.day7);
		
		ArrayList<Integer> qtyMangga = new ArrayList<Integer>();
		qtyMangga.add(Mangga.day1);
		qtyMangga.add(Mangga.day2);
		qtyMangga.add(Mangga.day3);
		qtyMangga.add(Mangga.day4);
		qtyMangga.add(Mangga.day5);
		qtyMangga.add(Mangga.day6);
		qtyMangga.add(Mangga.day7);
		
		int totalSemangkaSeminggu = 0;
		for (Integer itr : qtySemangka) {
			totalSemangkaSeminggu = totalSemangkaSeminggu+itr;
		}
		
		int totalPisangSeminggu = 0;
		for (Integer itr : qtyPisang) {
			totalPisangSeminggu = totalPisangSeminggu+itr;
		}
		
		int totalManggaSeminggu = 0;
		for (Integer itr : qtyMangga) {
			totalManggaSeminggu = totalManggaSeminggu+itr;
		}
		
		Double totalPenghasilanSemangka, totalPenghasilanPisang, totalPenghasilanMangga;
		totalPenghasilanSemangka = totalSemangkaSeminggu*semangka.getHargaBuah();
		totalPenghasilanPisang = totalPisangSeminggu*Pisang.getHargaBuah();
		totalPenghasilanMangga = totalManggaSeminggu*Mangga.getHargaBuah();
//		System.out.println("jumlah penjualan semangka : "+totalPenghasilanSemangka);
//		System.out.println("jumlah penjualan Pisang   : "+totalPenghasilanPisang);
//		System.out.println("jumlah penjualan Mangga   : "+totalPenghasilanMangga);
		
		ArrayList<Integer> qtyBuah = new ArrayList<Integer>();
		qtyBuah.add(totalSemangkaSeminggu);
		qtyBuah.add(totalPisangSeminggu);
		qtyBuah.add(totalManggaSeminggu);
		
		ArrayList<Double> profitBuah = new ArrayList<Double>();
		profitBuah.add(totalPenghasilanSemangka);
		profitBuah.add(totalPenghasilanPisang);
		profitBuah.add(totalPenghasilanMangga);
		// Menu 1
		if(pick.equalsIgnoreCase("1")) {
			System.out.println("total pemasukan hari senin \t: "+totalPemasukanHari1);
			System.out.println("total pemasukan hari selasa \t: "+totalPemasukanHari2);
			System.out.println("total pemasukan hari rabu \t: "+totalPemasukanHari3);
			System.out.println("total pemasukan hari kamis \t: "+totalPemasukanHari4);
			System.out.println("total pemasukan hari jumat \t: "+totalPemasukanHari5);
			System.out.println("total pemasukan hari sabtu \t: "+totalPemasukanHari6);
			System.out.println("total pemasukan hari minggu \t: "+totalPemasukanHari7);
		}
		// Menu 2
		else if(pick.equalsIgnoreCase("2")) {			
			System.out.println("\nTotal Pemasukkan perminggu adalah\t: "+weekly);
		}
		// Menu 3
		else if(pick.equalsIgnoreCase("3")) {
			System.out.printf("\nTotal Pemasukkan perbulan adalah\t: %.2f",monthly);
		}
		// Menu 4
		else if(pick.equalsIgnoreCase("4")) {
			System.out.println("\nPenghasilan minimum terdapat pada hari\t: "+namaHari.get(listPenghasilanPerhari.indexOf(Collections.max(listPenghasilanPerhari)))+"\tsebesar Rp "+listPenghasilanPerhari.get(listPenghasilanPerhari.indexOf(Collections.max(listPenghasilanPerhari))));
		}		
		// Menu 5
		else if(pick.equalsIgnoreCase("5")) {
			System.out.println("\nPenghasilan minimum terdapat pada hari\t: "+namaHari.get(listPenghasilanPerhari.indexOf(Collections.min(listPenghasilanPerhari)))+"\tsebesar Rp "+listPenghasilanPerhari.get(listPenghasilanPerhari.indexOf(Collections.min(listPenghasilanPerhari))));
		}
		// Menu 6
		else if(pick.equalsIgnoreCase("6")) {
			System.out.println("Masukan hari ke 1 : ");
			hari1 = kb.next();
			System.out.println("Masukan hari ke 2 : ");
			hari2 = kb.next();
			Double valHari1=0.0, valHari2=0.0;
			for (Double itr : listPenghasilanPerhari) {
				if(hari1.equalsIgnoreCase("senin")) {
					valHari1 = listPenghasilanPerhari.get(0);
				}
				else if(hari1.equalsIgnoreCase("selasa")) {
					valHari1 = listPenghasilanPerhari.get(1);
				}
				else if(hari1.equalsIgnoreCase("rabu")) {
					valHari1 = listPenghasilanPerhari.get(2);
				}
				else if(hari1.equalsIgnoreCase("kamis")) {
					valHari1 = listPenghasilanPerhari.get(3);
				}
				else if(hari1.equalsIgnoreCase("jumat")) {
					valHari1 = listPenghasilanPerhari.get(4);
				}
				else if(hari1.equalsIgnoreCase("sabtu")) {
					valHari1 = listPenghasilanPerhari.get(5);
				}
				else if(hari1.equalsIgnoreCase("minggu")) {
					valHari1 = listPenghasilanPerhari.get(6);
				}
				else {
					valHari1 = null;
				}
			}
			
			for (Double itr : listPenghasilanPerhari) {
				if(hari2.equalsIgnoreCase("senin")) {
					valHari2 = listPenghasilanPerhari.get(0);
				}
				else if(hari2.equalsIgnoreCase("selasa")) {
					valHari2 = listPenghasilanPerhari.get(1);
				}
				else if(hari2.equalsIgnoreCase("rabu")) {
					valHari2 = listPenghasilanPerhari.get(2);
				}
				else if(hari2.equalsIgnoreCase("kamis")) {
					valHari2 = listPenghasilanPerhari.get(3);
				}
				else if(hari2.equalsIgnoreCase("jumat")) {
					valHari2 = listPenghasilanPerhari.get(4);
				}
				else if(hari2.equalsIgnoreCase("sabtu")) {
					valHari2 = listPenghasilanPerhari.get(5);
				}
				else if(hari2.equalsIgnoreCase("minggu")) {
					valHari2 = listPenghasilanPerhari.get(6);
				}
				else {
					valHari2 = null;
				}
			}
			
			if(valHari1!=valHari2&&valHari1>valHari2) {
				valHari1 = valHari1/valHari1;
				valHari2 = valHari1/valHari2;
				System.out.println("perbandingan = "+valHari1+" : "+valHari2+" Hari "+hari1+" lebih Besar !");
			}else if(valHari1!=valHari2&&valHari1<valHari2) {
				valHari1 = valHari2/valHari1;
				valHari2 = valHari2/valHari2;
				System.out.println("perbandingan = "+valHari1+" : "+valHari2+" Hari "+hari2+" lebih Besar !");
			}
		}
		
		// Menu 7
		else if(pick.equalsIgnoreCase("7")) {
			System.out.println("Buah paling banyak terjual adalah "+namaBuah.get(qtyBuah.indexOf(Collections.max(qtyBuah)))+"\tsebanyak : "+qtyBuah.get(qtyBuah.indexOf(Collections.max(qtyBuah))));
		}
		// Menu 8
		else if(pick.equalsIgnoreCase("8")) {
			System.out.println("Buah paling banyak untung adalah "+namaBuah.get(profitBuah.indexOf(Collections.max(profitBuah)))+"\tsebesar Rp : "+profitBuah.get(profitBuah.indexOf(Collections.max(profitBuah))));
		}
		// Menu 9
		else if(pick.equalsIgnoreCase("9")) {
			System.out.println("Buah paling sedikit untung adalah "+namaBuah.get(profitBuah.indexOf(Collections.min(profitBuah)))+"\tsebesar Rp : "+profitBuah.get(profitBuah.indexOf(Collections.min(profitBuah))));
		}
		// Menu 10
		else if(pick.equalsIgnoreCase("10")) {
			System.out.println("Laba sebulan : "+(monthly*(20.0/100.0)));
		}
		else {
			System.out.println("Menu tidak ada !!!");
		}

	}

}
