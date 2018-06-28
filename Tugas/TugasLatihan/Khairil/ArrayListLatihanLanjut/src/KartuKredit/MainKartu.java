package KartuKredit;

import java.util.*;

public class MainKartu {

	private static Scanner inputs;

	public static void main(String[] args) {
		double visaGoldSold = 0, masterTitaniumSold = 0, visaPlatinumSold = 0, masterWorldMilesSold = 0;
		int vg, mt, vp, mwm;
		double totalPenjualanSehari = 0;
		double totalPenjualanSeminggu = 0;
		double totalPenjualanBulanJan = 0;
		double totalPenjualanBulanFeb = 0;
		double totalPenjualanBulanMar = 0;
		double totalPenjualanBulanApr = 0;
		double totalPenjualanBulanMei = 0;
		double totalPenjualanBulanJun = 0;
		double totalPenjualanBulanJul = 0;
		double totalPenjualanBulanAgu = 0;
		double totalPenjualanBulanSep = 0;
		double totalPenjualanBulanOkt = 0;
		double totalPenjualanBulanNov = 0;
		double totalPenjualanBulanDes = 0;
		double totalPenjualanSetahun = 0;
		double persen = 20.0/100;
		String nameVisaGold, nameMasterTitanium, nameVisaPlatinum, nameMasterWorldMiles;
		int jumJan = 31, jumMar = 31, jumMei = 31, jumJul = 31, jumAgu = 31, jumOkt = 31;
		int jumDes = 31, jumApr = 30, jumJun = 30, jumSep = 30, jumNov = 30, jumFeb = 28;
		
		inputs = new Scanner(System.in);
		
		System.out.print("Penjualan Visa Gold : ");
		vg = inputs.nextInt();
		System.out.print("Penjualan Master Titanium : ");
		mt = inputs.nextInt();
		System.out.print("Penjualan Visa Platinum : ");
		vp = inputs.nextInt();
		System.out.print("Penjualan Master World Miles : ");
		mwm = inputs.nextInt();
		
		System.out.println();
		
		//instance Kartu
		VisaGold kartuVisaGold = new VisaGold();
		MasterTitanium kartuMasterTitanium = new MasterTitanium();
		VisaPlatinum kartuVisaPlatinum = new VisaPlatinum();
		MasterWorldMiles kartuMasterWorldMiles = new MasterWorldMiles();
		
		//labeled Kartu
		nameVisaGold = kartuVisaGold.printJenisKartu("Visa Gold");
		nameMasterTitanium = kartuMasterTitanium.printJenisKartu("Master Titanium");
		nameVisaPlatinum = kartuVisaPlatinum.printJenisKartu("Visa Platinum");
		nameMasterWorldMiles = kartuMasterWorldMiles.printJenisKartu("Master World Miles");
		
		//set Hasil Penjualan per jenis kartu
		visaGoldSold = kartuVisaGold.setTotalInsentif(vg);
		masterTitaniumSold = kartuMasterTitanium.setTotalInsentif(mt);
		visaPlatinumSold = kartuVisaPlatinum.setTotalInsentif(vp);
		masterWorldMilesSold = kartuMasterWorldMiles.setTotalInsentif(mwm);
		
		System.out.println();
		System.out.println("-- List Penjualan Kartu Kredit --");
		System.out.println();
		
		ArrayList <String> jenisKartu = new ArrayList<String>();
		jenisKartu.add(nameVisaGold);
		jenisKartu.add(nameMasterTitanium);
		jenisKartu.add(nameVisaPlatinum);
		jenisKartu.add(nameMasterWorldMiles);
		
		ArrayList <Integer> jumlahJual = new ArrayList<Integer>();
		jumlahJual.add(vg);
		jumlahJual.add(mt);
		jumlahJual.add(vp);
		jumlahJual.add(mwm);
		
		ArrayList <Double> totalPenjualan = new ArrayList <Double>();
		totalPenjualan.add(visaGoldSold);
		totalPenjualan.add(masterTitaniumSold);
		totalPenjualan.add(visaPlatinumSold);
		totalPenjualan.add(masterWorldMilesSold);
		
		System.out.println("Jumlah Kartu yang terjual --");
		
		int index = 0;
		for(int penjualan: jumlahJual) {
			System.out.println("Hasil Penjualan Kartu " + jenisKartu.get(index) + " : " + penjualan + " buah");
			index++;
		}
		
		System.out.println();
		
		int index1 = 0;
		for(double penjualanTotal: totalPenjualan) {
			System.out.printf("Total Insentif Kartu " + jenisKartu.get(index1) + " : Rp %.2f", penjualanTotal);
			System.out.println();
			totalPenjualanSehari = totalPenjualanSehari + penjualanTotal;
			index1++;
		}
		System.out.printf("Total Insentif Sehari : Rp %.2f", totalPenjualanSehari);
		System.out.println();
		totalPenjualanSeminggu = totalPenjualanSehari * 7;
		
		System.out.printf("Total Insentif Seminggu : Rp %.2f", totalPenjualanSeminggu);
		System.out.println();
		
		System.out.println();
		
		totalPenjualanBulanJan = jumJan * totalPenjualanSehari;
		totalPenjualanBulanFeb = jumFeb * totalPenjualanSehari;
		totalPenjualanBulanMar = (jumMar * totalPenjualanSehari) - (persen * (jumMar * totalPenjualanSehari)) ;
		totalPenjualanBulanApr = jumApr * totalPenjualanSehari;
		totalPenjualanBulanMei = jumMei * totalPenjualanSehari;
		totalPenjualanBulanJun = jumJun * totalPenjualanSehari;
		totalPenjualanBulanJul = jumJul * totalPenjualanSehari;
		totalPenjualanBulanAgu = jumAgu * totalPenjualanSehari;
		totalPenjualanBulanSep = jumSep * totalPenjualanSehari;
		totalPenjualanBulanOkt = jumOkt * totalPenjualanSehari;
		totalPenjualanBulanNov = jumNov * totalPenjualanSehari;
		totalPenjualanBulanDes = jumDes * totalPenjualanSehari;
		
		ArrayList<String> namaBulan = new ArrayList<String>();
		namaBulan.add("Januari");
		namaBulan.add("Februari");
		namaBulan.add("Maret");
		namaBulan.add("April");
		namaBulan.add("Mei");
		namaBulan.add("Juni");
		namaBulan.add("Juli");
		namaBulan.add("Agustus");
		namaBulan.add("September");
		namaBulan.add("Oktober");
		namaBulan.add("November");
		namaBulan.add("Desember");
		
		ArrayList<Double> totalPenjualanBulanan = new ArrayList<Double>();
		totalPenjualanBulanan.add(totalPenjualanBulanJan);
		totalPenjualanBulanan.add(totalPenjualanBulanFeb);
		totalPenjualanBulanan.add(totalPenjualanBulanMar);
		totalPenjualanBulanan.add(totalPenjualanBulanApr);
		totalPenjualanBulanan.add(totalPenjualanBulanMei);
		totalPenjualanBulanan.add(totalPenjualanBulanJun);
		totalPenjualanBulanan.add(totalPenjualanBulanJul);
		totalPenjualanBulanan.add(totalPenjualanBulanAgu);
		totalPenjualanBulanan.add(totalPenjualanBulanSep);
		totalPenjualanBulanan.add(totalPenjualanBulanOkt);
		totalPenjualanBulanan.add(totalPenjualanBulanNov);
		totalPenjualanBulanan.add(totalPenjualanBulanDes);
		
		System.out.println("Hasil Penjualan Tiap Bulan --");
		
		int index2 = 0;
		for(double totalPenjualanSebulan: totalPenjualanBulanan) {
			System.out.printf("Total Insentif Bulan " + namaBulan.get(index2) + " : Rp %.2f", totalPenjualanSebulan);
			System.out.println();
			index2++;
			totalPenjualanSetahun = totalPenjualanSetahun + totalPenjualanSebulan;
		}
		
		System.out.println();
		System.out.printf("Total Insentif Setahun : Rp %.2f", totalPenjualanSetahun);
	}

}
