package RichaRizaldiVikri;

public class Kaos extends Pakaian {
	private String lengan;

	public Kaos () {
		
	}
	public Kaos (String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga, String lengan) {
		super (ukuran, warna, merek, jenisBahan, madeIn, harga);
		this.setLengan(lengan);
	}

	String printPakaian () {
		return "Kaos " + super.printPakaian() + " memiliki lengan " + getLengan();
	}
	
	public String getLengan() {
		return lengan;
	}
	public void setLengan(String lengan) {
		this.lengan = lengan;
	}
	


}
