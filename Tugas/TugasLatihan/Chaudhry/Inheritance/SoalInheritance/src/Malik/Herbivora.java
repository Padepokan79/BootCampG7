package Malik;

public class Herbivora extends Animal {
	String namaHewan, caraMemangsa;
	
	public Herbivora() {
		
	}
	public Herbivora(String namaJenis, String gerak, String nama, String cara) {
		super(namaJenis, gerak);
		namaHewan = nama;
		caraMemangsa = cara;
	}
	
	String getNamaHewan() {
		return namaHewan;
	}
	String getCaraMangsa() {
		return caraMemangsa;
	}
	
	void cara() {
		System.out.println("Cara mencari makan dengan memakan tumbuhan");
	}
	
	public String toString() {
		return super.toString() + "\n"+
				"Nama Hewan    : "+namaHewan+"\n"+
				"Cara Memangsa : "+caraMemangsa;
	}
}
