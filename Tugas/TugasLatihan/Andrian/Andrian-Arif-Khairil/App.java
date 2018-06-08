package aak;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
////Nomor 1	
//		String tipeBuah, bijiBuah, namaBuah, hargaBuah, rasaBuah, warnaKulitBuah,
//				teksturKulitBuah;
//		
//		System.out.println("Masukan tipe buah : ");
//		tipeBuah = key.next();
//		System.out.println("Masukan tipe biji buah : ");
//		bijiBuah = key.next();
//		System.out.println("Masukan nama buah : ");
//		namaBuah = key.next();
//		System.out.println("Masukan harga buah : ");
//		hargaBuah = key.next();
//		System.out.println("Masukan rasa buah : ");
//		rasaBuah = key.next();
//		System.out.println("Masukan warna kulit buah : ");
//		warnaKulitBuah = key.next();
//		System.out.println("Masukan tekstur kulit buah : ");
//		teksturKulitBuah = key.next();
//		
//		Buah buah = new Buah(tipeBuah, bijiBuah);
//		BuahNaga buahbuahan = new BuahNaga(buah, namaBuah, hargaBuah, rasaBuah, warnaKulitBuah, teksturKulitBuah);
//		buahbuahan.kandunganBuah(warnaKulitBuah);
//		System.out.println(buahbuahan.toString());
//		System.out.println();
//		buahbuahan.keuntungan(buahbuahan.kandunganBuah(warnaKulitBuah));

////Nomor2
		String namaPenyakit, penyebab, gejala, klasifikasi, faktorResiko;
		
		System.out.println("Masukan klasifikasi penyakit : ");
		klasifikasi = key.next();
		System.out.println("Masukan faktor resiko : ");
		faktorResiko = key.next();
		System.out.println("Masukan nama penyakit : ");
		namaPenyakit = key.next();
		System.out.println("Masukan penyebab : ");
		penyebab = key.next();
		System.out.println("1. perhari");
		System.out.println("2. perbulan");
		System.out.println("3. pertahun");
		System.out.println("Masukan terjadi gejala : ");
		gejala = key.next();
		
		Kanker kanker = new Kanker(klasifikasi, faktorResiko);
		KankerPankreas pankreas = new KankerPankreas(kanker, namaPenyakit, penyebab, "");
		System.out.println();
		pankreas.macamgejala(gejala);
		System.out.println(pankreas.toString());
		System.out.println(pankreas.caraPenanggulangan());
		
		

	
	
	}

}
