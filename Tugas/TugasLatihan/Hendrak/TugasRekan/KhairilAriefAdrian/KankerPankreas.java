package KhairilAriefAdrian;

public class KankerPankreas extends Kanker{
	private String nama, penyebab, penanggulangan;
	private Kanker kanker;
	public KankerPankreas() {
		
	}
	
	public KankerPankreas(String nama, String klasifikasi, String faktorResiko, String penyebab, String penanggulangan) {
		super(klasifikasi, faktorResiko);
		this.nama = nama;
		this.penyebab = penyebab;
		this.penanggulangan = penanggulangan;
	}
	
	public void gejala() {
		System.out.println("Gejala kanker ini air seni berwarna hitam dalam waktu yang lama!");
	}
	
	public void resiko() {
		System.out.println("Resiko kanker ini yaitu kematian");
	}
	
	public String toString() {
		return  
				"\nNama           : " + nama +
				"\nPenyebab       : "+ penyebab +
				"\nPenanggulangan : " + penanggulangan +
				"\n" + super.toString()
				;
	}
}
