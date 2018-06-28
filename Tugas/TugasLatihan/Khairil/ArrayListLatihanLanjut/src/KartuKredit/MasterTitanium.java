package KartuKredit;

class MasterTitanium extends Kartu implements Insentif{
	
	private Kartu kartu;
	String namaKartu;
	int totalInsentif;

	public MasterTitanium(String namaKartu) {
		jenisKartu = namaKartu;
	}

	public MasterTitanium() {
		
	}

	public Kartu getKartu() {
		return kartu;
	}

	public void setKartu(Kartu kartu) {
		this.kartu = kartu;
	}
	
	public int setTotalInsentif(int jumJual) {
		totalInsentif = jumJual * insentifMasterTitanium;
		return totalInsentif;
	}

	@Override
	String printJenisKartu(String namaKartu) {
		jenisKartu = namaKartu;
		return jenisKartu;
	}
}