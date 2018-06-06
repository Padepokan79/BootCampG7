package bootcamp;

public class KipasAngin {
	
	String merk, warna;
	int harga, kecepatan;
	double berat, tinggi;
	
	public KipasAngin () {
		
	}
	
	public KipasAngin (String merek, String color, int price, int speed, double weight, double height) {
		merk = merek;
		warna = color;
		harga = price;
		kecepatan = speed;
		berat = weight;
		tinggi = height;
		
	}
	
	void kipasAngin (String merek, String color, int price, int speed, double weight, double height) {
		merk = merek;
		warna = color;
		harga = price;
		kecepatan = speed;
		berat = weight;
		tinggi = height;
		
	}
	
	void spekKipas () {
		System.out.println("Kipas merk " + merk + " dengan warna " + warna + ", tinggi " + tinggi + " cm, berat " + berat + " kecepatan putar " + kecepatan + " rpm dan harga " + harga);
	}
}
