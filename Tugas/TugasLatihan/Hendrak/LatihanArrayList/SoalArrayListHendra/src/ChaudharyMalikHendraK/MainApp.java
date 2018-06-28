package ChaudharyMalikHendraK;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hasilMinggu3=0, hasilMinggu4=0;
		int temp=0, terjualBanyak;
		String pilih ="";
		Scanner key = new Scanner(System.in);
		
		TokoAmazon fanta = new TokoAmazon("fanta", 7000, 3, 15, 0, 0, 5, 3);
		TokoAmazon taro = new TokoAmazon("taro", 3000, 10, 20, 18, 0, 6, 0);
		TokoAmazon clear = new TokoAmazon("shampo clear", 12000, 0, 0, 3, 0, 12, 0);
		TokoAmazon tissue = new TokoAmazon("tissuee", 2000, 0, 3, 0, 0, 10, 0);
		TokoAmazon iceCream = new TokoAmazon("ice cream magnum", 10000, 0, 12, 0, 2, 15, 2);
	
		ArrayList<TokoAmazon> listBarang = new ArrayList<>();
		listBarang.add(fanta);
		listBarang.add(taro);
		listBarang.add(clear);
		listBarang.add(tissue);
		listBarang.add(iceCream);
		
		ArrayList<Integer> terjualMinggu1 = new ArrayList<>();
		ArrayList<Integer> terjualMinggu2 = new ArrayList<>();
		ArrayList<Integer> terjualMinggu3 = new ArrayList<>();
		ArrayList<Integer> terjualMinggu4 = new ArrayList<>();
		ArrayList<Integer> hargaBarang = new ArrayList<>();
		ArrayList<Integer> banyakBarang = new  ArrayList<>();
		
		ArrayList<String> namaHari = new ArrayList<>();
		namaHari.add("senin");
		namaHari.add("selasa");
		namaHari.add("rabu");
		namaHari.add("kamis");
		namaHari.add("sabtu");
		namaHari.add("minggu");
		
		for (TokoAmazon lb : listBarang) {
			terjualMinggu1.add(lb.terjualHari1);
			terjualMinggu1.add(lb.terjualHari2);
			terjualMinggu1.add(lb.terjualHari3);
			terjualMinggu1.add(lb.terjualHari4);
			terjualMinggu1.add(lb.terjualHari5);
			terjualMinggu1.add(lb.terjualHari6);	
			hargaBarang.add(lb.getHargaBarang());
			banyakBarang.add(lb.terjualHari1 + lb.terjualHari2 + lb.terjualHari3 + lb.terjualHari4 + lb.terjualHari5 + lb.terjualHari6);
		}
		int index = 0;
		for (Integer integer : terjualMinggu1) {
			if(integer > 0){
				terjualMinggu2.add(integer + 2);
				terjualMinggu3.add(integer + 2 - 1 );
				terjualMinggu4.add(integer - 2);
			}
			else if(integer ==0)
			{
				terjualMinggu2.add(0);
				terjualMinggu3.add(0);
				terjualMinggu4.add(0);
			}
		}
		//mencari penghasilan minggu ke3
		index = 0;
		int indexHarga = 0;		
		for (Integer integer : terjualMinggu3) {
				temp = integer * hargaBarang.get(indexHarga);
				hasilMinggu3 += temp;
			if((index + 1)%6 == 0)
			{
				indexHarga++;
			}
			index++;
		}
		
		//mencari penghasilan minggu ke4
		index = 0;
		indexHarga = 0;		
		for (Integer integer : terjualMinggu4) {
				temp = integer * hargaBarang.get(indexHarga);
				hasilMinggu4 += temp;
			if((index + 1)%6 == 0)
			{
				indexHarga++;
			}
			index++;
		}
		terjualBanyak = banyakBarang.get(0);
		for (index=0; index < banyakBarang.size() ; index++) {
			if(terjualBanyak < banyakBarang.get(index)) {
				terjualBanyak = banyakBarang.get(index);
			}
			
		}
		do {
		System.out.println("===============");
		System.out.println("Toko Amazon");
		System.out.println("===============");
		System.out.println("1.Penghasilan minggu ke 3");
		System.out.println("2.Selisih Penghasilan minggu ke 3 dan 4");
		System.out.println("3.Item yang paling banyak terjual");
		System.out.println("===============");
		System.out.println("Masukan pilihan : ");
		pilih = key.next();
		if(pilih.equals("1"))
		{
			System.out.println("Penghasilan minggu ke 3 : " + hasilMinggu3);	
		} 
		else if(pilih.equals("2"))
		{
			if(hasilMinggu3 > hasilMinggu4) {
				System.out.println("Selisih penghasilan minggu ke 4 dan ke 3 : " + (hasilMinggu3 - hasilMinggu4) + ", dengan penghasilan minggu ke 3 lebih besar");
			}
			else {
				System.out.println("Selisih penghasilan minggu ke 4 dan ke 3 : " + (hasilMinggu4 - hasilMinggu3) + ", dengan penghasilan minggu ke 4 lebih besar");	
			}
		} else if(pilih.equals("3"))
		{
			System.out.println("Item yang paling banyak terjual dalam sebulan " + terjualBanyak);
			
		}
		System.out.println("Ulang (y/n) : ");
		pilih = key.next();
		}while(pilih.equals("y"));
	}
}
