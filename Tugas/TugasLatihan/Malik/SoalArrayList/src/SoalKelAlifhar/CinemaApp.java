/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalKelAlifhar;

import java.util.ArrayList;
import java.util.Scanner;

public class CinemaApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menu,
			incomeSenin = 0,
			incomeSelasa= 0,
			incomeRabu  = 0,
			incomeKamis = 0,
			incomeJumat = 0,
			incomeSabtu = 0,
			incomeMinggu= 0,
			qtySenin 	= 0,
			qtySelasa	= 0,
			qtyRabu  	= 0,
			qtyKamis 	= 0,
			qtyJumat 	= 0,
			qtySabtu 	= 0,
			qtyMinggu	= 0;
		
		System.out.println();
		System.out.println("1. Mencari penjualan perhari");
		System.out.println("2. Mencari penjualan perminggu");
		System.out.println("3. Total tiket yang terjual perhari");
		System.out.println("4. Total tiket yang terjual perminggu");
		System.out.println("5. Perbandingan penjualan antara 2 jenis tiket berbeda(perminggu)");
		System.out.print("Masukan menu pilihan : ");
		menu = scan.nextInt();
		
		Cinema regular = new Cinema("Regular", 45000, 55000, 120, 20, 40, 50, 60, 80, 30);
		Cinema starium = new Cinema("Starium", 50000, 60000, 150, 80, 100, 120, 100, 30, 40);
		Cinema sweetbox = new Cinema("Sweetbox", 55000, 70000, 40, 35, 15, 10, 5, 25, 20);
		Cinema velvet = new Cinema("Velvet", 90000, 125000, 30, 25, 15, 10, 20, 5, 16);
		
		ArrayList<Cinema> arrCinema  = new ArrayList<Cinema>();
		ArrayList<Integer> arrIncome = new ArrayList<Integer>();
		ArrayList<String> arrTiket  = new ArrayList<String>();
		
		arrCinema.add(regular);
		arrCinema.add(starium);
		arrCinema.add(sweetbox);
		arrCinema.add(velvet);
		
		for(Cinema cinema : arrCinema) {
			incomeSenin += cinema.hargaWeekDays*cinema.qtySenin;
			incomeSelasa += cinema.hargaWeekDays*cinema.qtySelasa;
			incomeRabu += cinema.hargaWeekDays*cinema.qtyRabu;
			incomeKamis += cinema.hargaWeekDays*cinema.qtyKamis;
			incomeJumat += cinema.hargaWeekDays*cinema.qtyJumat;
			incomeSabtu+= cinema.hargaWeekEnd*cinema.qtySabtu;
			incomeMinggu += cinema.hargaWeekEnd*cinema.qtyMinggu;
		}
		
		arrIncome.add(incomeSenin);
		arrIncome.add(incomeSelasa);
		arrIncome.add(incomeRabu);
		arrIncome.add(incomeKamis);
		arrIncome.add(incomeJumat);
		arrIncome.add(incomeSabtu);
		arrIncome.add(incomeMinggu);
		
		for(Cinema cinema : arrCinema) {
			qtySenin += cinema.qtySenin;
			qtySelasa += cinema.qtySelasa;
			qtyRabu += cinema.qtyRabu;
			qtyKamis += cinema.qtyKamis;
			qtyJumat += cinema.qtyJumat;
			qtySabtu+= cinema.qtySabtu;
			qtyMinggu += cinema.qtyMinggu;
		}
		
		for(Cinema cinema : arrCinema) {
			arrTiket.add(cinema.jenisTiket);
		}
		
		
		if (menu == 1) {
			System.out.println("Penghasilan hari senin  : Rp. "+incomeSenin);
			System.out.println("Penghasilan hari selasa : Rp. "+incomeSelasa);
			System.out.println("Penghasilan hari rabu   : Rp. "+incomeRabu);
			System.out.println("Penghasilan hari kamis  : Rp. "+incomeKamis);
			System.out.println("Penghasilan hari jumat  : Rp. "+incomeJumat);
			System.out.println("Penghasilan hari sabtu  : Rp. "+incomeSabtu);
			System.out.println("Penghasilan hari minggu : Rp. "+incomeMinggu);
		}else if (menu == 2) {
			System.out.println("Penghasilan seminggu : Rp. "+(incomeJumat+incomeKamis+incomeRabu+incomeSelasa+incomeSenin+incomeSabtu+incomeMinggu));
		}else if (menu == 3) {
			System.out.println("Total tiket yang terjual hari senin  : Rp. "+qtySenin);
			System.out.println("Total tiket yang terjual hari selasa : Rp. "+qtySelasa );
			System.out.println("Total tiket yang terjual hari rabu   : Rp. "+qtyRabu);
			System.out.println("Total tiket yang terjual hari kamis  : Rp. "+qtyKamis);
			System.out.println("Total tiket yang terjual hari jumat  : Rp. "+qtyJumat);
			System.out.println("Total tiket yang terjual hari sabtu  : Rp. "+qtySabtu);
			System.out.println("Total tiket yang terjual hari minggu : Rp. "+qtyMinggu);
		}else if (menu == 4) {
			System.out.println("Total tiket yang terjual seminggu : Rp. "+(qtyJumat+qtyKamis+qtyRabu+qtySelasa+qtySenin+qtySabtu+qtyMinggu));
		}else if (menu == 5) {
			String tiket1, tiket2;
			int selisih1 = 0, selisih2 = 0;
			System.out.print("Masukan tiket 1 : ");
			tiket1 = scan.next();
			System.out.print("Masukan tiket 2 : ");
			tiket2 = scan.next();
			System.out.println();
			for(Cinema cinema : arrCinema) {
				if (tiket1.equals(cinema.jenisTiket)) {
					selisih1 = ((cinema.qtySenin+cinema.qtySelasa+cinema.qtyRabu+cinema.qtyKamis+cinema.qtyJumat)*cinema.hargaWeekDays+(cinema.qtySabtu+cinema.qtyMinggu)*cinema.hargaWeekEnd);
				}
				if (tiket2.equals(cinema.jenisTiket)) {
					selisih2 = ((cinema.qtySenin+cinema.qtySelasa+cinema.qtyRabu+cinema.qtyKamis+cinema.qtyJumat)*cinema.hargaWeekDays+(cinema.qtySabtu+cinema.qtyMinggu)*cinema.hargaWeekEnd);
				}
			}
			if (selisih1 > selisih2) {
				System.out.println("Perbandingan penjualan tiket "+tiket1+" dan tiket "+tiket2+" adalah Rp. "+(selisih1-selisih2));
				
			}else if (selisih2 > selisih1) {
				System.out.println("Perbandingan penjualan tiket "+tiket1+" dan tiket "+tiket2+" adalah Rp. "+(selisih2-selisih1));
				
			}
		}

	}

}
