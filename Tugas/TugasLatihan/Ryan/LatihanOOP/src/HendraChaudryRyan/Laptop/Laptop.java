package HendraChaudryRyan.Laptop;

public class Laptop {
	
	private String nama,merk,processor;
	private int ram,hdd;
	private double layar,clockSpeed;
	
	public Laptop(String nama,String merk,int ram, int hdd,double layar,String processor, double clockSpeed) {                                                                                          
		this.nama = nama;
		this.merk = merk;
		this.ram = ram;
		this.hdd = hdd;
		this.layar = layar;
		this.processor = processor;
		this.clockSpeed = clockSpeed;
	}
	
	String fungsi(String fungsi) {
		return fungsi;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nama : "+nama+
				"\nMerk : "+merk+
				"\nRam : "+ram+"Gb"+
				"\nHardisk : "+hdd+"Gb"+
				"\nUkuran Layar : "+layar+" inch"+
				"\nType Processor : "+processor+
				"\nClock Speeed : "+clockSpeed+
				"\n------------------------------";
	}
 
}
