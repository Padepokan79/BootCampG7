package teamAriefOOP;

public class Buah {
	String tipe, biji;
	
	public Buah() {}
	public Buah(String tipe, String biji) {
		this.tipe=tipe;
		this.biji=biji;
	}
	
	String tampilan() {
		return "\nTipe : "+tipe+"\nBiji : "+biji;
	}
}
