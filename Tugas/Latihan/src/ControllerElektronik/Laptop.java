package ControllerElektronik;

public class Laptop {
	public String warnaLaptop;
	public String merekLaptop;
	public String processorLaptop;
	public int beratLaptop, ramLaptop;

	public Laptop() {
		
	}
	
	public Laptop(String merek, String warna, String prosesor, int ram, int berat) {
		warnaLaptop = warna;
		merekLaptop = merek;
		processorLaptop = prosesor;
		beratLaptop = berat;
		ramLaptop = ram;
	}
	
	public void inisialLaptop(String merek, String warna, String prosesor, int ram, int berat) {
		warnaLaptop = warna;
		merekLaptop = merek;
		processorLaptop = prosesor;
		beratLaptop = berat;
		ramLaptop = ram;
	}
	
	public void tampilLaptop() {
		System.out.println("Merek laptop anda adalah "+merekLaptop); 
		System.out.println("Dengan warna "+warnaLaptop);
		System.out.println("Berat sebesar "+beratLaptop+" KG");
		System.out.println("Dengan spesifikasi RAM "+ramLaptop+" GB");
		System.out.println("Dan processor  "+processorLaptop);
	}

}


