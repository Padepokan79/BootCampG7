package Buah;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import latihan1.Person;

public class TestBuah {	
	public static void main(String[] args) {
		int menu, seminggu = 0, perhari = 0, harii = 0, hari2 = 0;
		Buah semangka = new Buah("Semangka",18000,12,15,11,8,20,10,14);
		Buah pisang = new Buah("Pisang",15000,10,14,15,7,20,13,16);
		Buah mangga = new Buah("mangga",10000,13,12,9,15,20,9,13);
		
		ArrayList<Buah> buah= new ArrayList<Buah>();
		buah.add(semangka);
		buah.add(pisang);
		buah.add(mangga);
		
		ArrayList<Integer> tSemangka= new ArrayList<Integer>();
		tSemangka.add(12);
		tSemangka.add(15);
		tSemangka.add(11);
		tSemangka.add(8);
		tSemangka.add(20);
		tSemangka.add(10);
		tSemangka.add(14);
		
		ArrayList<Integer> tPisang= new ArrayList<Integer>();
		tPisang.add(10);
		tPisang.add(14);
		tPisang.add(15);
		tPisang.add(7);
		tPisang.add(20);
		tPisang.add(13);
		tPisang.add(16);
		
		ArrayList<Integer> tMangga= new ArrayList<Integer>();
		tMangga.add(13);
		tMangga.add(12);
		tMangga.add(9);
		tMangga.add(15);
		tMangga.add(20);
		tMangga.add(9);
		tMangga.add(13);
		
		ArrayList<String> hari= new ArrayList<String>();
		hari.add("Senin");
		hari.add("Selasa");
		hari.add("Rabu");
		hari.add("Kamis");
		hari.add("Jumat");
		hari.add("Sabtu");
		hari.add("Minggu");
		
		Scanner scan = new Scanner(System.in);
		ArrayList temp = new ArrayList();
		System.out.print("Masukan Menu: ");
		menu = scan.nextInt();
		
		if (menu == 1) {
			for(Buah b : buah) {
				System.out.println("Buah "+b.getNamaBuah()+" : "+b.getHargaBuah()*b.getHari1());
			}
		} else if(menu == 2) {
			for(Buah b: buah) {
				seminggu += b.getHari1()*b.getHargaBuah();
				seminggu += b.getHari2()*b.getHargaBuah();
				seminggu += b.getHari3()*b.getHargaBuah();
				seminggu += b.getHari4()*b.getHargaBuah();
				seminggu += b.getHari5()*b.getHargaBuah();
				seminggu += b.getHari6()*b.getHargaBuah();
				seminggu += b.getHari7()*b.getHargaBuah();
				System.out.println("Buah "+b.getNamaBuah()+" : "+seminggu);
				
				seminggu *= 0;
			}
		} else if(menu == 3) {
			for(Buah b: buah) {
				seminggu += b.getHari1()*b.getHargaBuah();
				seminggu += b.getHari2()*b.getHargaBuah();
				seminggu += b.getHari3()*b.getHargaBuah();
				seminggu += b.getHari4()*b.getHargaBuah();
				seminggu += b.getHari5()*b.getHargaBuah();
				seminggu += b.getHari6()*b.getHargaBuah();
				seminggu += b.getHari7()*b.getHargaBuah();
				System.out.println("Buah "+b.getNamaBuah()+" : "+seminggu*4);
				seminggu *= 0;
			}
		} else if(menu == 4) {
			for(int i = 0; i < 7; i ++) {
//				System.out.println("Buah Semangka: "+tSemangka.get(i)*semangka.getHargaBuah());
//				System.out.println("Buah Pisang: "+tPisang.get(i)*pisang.getHargaBuah());
//				System.out.println("Buah Mangga: "+tMangga.get(i)*mangga.getHargaBuah());
				perhari += (tSemangka.get(i)*semangka.getHargaBuah())+(tPisang.get(i)*pisang.getHargaBuah())+(tMangga.get(i)*mangga.getHargaBuah());
				temp.add(perhari);
				perhari *= 0;
			}
			Object obj = Collections.min(temp);
			for(int i = 0; i < 7; i++) {
				if((int)obj == (tSemangka.get(i)*semangka.getHargaBuah())+(tPisang.get(i)*pisang.getHargaBuah())+(tMangga.get(i)*mangga.getHargaBuah())) {
					harii = i;
				}
			}
			System.out.println("Penghasilan terkecil terjadi di hari "+hari.get(harii)+" dengan total : "+ obj);
		} else if(menu == 5) {
			for(int i = 0; i < 7; i ++) {
				perhari += (tSemangka.get(i)*semangka.getHargaBuah())+(tPisang.get(i)*pisang.getHargaBuah())+(tMangga.get(i)*mangga.getHargaBuah());
				temp.add(perhari);
				perhari *= 0;
			}	
			Object obj = Collections.max(temp);
			for(int i = 0; i < hari.size(); i++) {
				if((int)obj == (tSemangka.get(i)*semangka.getHargaBuah())+(tPisang.get(i)*pisang.getHargaBuah())+(tMangga.get(i)*mangga.getHargaBuah())) {
					harii = i;
				}
			}
			System.out.println("Penghasilan Terbesar terjadi di hari "+hari.get(harii)+" dengan total : "+ obj);
		} else if(menu==6){
			for(int i = 0; i < hari.size(); i++) {
				if(hari.get(i).equals("Kamis")) {
					harii = i;
				} else if (hari.get(i).equals("Minggu")) {
					hari2 = i;
				}
			}
			
		}
	}
}
