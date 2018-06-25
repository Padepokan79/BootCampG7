package AndrianAriefKhairil;

public class KankerPankreas extends Kanker{
	private String nama, penyebab, penanggulanagan;
	private Kanker kanker = new Kanker();
	
	public KankerPankreas() {
	}
	
	public KankerPankreas(String nama, String penyebab, String penanggulanan, Kanker kanker) {
		this.nama 		= nama;
		this.penyebab	= penyebab;
		this.penanggulanagan = penanggulanan;
		this.kanker		= kanker;
	}
	
	String gejala() {
		return "AIR SENI BERWARNA HITAM";
	}
	
	String resiko() {
		return "Kematian";
	}
	
	String tampilKankerPankreas() {
		return "Nama : "+nama+", Penyebab : "+penyebab+", Penanggulangan : "+penanggulanagan+", "+kanker;
	}
}
