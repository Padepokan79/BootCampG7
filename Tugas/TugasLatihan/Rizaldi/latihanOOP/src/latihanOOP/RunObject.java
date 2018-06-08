package latihanOOP;

public class RunObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// G7 ======================================================
		System.out.println("G7 ======================================================");
		G7 member1 = new G7();//instansiasi by reference variable 
		member1.name	="Rizaldi";
		member1.gender	="Cowok";
		member1.status	="Lajang";
		member1.height	=173.0;
		member1.weight	=57.9;
		
		System.out.println("Orang ke 1 : ");
		member1.greeting();
		System.out.println("\n");
		
		G7 member2 = new G7("Richa", "Cewek", "Lajang", 170.0, 55.0);// instansiasi by konstruktor 
		System.out.println("Orang ke 2 : ");
		member2.greeting();
		System.out.println("\n");
		
		System.out.println("Orang ke 3 : ");
		G7 member3 = new G7();// instansiasi by method 
		member3.insertData();
		member3.greeting();
		System.out.println("\n");
		
		// dispencer =============================================
		System.out.println("dispencer =============================================");
		Dispenser dispenser1 = new Dispenser();// instansiasi by reference variable
		dispenser1.merek		="Miyako";
		dispenser1.berat		=12.0;
		dispenser1.dayaTampung	=5;
		dispenser1.jmlKeran		=3;
		dispenser1.tahunBeli	=1990;
		
		System.out.println("Dispenser ke 1 : ");
		dispenser1.specDispencer();
		System.out.println("\n");
		
		Dispenser dispenser2 = new Dispenser("Beijing", 125.4, 4, 1, 1995);// instansiasi bu konstruktor
		System.out.println("Dispenser ke 2 : ");
		dispenser2.specDispencer();
		System.out.println("\n");
		
		System.out.println("Dispenser ke 3 : ");
		Dispenser dispenser3 = new Dispenser();// instansiasi by method
		dispenser3.insertData();
		dispenser3.specDispencer();
		System.out.println("\n");
		
		// kipas ================================================
		System.out.println("kipas =============================================");
		Kipas kipas1 = new Kipas();// instansiasi by reference variable
		kipas1.merek		="suzuki";
		kipas1.warna		="kunyit";
		kipas1.tinggi		= 123.2;
		kipas1.berat		= 45.6;
		kipas1.kecepatan	= 120;
		kipas1.harga		= 444444;
		System.out.println("Kipas ke 1 : ");
		kipas1.specKipas();
		System.out.println("\n");
		
		Kipas kipas2 = new Kipas("YongMa", "putih", 321, 12, 300, 434343);// instansiasi by konstruktor
		System.out.println("Kipas ke 2 : ");
		kipas2.specKipas();
		System.out.println("\n");
		
		System.out.println("Kipas ke 3 : ");
		Kipas kipas3 = new Kipas();// instansiasi by method
		kipas3.insertData();
		kipas3.specKipas();
	}

}
