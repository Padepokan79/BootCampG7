/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalKelYana;

import java.util.ArrayList;
import java.util.Scanner;

public class PenjualanApp {

	public static void main(String[] args) {
		int pilihan,
			incomeSenin = 0,
			incomeSelasa= 0,
			incomeRabu  = 0,
			incomeKamis = 0,
			incomeJumat = 0,
			incomeSabtu = 0,
			incomeMinggu= 0;
		Scanner scan =  new Scanner(System.in);
		
		Penjualan sariRoti 		= new Penjualan("Sari Roti Cheese", 4500);
		Penjualan silverQuen 	= new Penjualan("Silver Queen", 11200);
		Penjualan lifebouy		= new Penjualan("Lifebouy Lemonfresh", 6500);
		Penjualan paseo		 	= new Penjualan("Paseo 200 pl", 11500);
		Penjualan ultramilk 	= new Penjualan("Ulramilk Coklat", 4500);
		Penjualan quacker 		= new Penjualan("Quacker ouats", 9500);
		Penjualan mogu 			= new Penjualan("Mogu Mogu", 7800);
		Penjualan bear 			= new Penjualan("Bear Brand", 8500);
		Penjualan teh 			= new Penjualan("Teh Kotak", 11200);
		Penjualan cadbury 		= new Penjualan("Cadbury", 12500);
		Penjualan aqua 			= new Penjualan("Aqua", 2500);
		Penjualan floridina 	= new Penjualan("Floridina", 3200);
		Penjualan tictac 		= new Penjualan("Tictac", 9500);
		
		System.out.println("===================");
		System.out.println("     MINIMARKET");
		System.out.println("===================");
		System.out.println();
		System.out.println("Menu : ");
		System.out.println("1. Penghasilan setiap hari");
		System.out.println("2. Penghasilan seminggu");
		System.out.println("3. Penghasilan sebulan");
		System.out.println();
		System.out.print("Masukan pilihan anda : ");
		pilihan = scan.nextInt();
		
		ArrayList<Penjualan> senin   = new ArrayList<Penjualan>();
		ArrayList<Penjualan> selasa  = new ArrayList<Penjualan>();
		ArrayList<Penjualan> rabu 	 = new ArrayList<Penjualan>();
		ArrayList<Penjualan> kamis   = new ArrayList<Penjualan>();
		ArrayList<Penjualan> jumat   = new ArrayList<Penjualan>();
		ArrayList<Penjualan> sabtu   = new ArrayList<Penjualan>();
		ArrayList<Penjualan> minggu  = new ArrayList<Penjualan>();
		
		senin.add(sariRoti);
		senin.add(silverQuen);
		senin.add(lifebouy);
		senin.add(paseo);
		
		selasa.add(silverQuen);
		selasa.add(ultramilk);
		selasa.add(quacker);
		
		rabu.add(mogu);
		rabu.add(silverQuen);
		rabu.add(lifebouy);
		rabu.add(paseo);
		
		kamis.add(bear);
		kamis.add(ultramilk);
		kamis.add(quacker);
		
		jumat.add(teh);
		jumat.add(ultramilk);
		jumat.add(quacker);
		
		sabtu.add(cadbury);
		sabtu.add(silverQuen);
		sabtu.add(aqua);
		sabtu.add(paseo);
		
		minggu.add(floridina);
		minggu.add(ultramilk);
		minggu.add(tictac);
		
		for(Penjualan pen : senin) {
			incomeSenin += pen.hargaBarang;
		}for(Penjualan pen : selasa) {
			incomeSelasa += pen.hargaBarang;
		}for(Penjualan pen : rabu) {
			incomeRabu += pen.hargaBarang;
		}for(Penjualan pen : kamis) {
			incomeKamis += pen.hargaBarang;
		}for(Penjualan pen : jumat) {
			incomeJumat += pen.hargaBarang;
		}for(Penjualan pen : sabtu) {
			incomeSabtu += pen.hargaBarang;
		}for(Penjualan pen : minggu) {
			incomeMinggu += pen.hargaBarang;
		}
		if (pilihan == 1) {
			System.out.println();
			System.out.println("Penghasilan hari senin  Rp. "+incomeSenin);
			System.out.println("Penghasilan hari selasa Rp. "+incomeSelasa);
			System.out.println("Penghasilan hari rabu   Rp. "+incomeRabu);
			System.out.println("Penghasilan hari kamis  Rp. "+incomeKamis);
			System.out.println("Penghasilan hari jumat  Rp. "+incomeJumat);
			System.out.println("Penghasilan hari sabtu  Rp. "+incomeSabtu);
			System.out.println("Penghasilan hari minggu Rp. "+incomeMinggu);
		}else if (pilihan == 2) {
			System.out.println();
			System.out.println("Penghasilan seminggu  Rp. "+(incomeSenin+incomeSelasa+incomeRabu+incomeKamis+incomeJumat+incomeSabtu+incomeMinggu));
		}else if (pilihan == 3) {
			System.out.println();
			System.out.println("Penghasilan sebulan  Rp. "+(incomeSenin+incomeSelasa+incomeRabu+incomeKamis+incomeJumat+incomeSabtu+incomeMinggu)*4);
		}
	}
}