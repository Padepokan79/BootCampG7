package volumeBangun;

public class Bola {
	int jarijari;
	double phi, volume;
	
	public Bola() {
		
	}
	
	public Bola(int jarijari, double phi, double volume) {
		this.jarijari = jarijari;
		this.phi = phi;
		this.volume = volume;
	}
	
	public void volumeBola(int jarijari) {
		this.jarijari = jarijari;
		if(this.phi % 7 == 0) {
			phi = 22.0/7.0;
		}
		else {
			phi = 3.14;
		}
		this.volume = 4.0/3.0 * phi * Math.pow(jarijari, 3);		
	}

	public void printvolumeBola() {
		System.out.println("volume Bola adalah : " + this.volume);
	}
}