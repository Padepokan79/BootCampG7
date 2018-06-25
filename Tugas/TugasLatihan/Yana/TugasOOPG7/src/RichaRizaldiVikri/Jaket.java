package RichaRizaldiVikri;

public class Jaket extends Pakaian {
	private String 	ketebalan, kupluk;
	private Pakaian	pakaian = new Pakaian();
	
	public Jaket() {
	}
	
	public Jaket(String ketebalan, String kupluk, Pakaian pakaian) {
		this.pakaian 	= pakaian;
		this.ketebalan 	= ketebalan;
		this.kupluk 	= kupluk;
	}	
	
	String tampilJaket() {
		return "Jaket[ketebalan: "+ketebalan+", kupluk: "+kupluk+", "+pakaian.tampilPakaian()+"]";
	}
	
}
