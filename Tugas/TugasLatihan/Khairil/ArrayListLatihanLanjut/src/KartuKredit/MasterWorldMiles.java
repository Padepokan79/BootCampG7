package KartuKredit;

class MasterWorldMiles extends Kartu implements Insentif {

	private Kartu kartu;
	String namaKartu;
	int totalInsentif;

	public MasterWorldMiles(String namaKartu) {
		jenisKartu = namaKartu;
	}

	public MasterWorldMiles() {

	}

	public Kartu getKartu() {
		return kartu;
	}

	public void setKartu(Kartu kartu) {
		this.kartu = kartu;
	}	
	
	public int setTotalInsentif(int jumJual) {
		totalInsentif = jumJual * insentifMasterWorldmiles;
		return totalInsentif;
	}

	@Override
	String printJenisKartu(String namaKartu) {
		jenisKartu = namaKartu;
		return jenisKartu;
	}
}
