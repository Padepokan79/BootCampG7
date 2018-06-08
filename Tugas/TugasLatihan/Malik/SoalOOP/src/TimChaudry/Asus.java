package TimChaudry;

public class Asus extends Laptop{
	private String nama, oS;
	private Laptop laptop;
	
	Asus(){
		
	}
	Asus(Laptop laptop, String nama, String oS){
		this.laptop = laptop;
		this.nama = nama;
		this.oS = oS;
	}
	
	String tampilAsus() {
		return "Nama\t: "+nama+"\nSistem Operasi: "+oS+"\n"+laptop.tampilLapto();
	}
}
