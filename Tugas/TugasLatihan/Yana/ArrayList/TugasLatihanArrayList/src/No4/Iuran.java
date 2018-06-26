package No4;

public interface Iuran {
	double iuranVisaGold 			= 300000;
	double iuranMasterPlatinum		= 500000;
	double iuranVisaPlatinum 		= 750000;
	double iuranMasterWorldmiles	= 1000000;
	double diskon					= 0.3;
	
	public double tagihanIuran(int bulan);
}
