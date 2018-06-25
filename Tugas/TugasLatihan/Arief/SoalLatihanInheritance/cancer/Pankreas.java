package cancer;

public class Pankreas extends Kanker{
	String nama, penyebab, penanggulangan;
	Kanker kan = new Kanker();

	public Pankreas() {
		// TODO Auto-generated constructor stub
	}
	
	public Pankreas(Kanker kan, String nama, String penyebab, String penanggulangan) {
		this.kan = kan;
		this.nama = nama;
		this.penyebab = penyebab;
		this.penanggulangan = penanggulangan;
	}
	
	String printKanker() {
		return kan.printKanker() + " nama " + nama + " penyebab " + penyebab + " cara menanggulangi " + penanggulangan;
	}

}
