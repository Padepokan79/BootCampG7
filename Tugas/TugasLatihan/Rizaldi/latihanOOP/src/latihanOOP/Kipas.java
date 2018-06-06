package latihanOOP;

public class Kipas {
	String merek, warna;
	double tinggi, berat;
	int kecepatan, harga;
	public Kipas() {
		
	}
	
	public Kipas(String brand, String color, double height, double weight, int speed, int price) {
		merek		= brand;
		warna		= color;
		tinggi		= height;
		berat		= weight;
		kecepatan	= speed;
		harga		= price;
	}
	
	void specKipas() {
		System.out.println("Kipas merek "+merek+",\nwarna "+warna+",\ntinggi "+tinggi+".\nberat"+berat+".\nkecepatan"+kecepatan+".\nharga"+harga);
	}
	void insertData() {
		merek		= "Subasa";
		warna		= "hitam";
		tinggi		= 123.2;
		berat		= 45.6;
		kecepatan	= 120;
		harga		= 400000;
		
	}
}
