package volumeBangun;

public class Tabung {
	int jarijari, tinggi;
	double phi, volume;
	
	public Tabung() {
		
	}
	
	public Tabung(int tinggi, int jarijari, double phi, double volume) {
		this.tinggi = tinggi;
		this.jarijari = jarijari;
		this.phi = phi;
		this.volume = volume;
	}
	
	public void volumeTabung(int jarijari, int tinggi) {
		this.jarijari = jarijari;
		this.tinggi = tinggi;
		if(this.phi % 7 == 0) {
			phi = 22.0/7.0;
		}
		else {
			phi = 3.14;
		}
		this.volume = phi * Math.pow(jarijari, 2) * tinggi;		
	}

	public void printvolumeTabung() {
		System.out.println("volume Tabung adalah : " + this.volume);
	}
}