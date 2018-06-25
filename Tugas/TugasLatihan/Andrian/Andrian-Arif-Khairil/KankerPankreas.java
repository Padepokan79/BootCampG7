package aak;

public class KankerPankreas extends Kanker {
	private String namaPenyakit, penyebab, penanggulangan, gejala;
	private Kanker kanker;
	private int biaya;
	
	public KankerPankreas() {}
	public KankerPankreas(Kanker kanker, String namaPenyakit, String penyebab, String penanggulangan) {
		this.kanker = kanker;
		this.namaPenyakit = namaPenyakit;
		this.penanggulangan = penanggulangan;
		this.penyebab = penyebab;
	}
	
	
	void macamgejala(String gejala) {
		if (gejala.equals("perhari")) {
			penanggulangan = "operasi";
		}
		else if (gejala.equals("perbulan")) {
			penanggulangan = "kemoterapi";
		}
		else if (gejala.equals("pertahun")) {
			penanggulangan = "herbal";
		}		
	}
	
	int caraPenanggulangan () {
		if (penanggulangan.equals("kemoterapi")) {
			biaya = 1000000;
		}
		else if (penanggulangan.equals("operasi")) {
			biaya = 100000000;
		}
		else if (penanggulangan.equals("herbal")) {
			biaya = 1000000000;
		}
		return biaya;
	}

	public String toString() {
		return kanker.toString()+"\nNama kanker : "+namaPenyakit+
				"\nPenyebab kanker : "+penyebab+"\nPenanggulangan : "+penanggulangan;
	}
}
