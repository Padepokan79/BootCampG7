package AndrianAriefKhairil;

public class KankerPankreas extends Kanker{
	String nama, penyebab, penanggulangan;
	public KankerPankreas() {
		
	}
	public KankerPankreas(String klasifikasi, String faktorRisiko, String nama, String penyebab, String penanggulangan) {
		super(klasifikasi, faktorRisiko);
		this.nama = nama;
		this.penyebab = penyebab;
		this.penanggulangan = penanggulangan;
	}
	// getter
	String getNama() {
		return nama;
	}
	String getPenyebab() {
		return penyebab;
	}
	String getPenanggulangan() {
		return penanggulangan;
	}
	// method
	public String toString() {
		return "klasifikasi kanker\t: "+super.getKlasifikasi()+"\nFaktor\t\t\t: "+super.getFaktor()+
				"\nNama Penyakit\t\t: "+getNama()+"\nPenyebab\t\t: "+getPenyebab()+"\nPenanggulangan\t\t: "+getPenanggulangan();
	}
}
