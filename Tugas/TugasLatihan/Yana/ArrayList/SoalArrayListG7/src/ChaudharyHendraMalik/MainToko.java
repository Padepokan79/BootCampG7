package ChaudharyHendraMalik;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import AlifharAndrianRyan.Bioskop;

public class MainToko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key		= new Scanner(System.in);
		Toko 	tissue 	= new Toko("Tissuee", 2000, 0, 3, 0, 0, 0, 10, 0);
		Toko 	fanta	= new Toko("Fanta", 7000, 3, 15, 0, 0, 0, 5, 3);
		Toko 	icecream= new Toko("Ice Cream", 10000, 0, 12, 0, 2, 0, 15, 2);
		Toko 	taro	= new Toko("Taro", 3000, 10, 20, 0, 18, 0, 6, 3);
		Toko 	shampoo	= new Toko("Shampoo", 12000, 0, 0, 3, 0, 0, 12, 0);
		
		int		jumlahHari = 7;
		double	pendapatanHarian3 = 0,
				pendapatanMinggu3 = 0,
				pendapatanHarian4 = 0,
				pendapatanMinggu4 = 0,
				selisihPendapatan = 0;
		
		ArrayList<Toko> listBarangSenin = new ArrayList<Toko>();
		listBarangSenin.add(tissue);
		listBarangSenin.add(fanta);
		listBarangSenin.add(icecream);
		listBarangSenin.add(taro);
		listBarangSenin.add(shampoo);
		
		ArrayList<String> listNamaBarang = new ArrayList<String>();
		listNamaBarang.add(tissue.getNamaBarang());
		listNamaBarang.add(fanta.getNamaBarang());
		listNamaBarang.add(icecream.getNamaBarang());
		listNamaBarang.add(taro.getNamaBarang());
		listNamaBarang.add(shampoo.getNamaBarang());
		
		ArrayList<Double> listPenghasilan1 = new ArrayList<Double>();
		
		ArrayList<Integer> listPerMinggu = new ArrayList<Integer>();
		
		for(int hari=1; hari <= jumlahHari; hari++) {
			pendapatanHarian3 = 0;
			for(Toko hargaBarang : listBarangSenin) {
				pendapatanHarian3 += hargaBarang.pendapatanHarian3(hari);
			}
//			System.out.println("Hari ke " +hari+ " Rp. "+pendapatanHarian3);
			pendapatanMinggu3 += pendapatanHarian3;
		}
		System.out.println("\n1. Pendapatan Minggu 3 adalah " +pendapatanMinggu3);
		
		for(int hari=1; hari <= jumlahHari; hari++) {
			pendapatanHarian4 = 0;
			for(Toko hargaBarang : listBarangSenin) {
				pendapatanHarian4 += hargaBarang.pendapatanHarian4(hari);
			}
//			System.out.println("Hari ke " +hari+ " Rp. "+pendapatanHarian4);
			pendapatanMinggu4 += pendapatanHarian4;
		}
//		System.out.println("\nPendapatan Minggu 4 : " +pendapatanMinggu4);
		
		if (pendapatanMinggu3 > pendapatanHarian4) {
			selisihPendapatan = pendapatanMinggu3 - pendapatanMinggu4;
		}
		else if (pendapatanMinggu4 > pendapatanHarian3) {
			selisihPendapatan = pendapatanMinggu4 - pendapatanMinggu3;
		}
		
		System.out.println("2. Selisih pendapatan minggu 3 dan minggu 4 adalah "+selisihPendapatan);
		
		int jumlahTissue 	= tissue.minggu1() + tissue.minggu2() + tissue.minggu3() + tissue.minggu4();
		int jumlahFanta 	= fanta.minggu1() + fanta.minggu2() + fanta.minggu3() + fanta.minggu4();
		int jumlahIcecream 	= icecream.minggu1() + icecream.minggu2() + icecream.minggu3() + icecream.minggu4();
		int jumlahTaro	 	= taro.minggu1() + taro.minggu2() + taro.minggu3() + taro.minggu4();
		int jumlahShampoo	= shampoo.minggu1() + shampoo.minggu2() + shampoo.minggu3() + shampoo.minggu4();

		listPerMinggu.add(jumlahTissue);
		listPerMinggu.add(jumlahFanta);
		listPerMinggu.add(jumlahIcecream);
		listPerMinggu.add(jumlahTaro);
		listPerMinggu.add(jumlahShampoo);
		
		Object max = Collections.max(listPerMinggu);		
		System.out.println("3. Jumlah item paling laku "+listNamaBarang.get(listPerMinggu.indexOf(Collections.max(listPerMinggu)))+" sebanyak "+max);
	}

}
