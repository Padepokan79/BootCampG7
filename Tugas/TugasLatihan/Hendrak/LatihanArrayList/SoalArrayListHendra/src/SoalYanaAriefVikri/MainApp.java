package SoalYanaAriefVikri;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempPenghasilan=0;
		int penghasilanMingguan =0;
		String pilih;
		Barang sariRoti = new Barang("sari roti chesee", 4500);
		Barang silverQueen = new Barang("silver queen", 11200);
		Barang lifebouy = new Barang("lifebouy lemonfresh", 6500);
		Barang paseo = new Barang("paseo 200pl", 11500);
		Barang ultraMilk = new Barang("ultramilk coklat", 4500);
		Barang quacker = new Barang("quacker oats", 9500);
		Barang moguMogu = new Barang("mogu mogu", 7800);
		Barang bearBrand = new Barang("bear brand" , 8500);
		Barang tehKotak = new Barang("teh kotak", 11200);
		Barang cadbury = new Barang("cadbury", 12500);
		Barang aqua = new Barang("aqua", 2500);
		Barang floridina = new Barang("floridina", 3200);
		Barang ticTac = new Barang("tic tac", 9500);
		
		ArrayList<String> namaHari = new ArrayList<>();
		namaHari.add("senin");
		namaHari.add("selasa");
		namaHari.add("rabu");
		namaHari.add("kamis");
		namaHari.add("jumat");
		namaHari.add("sabtu");
		namaHari.add("minggu");
		
		ArrayList<Integer> penghasilanHarian = new ArrayList<>();
		ArrayList<Barang> penjualanSenin = new ArrayList<>();
		penjualanSenin.add(sariRoti);
		penjualanSenin.add(silverQueen);
		penjualanSenin.add(lifebouy);
		penjualanSenin.add(paseo);
		
		for (Barang barang : penjualanSenin) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		ArrayList<Barang> penjualanSelasa = new ArrayList<>();
		penjualanSelasa.add(silverQueen);
		penjualanSelasa.add(ultraMilk);
		penjualanSelasa.add(quacker);
		
		tempPenghasilan = 0;
		for (Barang barang : penjualanSelasa) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		ArrayList<Barang> penjualanRabu = new ArrayList<>();
		penjualanRabu.add(moguMogu);
		penjualanRabu.add(silverQueen);
		penjualanRabu.add(lifebouy);
		penjualanRabu.add(paseo);
		
		tempPenghasilan = 0;
		for (Barang barang : penjualanRabu) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		ArrayList<Barang> penjualanKamis = new ArrayList<>();
		penjualanKamis.add(bearBrand);
		penjualanKamis.add(ultraMilk);
		penjualanKamis.add(quacker);
		
		tempPenghasilan = 0;
		for (Barang barang : penjualanKamis) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		ArrayList<Barang> penjualanJumat = new ArrayList<>();
		penjualanJumat.add(tehKotak);
		penjualanJumat.add(ultraMilk);
		penjualanJumat.add(quacker);
		
		tempPenghasilan = 0;
		for (Barang barang : penjualanJumat) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		ArrayList<Barang> penjualanSabtu = new ArrayList<>();
		penjualanSabtu.add(cadbury);
		penjualanSabtu.add(silverQueen);
		penjualanSabtu.add(aqua);
		penjualanSabtu.add(paseo);
		
		tempPenghasilan = 0;
		for (Barang barang : penjualanSabtu) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		ArrayList<Barang> penjualanMinggu = new ArrayList<>();
		penjualanMinggu.add(floridina);
		penjualanMinggu.add(ultraMilk);
		penjualanMinggu.add(ticTac);
		
		tempPenghasilan = 0;
		for (Barang barang : penjualanMinggu) {
			tempPenghasilan += barang.getHargaBarang();
		}
		penghasilanHarian.add(tempPenghasilan);
		
		for(int index=0 ; index < penghasilanHarian.size(); index++) {
			penghasilanMingguan += penghasilanHarian.get(index);
		}
		do {
		System.out.println("========================");
		System.out.println("   MINIMARKET");
		System.out.println("========================");
		System.out.println("Menu");
		System.out.println("1.Penghasilan setiap hari");
		System.out.println("2.Penghasilan seminggu");
		System.out.println("3.Penghasilan sebulan");
		System.out.println("========================");
		System.out.println("Maukan pilihan anda : ");
		Scanner key = new Scanner(System.in);
		pilih = key.next();
		
		if(pilih.equals("1")) {
			for(int index=0 ; index < penghasilanHarian.size(); index++) {
				System.out.println("Penghasilan hari " + namaHari.get(index) + " sebesar Rp." + penghasilanHarian.get(index) );
			}
		}
		else if(pilih.equals("2")) {
			
			System.out.println("Penghasilan mingguan sebesar Rp." + penghasilanMingguan); 
		}
		else if(pilih.equals("3")) {
			System.out.println("Penghasilan bulanan sebesar Rp." + (penghasilanMingguan*4));
		}
		System.out.print("Pilih menu lagi (y/t)?");
		pilih = key.next();
		}while(pilih.equals("y"));
	}

}

 