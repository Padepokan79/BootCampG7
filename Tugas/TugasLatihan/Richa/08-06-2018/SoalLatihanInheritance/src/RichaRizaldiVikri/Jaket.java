package RichaRizaldiVikri;

public class Jaket extends Pakaian {
	
	private String hoody;

	public Jaket () {
		
	}
	public Jaket (String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga, String hoody) {
		super (ukuran, warna, merek, jenisBahan, madeIn, harga);
		this.setHoody(hoody);
		
	}
	public String getHoody() {
		return hoody;
	}
	public void setHoody(String hoody) {
		this.hoody = hoody;
	}
	String printPakaian () {
		return "Jaket " + super.printPakaian() + " memiliki hoody " + getHoody();
	}
}
