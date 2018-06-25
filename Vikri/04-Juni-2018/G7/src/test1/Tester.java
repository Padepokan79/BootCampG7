package test1;

public class Tester {
	public static void main(String[] args) {
		G7 anggota1 = new G7();
		G7 anggota2 = new G7("Alifhar", "Pria", "Single", 52.2, 182.2);
		G7 anggota3 = new G7();
		
		anggota1.nama = "Malik";
		anggota1.bBadan = 50.0;
		anggota1.tBadan = 165.0;
		anggota1.gender = "Pria";
		anggota1.status = "Pacaran";
		
		anggota1.greet();
		System.out.println();
		
		anggota2.greet();
		System.out.println();
		
		anggota3.g7();
		System.out.println();
//		==================================================================
		
		KipasAngin kipas1 = new KipasAngin();
		KipasAngin kipas2 = new KipasAngin("Honda", "Merah", 102.3, 35.0, 140, 500000);
		KipasAngin kipas3 = new KipasAngin();
		
		kipas1.berat = 25.5;
		kipas1.harga = 450000;
		kipas1.kecepatan = 145;
		kipas1.merk = "Honda";
		kipas1.tinggi = 102;
		kipas1.warna = "Putih";
		
		kipas1.kipas();
		System.out.println();
		kipas2.kipas();
		System.out.println();
		kipas3.kipas2();
		System.out.println();
//		===================================================================
		
		Dispenser dispen1 = new Dispenser();
		Dispenser dispen2 = new Dispenser("Yamaha", 2, 520000, 30.5, 30.5);
		Dispenser dispen3 = new Dispenser();
		
		dispen1.berat = 30.3;
		dispen1.dayaTampung = 35.2;
		dispen1.jKeran = 3;
		dispen1.merk = "Suzuki";
		dispen1.tBeli = 2017;
		
		dispen1.dispen();
		System.out.println();
		dispen2.dispen();
		System.out.println();
		dispen3.dispen2();
	}
}
