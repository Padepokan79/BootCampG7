package KartuKredit;

class VisaGold extends Kartu implements Insentif {
	
	private Kartu kartu;
	String namaKartu;
	int totalInsentif;

	public VisaGold(String namaKartu) {
		jenisKartu = namaKartu;
	}
	
	public VisaGold() {
		super();
	}

	public Kartu getKartu() {
		return kartu;
	}

	public int setTotalInsentif(int jumJual) {
		totalInsentif = jumJual * insentifVisaGold;
		return totalInsentif;
	}

	@Override
	String printJenisKartu(String namaKartu) {
		jenisKartu = namaKartu;
		return jenisKartu;
	}
}