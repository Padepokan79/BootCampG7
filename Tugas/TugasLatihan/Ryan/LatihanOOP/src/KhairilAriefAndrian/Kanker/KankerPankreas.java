package KhairilAriefAndrian.Kanker;

public class KankerPankreas extends Kanker {

	private String nama,penyebab,penanggulangan;
	
	public KankerPankreas(String nama, String penyebab, String klasifikasi, String faktorResiko, String penanggulangan) {
		super(klasifikasi, faktorResiko);
		this.nama = nama;
		this.penyebab = penyebab;
		this.penanggulangan = penanggulangan;
	}
	
	String gejala() {
		return "Air seni berwarna hitam dalam waktu yang lama";
	}
	String resiko() {
		return "Meninggal";
	}
	
	public String toString() {
		return "Nama : "+nama+
				"\nPenyebab : "+penyebab+
				"\n"+super.toString()+
				"\nPenanggulangan : "+penanggulangan+
				"\n----------------------------\n"
				+ "Gejala : "+gejala()+
				"\nResiko : "+resiko();
	}

}
