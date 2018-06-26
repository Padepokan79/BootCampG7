package KartuKreditIuran;

class CreditCard implements iuranTahunan {
	private String namaKartu;
	private int iuranTahunan;
	public double diskon = 10.0/100.0;
	public double biayaTahunan;
	
	public CreditCard(String namaKartu, int iuranTahunan) {
		this.namaKartu = namaKartu;
		this.iuranTahunan = iuranTahunan;
	}
	
	public CreditCard() {
		
	}

	public void setNamaKartu(String namaKartu) {
		this.namaKartu = namaKartu;
	}

	public String getNamaKartu() {
		return namaKartu;
	}

	public void setIuranTahunan(String namaKartu) {
		this.namaKartu = namaKartu;
		if(namaKartu.equalsIgnoreCase("Visa Gold")) {
			iuranTahunan = visaGold;
		}
		else if(namaKartu.equalsIgnoreCase("Master Titanium")) {
			iuranTahunan = masterTitanium;
		}
		else if(namaKartu.equalsIgnoreCase("Visa Platinum")) {
			iuranTahunan = visaPlatinum;
		}
		else if(namaKartu.equalsIgnoreCase("Master Worldmiles")) {
			iuranTahunan = masterWorldMiles;
		}
	}
	
	public int getIuranTahunan() {
		return iuranTahunan;
	}
	
}
