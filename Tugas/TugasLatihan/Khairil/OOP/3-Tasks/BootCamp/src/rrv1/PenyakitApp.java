package rrv1;

import java.util.Scanner;

class PenyakitApp {

	public static void main(String[] args) {
		char asu;
		Penyakit penyakit;
		Flu flu;
		Scanner inputan, inputan1;
		String namaPenyakit, gejala, yangDiserang, keparahan, asuransi;
		double biaya, diskon, total;
		biaya = total = diskon = 0;
		inputan = new Scanner(System.in);
		inputan1 = new Scanner(System.in);
		
		System.out.print("Jenis Asuransi : ");
		asuransi = inputan.nextLine();
		System.out.println();
		System.out.print("Nama Penyakit : ");
		namaPenyakit = inputan1.nextLine();
		System.out.println();
		System.out.print("Gejala : ");
		gejala = inputan.nextLine();
		System.out.println();
		System.out.print("Organ yang dikeluhkan : ");
		yangDiserang = inputan1.nextLine();
		System.out.println();
		System.out.print("Keparahan : ");
		keparahan = inputan.nextLine();
		
		asu = asuransi.charAt(0);
		
		penyakit = new Penyakit(asu);
		flu = new Flu();
		flu.setNamaPenyakit(namaPenyakit);
		flu.setGejala(gejala);
		flu.setBagianYangDiserang(yangDiserang);
		flu.setTingkatKeparahan(keparahan);
		biaya = flu.tingkatParah(keparahan);
		diskon = flu.dapetDiskon(keparahan);
		System.out.println("Nama Penyakit : " + flu.getNamaPenyakit() );
		System.out.println("Gejala : " + flu.getGejala() );
		System.out.println("Bagian yang diserang : " + flu.getBagianYangDiserang() );
		System.out.println("Tingkat Keparahan : " + flu.getTingkatKeparahan() );
		if(asu == 'b') {
			System.out.println( "Biaya pengobatan " + biaya  );
			System.out.println( "Anda mendapat diskon bpjs sebesar " + diskon*100 + "%" );
			total = biaya - (biaya * diskon);
		}
		
		else {
			System.out.println( "Biaya pengobatan " + biaya  );
			total = biaya;
		}
		System.out.println();
		System.out.println("Total biaya : " + total );
	}

}
