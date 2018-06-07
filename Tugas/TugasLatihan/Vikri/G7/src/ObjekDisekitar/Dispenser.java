package ObjekDisekitar;

public class Dispenser {
	String merk;
	int jKeran, tBeli;
	Double berat, dayaTampung;
	
	public Dispenser() {
		
	}
	
	public Dispenser(String merek, int jkeran, int tbeli, Double bErat, Double tampung) {
		merk = merek;
		jKeran = jkeran;
		tBeli = tbeli;
		berat = bErat;
		dayaTampung = tampung;
	}
	
	void dispen() {
		System.out.println("Dispenser merk "+merk+" berat "+berat+", daya Tampung "+dayaTampung+", \nmemiliki "+jKeran+" Jumlah Keran, Dibeli pada tahun "+tBeli);
	}
	
	void dispen2() {
		merk = "Gucci";
		jKeran = 4;
		tBeli = 2013;
		berat = 35.5;
		dayaTampung = 45.3;
	}
}
