package TimChaudry;

public class Laptop {
	private String merk, processor;
	private int harga,ukuranRAM,ukuranHardisk;
	private double ukuranLayar, clockSpeed;
	
	Laptop(){
		
	}
	
	Laptop(String merk, String processor, int harga, int ukuranRAM, int ukuranHardisk, double ukuranLayar, double clockSpeed){
		this.merk 			= merk;
		this.processor 		= processor;
		this.harga 			= harga;
		this.ukuranRAM 		= ukuranRAM;
		this.ukuranHardisk 	= ukuranHardisk;
		this.ukuranLayar 	= ukuranLayar;
		this.clockSpeed 	= clockSpeed;
	}
	
	String mengetik() {
		return "Rekomendasi untuk mengetik";
	}
	
	String gaming() {
		if (ukuranRAM > 4 && clockSpeed > 2.5 ) {
			return "Rekomendasi untuk gaming";
		}else {
			return "tidak direkomendasikan untuk gaming";
		}
	}
	
	String tampilLapto() {
		return "Merek\t: "+merk+"\nProcessor: "+processor+"\nRam\t: "+ukuranRAM+"\nLayar\t: "+ukuranLayar+"\nHardisk\t: "+ukuranHardisk+"\nClockSpeed: "+clockSpeed+"\nHarga\t: "+harga;
	}
}
