package Andrian;

public class KankerPankreas extends Kanker {
	private Kanker kanker;
	private String nama, penyebab, penanggulangan;
	
	public KankerPankreas() {
		
	}
	public KankerPankreas(Kanker kanker, String nama, String penyebab, String penanggulangan) {
		this.kanker 	= kanker;
		this.nama 	= nama;
		this.penyebab 	= penyebab;
		this.penanggulangan 	= penanggulangan;
	}
	
	Kanker getKanker() {
		return kanker;
	}
	String getNama() {
		return nama;
	}
	String getPenyebab() {
		return penyebab;
	}
	String getPenanggulangan() {
		return penanggulangan;
	}
	
	public String toString() {
		return getKanker() + "\nNama : "+getNama()+"\n"+
				"Penyebab : "+getPenyebab()+"\n"+
				"Penanggulangan : "+getPenanggulangan();
	}
}
