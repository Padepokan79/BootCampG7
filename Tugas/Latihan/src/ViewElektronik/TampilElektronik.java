package ViewElektronik;

import ControllerElektronik.Laptop;
import ControllerElektronik.Proyektor;
import ControllerElektronik.Smarphone;

public class TampilElektronik {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Macbook","Putih","Mac Os processor 2.3 Ghz", 8, 5);
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		System.out.println("=========================");
		System.out.println("         Laptop          ");
		System.out.println("=========================");
		
		l3.inisialLaptop("Macbook","Putih","Mac Os processor 2.3 Ghz", 8, 5);
		l2.warnaLaptop = "Putih";
		l2.beratLaptop = 3;
		l2.merekLaptop = "Asus";
		l2.processorLaptop = "Intel Core i7 2.2 Ghz";
		l2.ramLaptop = 4;
		System.out.println();
		l1.tampilLaptop();
		System.out.println();
		l2.tampilLaptop();
		System.out.println();
		l3.tampilLaptop();
		
		Smarphone s1 = new Smarphone();
		Smarphone s2 = new Smarphone("Razer","Hitam","Android",5500,6.5);
		Smarphone s3 = new Smarphone();
		s3.inisialSmartphone("Asus", "Biru", "Android", 3200, 5.5);

		System.out.println();
		System.out.println();
		System.out.println("=========================");
		System.out.println("       SmartPhone        ");
		System.out.println("=========================");
		s2.tampilSmartphone();
		System.out.println();
		System.out.println();
		s3.tampilSmartphone();
		System.out.println();
		System.out.println();
		s1.merekHp = "Iphone";
		s1.warnaHp = "Gold";
		s1.osHp = "IOS";
		s1.batereHp = 6000;
		s1.ukuranLayarHp = 8;
		s1.tampilSmartphone();
		
		int[] ukuran = {24,30,15};
		int[] ukuran2 = {23,13,12};
		
		Proyektor pr1 = new Proyektor();
		Proyektor pr2 = new Proyektor(1500, 2, "Hitam", "IN5ZP1", ukuran2);
		Proyektor pr3 = new Proyektor();
		pr3.inisialProyektor(1100, 3, "Putih", "IN5WP2", ukuran);
		
		System.out.println();
		System.out.println();
		System.out.println("=========================");
		System.out.println("       Proyektor         ");
		System.out.println("=========================");
		pr2.tampilProyektor();
		System.out.println();
		System.out.println();
		pr3.tampilProyektor();
		System.out.println();
		System.out.println();
		pr1.model = "INSDP";
		pr1.warna = "Putih";
		pr1.kecerahan = 2200;
		pr1.berat = 4;
		pr1.arrayUkuran = ukuran2;
		
		pr1.tampilProyektor();
		
		
	}

}
