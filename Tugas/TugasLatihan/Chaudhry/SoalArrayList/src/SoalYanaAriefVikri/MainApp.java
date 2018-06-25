/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalYanaAriefVikri;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String inputAngka;
		int totalIncomeSenin  = 0;		int totalIncomeJumat  = 0;		int totalIncomeSebulan = 0;
		int totalIncomeSelasa = 0;		int totalIncomeSabtu  = 0;
		int totalIncomeRabu   = 0;		int totalIncomeMinggu = 0;
		int totalIncomeKamis  = 0;		int totalIncomeSeminggu = 0;
		
		Penjualan roti = new Penjualan("Sari roti cheese", 4500);
		Penjualan silver = new Penjualan("Silver Queen", 11200);
		Penjualan lifebuoy = new Penjualan("Lifebouy Lemonfresh ", 6500);
		Penjualan paseo = new Penjualan("Paseo 200pl ", 11500);
		Penjualan ultramilk = new Penjualan("Ultramilk Coklat ", 4500);
		Penjualan quacker = new Penjualan("Quacker oats ", 9500);
		Penjualan mogu = new Penjualan("Mogu mogu ", 7800);
		Penjualan bear = new Penjualan("Bear brand ", 8500);
		Penjualan teh = new Penjualan("Teh kotak ", 11200);
		Penjualan cadbury = new Penjualan("Cadbury ", 12500);
		Penjualan aqua = new Penjualan("Aqua ", 2500);
		Penjualan floridina = new Penjualan("Floridina ", 3200);
		Penjualan tictac = new Penjualan("Tic Tac ", 9500);
		
		ArrayList<Penjualan> incomeSenin = new ArrayList<Penjualan>();			ArrayList<Penjualan> incomeSelasa = new ArrayList<Penjualan>();
		incomeSenin.add(roti);													incomeSelasa.add(silver);
		incomeSenin.add(silver);												incomeSelasa.add(ultramilk);
		incomeSenin.add(lifebuoy);												incomeSelasa.add(quacker);
		incomeSenin.add(paseo);
		ArrayList<Penjualan> incomeRabu = new ArrayList<Penjualan>();			ArrayList<Penjualan> incomeKamis = new ArrayList<Penjualan>();
		incomeRabu.add(mogu);													incomeKamis.add(bear);
		incomeRabu.add(silver);													incomeKamis.add(ultramilk);
		incomeRabu.add(lifebuoy);												incomeKamis.add(quacker);
		incomeRabu.add(paseo);
		ArrayList<Penjualan> incomeJumat = new ArrayList<Penjualan>();			ArrayList<Penjualan> incomeSabtu = new ArrayList<Penjualan>();
		incomeJumat.add(teh);													incomeSabtu.add(cadbury);
		incomeJumat.add(ultramilk);												incomeSabtu.add(silver);
		incomeJumat.add(quacker);												incomeSabtu.add(aqua);
																				incomeSabtu.add(paseo);
		ArrayList<Penjualan> incomeMinggu = new ArrayList<Penjualan>();
		incomeMinggu.add(floridina);
		incomeMinggu.add(ultramilk);
		incomeMinggu.add(tictac);
		
		for (Penjualan penjualan : incomeSenin) {
			totalIncomeSenin += penjualan.getHargaBarang();
		}
		for (Penjualan penjualan : incomeSelasa) {
			totalIncomeSelasa += penjualan.getHargaBarang();
		}
		for (Penjualan penjualan : incomeRabu) {
			totalIncomeRabu += penjualan.getHargaBarang();
		}
		for (Penjualan penjualan : incomeKamis) {
			totalIncomeKamis += penjualan.getHargaBarang();
		}
		for (Penjualan penjualan : incomeJumat) {
			totalIncomeJumat += penjualan.getHargaBarang();
		}
		for (Penjualan penjualan : incomeSabtu) {
			totalIncomeSabtu += penjualan.getHargaBarang();
		}
		for (Penjualan penjualan : incomeMinggu) {
			totalIncomeMinggu += penjualan.getHargaBarang();
		}
		
		System.out.println("==============================");
		System.out.println("          MINIMARKET          ");
		System.out.println("==============================");
		System.out.println("[1] --> Penghasilan setiap hari");
		System.out.println("[2] --> Penghasilan seminggu");
		System.out.println("[3] --> Penghasilan sebulan");
		System.out.print("Masukan pilihan : ");
		inputAngka = key.nextLine();
		
		if (inputAngka.equals("1")) {
			System.out.println("Penghasilan hari senin sebesar Rp"+totalIncomeSenin);
			System.out.println("Penghasilan hari selasa sebesar Rp"+totalIncomeSelasa);
			System.out.println("Penghasilan hari rabu sebesar Rp"+totalIncomeRabu);
			System.out.println("Penghasilan hari kamis sebesar Rp"+totalIncomeKamis);
			System.out.println("Penghasilan hari jumat sebesar Rp"+totalIncomeJumat);
			System.out.println("Penghasilan hari sabtu sebesar Rp"+totalIncomeSabtu);
			System.out.println("Penghasilan hari minggu sebesar Rp"+totalIncomeMinggu);
			
		}else if (inputAngka.equals("2")) {
			totalIncomeSeminggu = totalIncomeSenin + totalIncomeSelasa + totalIncomeRabu + totalIncomeKamis + totalIncomeJumat + totalIncomeSabtu + totalIncomeMinggu;
			System.out.println("Penghasilan seminggu sebesar Rp"+totalIncomeSeminggu);
		
		}else if (inputAngka.equals("3")) {
			totalIncomeSeminggu = totalIncomeSenin + totalIncomeSelasa + totalIncomeRabu + totalIncomeKamis + totalIncomeJumat + totalIncomeSabtu + totalIncomeMinggu;
			totalIncomeSebulan = totalIncomeSeminggu*4;
			System.out.println("Penghasilan sebulan sebesar Rp"+totalIncomeSebulan);
		
		}
	}

}
