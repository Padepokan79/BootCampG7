package AndrianAriefKhairil;

public class Buah {
	private String biji, tipe;
	
	public Buah() {
	}
	
	public Buah(String biji, String tipe) {
		this.biji 	= biji;
		this.tipe 	= tipe;
	}
	
	String tampilBuah() {
		return "Buah[biji: " +biji+ ", tipe: " +tipe+"]";
	}
}
