package KartuKredit;

class VisaPlatinum extends Kartu implements Insentif {

	private Kartu kartu;
	String namaKartu;
	int totalInsentif;

	public VisaPlatinum(String namaKartu) {
		jenisKartu = namaKartu;
	}

	public VisaPlatinum() {
		
	}

	public Kartu getKartu() {
		return kartu;
	}

	public void setKartu(Kartu kartu) {
		this.kartu = kartu;
	}	
	
	public int setTotalInsentif(int jumJual) {
		totalInsentif = jumJual * insentifVisaPlatinum;
		return totalInsentif;
	}
	
	@Override
	String printJenisKartu(String namaKartu) {
		jenisKartu = namaKartu;
		return jenisKartu;
	}
}
