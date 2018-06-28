package No4;

public class CreditCard implements Iuran {

	String 	nama;
	double	iuranTahunan, visaGold, masterTitanium, visaPlatinum, masterWorldmiles;
	
	public CreditCard() {
	}
	
	public CreditCard(String nama, double visaGold, double masterTitanium, double visaPlatinum, double masterWorldmiles) {
		this.nama 				= nama;
		this.visaGold 			= visaGold * iuranVisaGold;
		this.masterTitanium		= masterTitanium * iuranMasterPlatinum;
		this.visaPlatinum		= visaPlatinum * iuranVisaPlatinum;
		this.masterWorldmiles 	= masterWorldmiles * iuranMasterWorldmiles;
	}
	
	public String getNama() {
		return nama;
	}

	public double getVisaGold() {
		return visaGold;
	}

	public double getMasterTitanium() {
		return masterTitanium;
	}

	public double getVisaPlatinum() {
		return visaPlatinum;
	}

	public double getMasterWorldmiles() {
		return masterWorldmiles;
	}

	@Override
	public double tagihanIuran(int bulan) {
		// TODO Auto-generated method stub
//		iuranTahunan = 0;
		double discount = 0;
		iuranTahunan = getVisaGold() + getMasterTitanium() + getVisaPlatinum() + getMasterWorldmiles();

		if (bulan == 3) {
			discount = iuranTahunan * diskon;
			iuranTahunan -= discount;
		}
		return iuranTahunan;
	}
}
