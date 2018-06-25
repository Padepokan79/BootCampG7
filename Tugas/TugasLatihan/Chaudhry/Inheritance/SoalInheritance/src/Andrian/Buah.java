package Andrian;

public class Buah {
	private String tipe, biji;
	
	public Buah() {
		
	}
	public Buah(String tipe, String biji) {
		this.tipe 	= tipe;
		this.biji 	= biji;
	}
	
	String getTipe() {
		return tipe;
	}
	String getBiji() {
		return biji;
	}
	
	void kenyang() {
		System.out.println("Mengenyangkan");
	}
	void penyembuh() {
		System.out.println("Mempercepat Penyembuhan luka");
	}
	void tekananDarah() {
		System.out.println("Menurunkan tekanan darah");
	}
	
	public String toString() {
		return "Tipe : "+getTipe()+"\n"+"Jenis : "+getBiji();
	}
}
