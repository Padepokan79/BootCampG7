package KartuKreditIuran;

import java.util.*;

class MainCreditCard {

	public static void main(String[] args) {
		int ayahMasterWorldmiles = 1;
		int ayahVisaPlatinum = 1;
		int ibuVisaGold = 1;
		int ibuVisaPlatinum = 1;
		int anakMasterTitanium = 1;
		int index, index1;
		int tahunMax = 5;
		double diskon = 10.0/100.0;
		double kartuAyah = 0, kartuIbu = 0, kartuAnak = 0;
		double biayaTahunan = 0;
		String cardVisaGold, cardMasterTitanium, cardVisaPlatinum, cardMasterWorldmiles;
		int paidVisaGold, paidMasterTitanium, paidVisaPlatinum, paidMasterWorldmiles;
		double totalBiaya = 0;
		
		CreditCard cc1 = new CreditCard();
		CreditCard cc2 = new CreditCard();
		CreditCard cc3 = new CreditCard();
		CreditCard cc4 = new CreditCard();
		cc1.setNamaKartu("Visa Gold");
		cc2.setNamaKartu("Master Titanium");
		cc3.setNamaKartu("Visa Platinum");
		cc4.setNamaKartu("Master Worldmiles");

		cardVisaGold = cc1.getNamaKartu();
		cardMasterTitanium = cc2.getNamaKartu();
		cardVisaPlatinum = cc3.getNamaKartu();
		cardMasterWorldmiles = cc4.getNamaKartu();
		
		cc1.setIuranTahunan(cardVisaGold);
		cc2.setIuranTahunan(cardMasterTitanium);
		cc3.setIuranTahunan(cardVisaPlatinum);
		cc4.setIuranTahunan(cardMasterWorldmiles);
		
		paidVisaGold = cc1.getIuranTahunan();
		paidMasterTitanium = cc2.getIuranTahunan();
		paidVisaPlatinum = cc3.getIuranTahunan();
		paidMasterWorldmiles = cc4.getIuranTahunan();

		ArrayList <String> creditCards = new ArrayList <String>();
		creditCards.add(cardVisaGold);
		creditCards.add(cardMasterTitanium);
		creditCards.add(cardVisaPlatinum);
		creditCards.add(cardMasterWorldmiles);
		
		ArrayList <Integer> annualPay = new ArrayList <Integer>();
		annualPay.add(paidVisaGold);
		annualPay.add(paidMasterTitanium);
		annualPay.add(paidVisaPlatinum);
		annualPay.add(paidMasterWorldmiles);
		
		ArrayList <String> fam = new ArrayList <String>();
		fam.add("Ayah");
		fam.add("Ibu");
		fam.add("Anak");
		
		System.out.println("Iuran Tahunan Per Jenis Kartu --");
		
		index = 0;
		for(int annual: annualPay) {
			System.out.println(creditCards.get(index) + " : Rp " + annual);
			index++;
		}
		
		kartuAyah = (ayahMasterWorldmiles * paidMasterWorldmiles) + (ayahVisaPlatinum * paidVisaPlatinum);
		kartuIbu  = (ibuVisaGold * paidVisaGold) + (ibuVisaPlatinum * paidVisaPlatinum);
		kartuAnak = (anakMasterTitanium * paidMasterTitanium);
		
		ArrayList<Double> paidFamily = new ArrayList<Double>();
		paidFamily.add(kartuAyah);
		paidFamily.add(kartuIbu);
		paidFamily.add(kartuAnak);
		
		System.out.println();
		System.out.println("Rincian Biaya Tahunan Satu Keluarga ");
		
		index1 = 0;
		for(double paidFams : paidFamily) {
			System.out.printf("Biaya untuk kartu " + fam.get(index1) + " : Rp %.2f", paidFams);
			System.out.println();
			totalBiaya = totalBiaya + paidFams;
			index1++;
		}
		System.out.printf("Total untuk satu Keluarga : Rp %.2f", totalBiaya);
		System.out.println();
		System.out.println();
		
		System.out.println("Biaya Annual per tahun");
		
		ArrayList<Double> totalAnnual = new ArrayList<Double>();
		for(int ind = 0; ind < tahunMax; ind++) {
			if(ind == 2) {
				totalAnnual.add(totalBiaya - (totalBiaya * diskon) );	
			}
			else {
				totalAnnual.add(totalBiaya);
			}
			System.out.print("Biaya Annual tahun ke-" + (ind+1));
			System.out.printf("  : Rp %.2f", totalAnnual.get(ind));
			System.out.println();
			biayaTahunan = biayaTahunan + totalAnnual.get(ind);
		}
		System.out.println("---------------------------------------");
		System.out.printf("Total Biaya Kartu Kredit : Rp %.2f",biayaTahunan);
	}

}
