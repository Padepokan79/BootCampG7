package Malik;

public class Carnivora extends Animal {
	String namaHewan, caraMemangsa;
	
	public Carnivora() {
		
	}
	public Carnivora(String namaJenis, String gerak, String nama, String cara) {
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
		System.out.println("Cara mencari makan dengan memangsa");
	}
	
	public String toString() {
		return super.toString() + "\n"+
				"Nama Hewan    : "+namaHewan+"\n"+
				"Cara Memangsa : "+caraMemangsa;
	}
}
