package LatihanTukangBuah;

import java.util.*;

public class AppPenjual {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int input, temp=0, hargaTerkecil=0, hargaTerbesar=0, hargahari1 = 0, hargahari2=0, perbandingan=0 ;
		int banyakMinggu=4;
		double profit=0.2, profit1Bulan;
		String hari, cek = null, pilihHari1, pilihHari2;
		ArrayList<Integer> dailyIncome = new ArrayList<>();
		ArrayList<String> nameoftheday = new ArrayList<>(Arrays.asList("senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"));
		
		Buah semangka = new Buah("Semangka", 18000, 12, 15, 11, 8, 20, 10, 14);
		Buah pisang = new Buah("Pisang", 15000, 10, 14, 15, 7, 20, 13, 16);
		Buah mangga = new Buah("Mangga", 10000, 13, 12, 9, 15, 20, 9, 13);
		
		ArrayList<Buah> listBuah = new ArrayList<Buah>();
		listBuah.add(semangka);
		listBuah.add(pisang);
		listBuah.add(mangga);
		
		for(int i = 0 ; i < nameoftheday.size() ; i++){
			temp =0;
			for (Buah income:listBuah) {
				temp+=income.daily(i);
			}
			dailyIncome.add(temp);
		}
//		for (Integer i : dailyIncome)
//			System.out.println(i);
		
		System.out.println("\t\tPEDAGANG BUAH\t\t");
		System.out.println("1. Penghasilan Perhari");
		System.out.println("2. Penghasilan Perminggu");
		System.out.println("3. Penghasilan Sebulan");
		System.out.println("4. Penghasilan Terkecil");
		System.out.println("5. Penghasilan Terbesar");
		System.out.println("6. Perbandingan Penghasilan");
		System.out.println("7. Buah yang paling banyak terjual selama seminggu");
		System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu");
		System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu");
		System.out.println("10.Hitung Penghasilan Laba penjual selama sebulan");
		System.out.println();
		System.out.print("Masukan Menu yang diiginkan 1 s.d 10 : ");
		input = key.nextInt();
		
		if (input==1) {
			System.out.print("Masukan hari yang diiginkan : ");
			hari = key.next();
			for (String d:nameoftheday) {
				if (hari.equalsIgnoreCase(d)) {
					System.out.println("Your income in "+hari+" are Rp. "+dailyIncome.get(nameoftheday.indexOf(d)));
				}	
			}
		}
		else if (input==2) {
			temp=0;
			for (Buah income:listBuah) {
				System.out.println("Pendapatan selama seminggu untuk "+income.getNamaBuah()+" adalah "+income.incomeWeekly());
				temp+=income.incomeWeekly();
			}
			System.out.println();
			System.out.println("Total pendapatan adalah "+temp);
		}
		else if (input==3) {
			temp=0;
			for (Buah income:listBuah) {
				System.out.println("Pendapatan selama sebulan untuk "+income.getNamaBuah()+" adalah "+(income.incomeWeekly()*4));
				temp=temp + (income.incomeWeekly()*4);
			}
			System.out.println();
			System.out.println("Total pendapatan adalah "+temp);
		}
		else if (input==4) {
			hargaTerkecil = dailyIncome.get(0);
			for(int i = 0 ; i < dailyIncome.size() ; i++){
				if (dailyIncome.get(i) < hargaTerkecil) {
					hargaTerkecil = dailyIncome.get(i);
					cek = nameoftheday.get(i);
					}
				}
			System.out.println("Penghasilan terkecil dalam 1 minggu adalah "+cek+" Rp. "+hargaTerkecil);
		}
		else if (input==5) {
			hargaTerbesar = dailyIncome.get(0);
			for(int i = 0 ; i < dailyIncome.size() ; i++){
				if (dailyIncome.get(i) > hargaTerbesar) {
					hargaTerbesar = dailyIncome.get(i);
					cek = nameoftheday.get(i);
					}
				}
			System.out.println("Penghasilan terkecil dalam 1 minggu adalah "+cek+" Rp. "+hargaTerbesar);
		}
		else if (input==6) {
			System.out.print("Masukan hari 1 yang diiginkan : ");
			pilihHari1 = key.next();
			for (String d:nameoftheday) {
				if (pilihHari1.equalsIgnoreCase(d)) {
					hargahari1 = dailyIncome.get(nameoftheday.indexOf(d));
				}	
			}
			System.out.print("Masukan hari 2 yang diiginkan : ");
			pilihHari2 = key.next();
			for (String d:nameoftheday) {
				if (pilihHari2.equalsIgnoreCase(d)) {
					hargahari2 = dailyIncome.get(nameoftheday.indexOf(d));
				}	
			}
			if (hargahari1<hargahari2) {
				perbandingan = hargahari1 - hargahari2;
				System.out.println("Perbandingan antara Hari "+pilihHari1+" dan "+pilihHari2+" adalah "+perbandingan+", pendapatan hari "+pilihHari2+"  lebih besar");
			}
			else if (hargahari1>hargahari2) {
				perbandingan = hargahari1 - hargahari2;
				System.out.println("Perbandingan antara Hari "+pilihHari1+" dan "+pilihHari2+" adalah "+perbandingan+", pendapatan hari "+pilihHari2+"  lebih besar");
			}
		}
		else if (input==7) {
			temp=0;
			String fruitName;
			temp = listBuah.get(0).totalBuah();
			fruitName = listBuah.get(0).getNamaBuah();
			for (int i=1; i<listBuah.size(); i++) {
				if (listBuah.get(i).incomeWeekly()>temp) {
					temp = listBuah.get(i).totalBuah();
					fruitName = listBuah.get(i).getNamaBuah();
				}
			}
			System.out.println("Buah yang memiliki penjualan terbanyak selama seminggu adalah "+fruitName+" , Rp "+temp);
		}
		else if (input==8) {
			temp=0;
			String fruitName;
			temp = listBuah.get(0).incomeWeekly();
			fruitName = listBuah.get(0).getNamaBuah();
			for (int i=1; i<listBuah.size(); i++) {
				if (listBuah.get(i).incomeWeekly()>temp) {
					temp = listBuah.get(i).incomeWeekly();
					fruitName = listBuah.get(i).getNamaBuah();
				}
			}
			System.out.println("Buah yang memiliki penjualan terbesar selama seminggu adalah "+fruitName+" , Rp "+temp);
		}
		else if (input==9) {
			temp=0;
			String fruitName;
			temp = listBuah.get(0).incomeWeekly();
			fruitName = listBuah.get(0).getNamaBuah();
			for (int i=1; i<listBuah.size(); i++) {
				if (listBuah.get(i).incomeWeekly()<temp) {
					temp = listBuah.get(i).incomeWeekly();
					fruitName = listBuah.get(i).getNamaBuah();
				}
			}
			System.out.println("Buah yang memiliki penjualan terkecil selama seminggu adalah "+fruitName+" , Rp "+temp);
		}
		else if (input==10) {
			temp=0;
			for (Buah income:listBuah)
				temp+=income.incomeWeekly();
			profit1Bulan=temp*banyakMinggu*profit;
			System.out.println("Profit selama satu bulan adalah "+profit1Bulan);
		}
		
	}
}
