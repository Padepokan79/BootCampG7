package latihanOOP;

public class Dispenser {
	String merek; 
	Double berat;
	int dayaTampung, jmlKeran, tahunBeli;
	
	public Dispenser() {
		
	}
	
	public Dispenser(String brand, Double weight, int volume, int qtyKeran, int purcYear ) {
		merek		= brand;
		berat		= weight;
		dayaTampung	= volume;
		jmlKeran	= qtyKeran;
		tahunBeli	= purcYear;
	}
	
	void specDispencer() {
		System.out.println("Dispenser merek "+merek+",\nberat "+berat+",\ndaya tampung "+dayaTampung+".\njumlah keran "+jmlKeran+".\ntahun beli "+tahunBeli);
	}
	void insertData() {
		merek		= "prikitiew";
		berat		= 12.2;
		dayaTampung	= 60;
		jmlKeran	= 10;
		tahunBeli	= 3000;
	}
}
