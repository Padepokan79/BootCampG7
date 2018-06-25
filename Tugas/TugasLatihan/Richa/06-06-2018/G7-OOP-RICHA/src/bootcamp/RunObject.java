package bootcamp;


public class RunObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G7 anggota1 = new G7 ();
		G7 anggota2 = new G7("Arifar", "male", "jomblo", 56.9, 171.2);
		G7 anggota3 = new G7 () ;
		
		KipasAngin kipas1 = new KipasAngin();
		KipasAngin kipas2 = new KipasAngin("cosmos", "grey", 2300000, 100, 3.4, 134.9);
		KipasAngin kipas3 = new KipasAngin();
		
		Dispenser dispenser1 = new Dispenser();
		Dispenser dispenser2 = new Dispenser("Miyako", 7.9, 3.4, 2, 2010);
		Dispenser dispenser3 = new Dispenser();
		
		anggota1.nama = "Malik";
		anggota1.jenisKelamin = "male";
		anggota1.status = "punya pacar";
		anggota1.beratBadan = 53.9;
		anggota1.tinggiBadan = 170.9;
		
		
		anggota1.greeting();
		
		anggota2.greeting();
		
		anggota3.g7("Richa", "female", "baru jadian", 48.3, 154.7);
		anggota3.greeting();
		System.out.println();
		
		
		
		kipas1.merk = "LG";
		kipas1.warna = "black";
		kipas1.harga = 1290000;
		kipas1.kecepatan = 78;
		kipas1.berat = 2.5;
		kipas1.tinggi = 120.6;
		
		kipas1.spekKipas();

		kipas2.spekKipas();

		
		kipas3.kipasAngin("toshiba", "white", 1400000, 85, 4.1, 90.2);
		kipas3.spekKipas();
		System.out.println();
		
		dispenser1.merk = "cosmos";
		dispenser1.berat = 2.3;
		dispenser1.dayaTampung = 3.2;
		dispenser1.jmlKeran = 1;
		dispenser1.tahunBeli = 2013;
		
		dispenser3.dispenser("pansonic", 1.4, 0.9, 1, 2015);
		
		dispenser1.spekDispenser();
		dispenser2.spekDispenser();
		dispenser3.spekDispenser();		

	}

}
