package volumeBangun;

public class KubusBalok {
	int panjang, lebar, sisi, tinggi, volume;
	
	public KubusBalok() {
		
	}
	
	public KubusBalok(int panjang, int lebar, int sisi, int tinggi, int volume) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.sisi = sisi;
		this.tinggi = tinggi;
		this.volume = volume;
	}
	
	public void volumeKubus(int sisi) {
		this.sisi = sisi;
		this.volume = (int) Math.pow(sisi, 3);
	}
	
	public void volumeBalok(int panjang, int lebar, int tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		this.volume = panjang * lebar * tinggi;
	}
	
	public void printVolumeKubus() {
		System.out.println("Volume Kubus adalah : " + this.volume);
	}
	
	public void printVolumeBalok() {
		System.out.println("Volume Balok adalah : " + this.volume);		
	}
}