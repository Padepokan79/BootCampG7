package bootcamp;

public class Dispenser {
	String merk; 
	double berat, dayaTampung; 
	int jmlKeran, tahunBeli;
	
	public Dispenser () {
		
	}
	
	public Dispenser (String merek, double weight, double quota, int totalKeran, int yearBuy) {
		merk = merek;
		berat = weight;
		dayaTampung = quota;
		jmlKeran = totalKeran;
		tahunBeli = yearBuy;
	}
	
	void dispenser (String merek, double weight, double quota, int totalKeran, int yearBuy) {
		merk = merek;
		berat = weight;
		dayaTampung = quota;
		jmlKeran = totalKeran;
		tahunBeli = yearBuy;
	}
	
	void spekDispenser () {
		System.out.println("Dispenser merk " + merk + " berat " + berat + " kg, daya tampung " + dayaTampung + " Liter, memiliki " + jmlKeran + " keran " + " tahun beli " + tahunBeli);
	}
}
