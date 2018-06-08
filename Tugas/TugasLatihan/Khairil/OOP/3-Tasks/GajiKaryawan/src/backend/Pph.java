package backend;

public class Pph {
	String statPegawai;
	int ptkpSingle, ptkpMarried, ptkpAnak, ptkp, pkp, jumAnak, keluarga, pkpLvl1, pkpLvl2, pkpLvl3, pkpLvl4;
	double gajiBersihSetahun, tier1, tier2, tier3, tier4;
	double persenpkp1, persenpkp2, persenpkp3, persenpkp4, bbnPPh, bbnPPhTot;
	
	public double hitungGajiSetahun(double gaji) {
		return gaji * 12;
	}
	
	public double hitungPph(double gajiBersihSetahun, String statPegawai) {
		persenpkp1 = 0.05; persenpkp2 = 0.15; persenpkp3 = 0.25; persenpkp4 = 0.3;
		pkpLvl1 = 50000000; pkpLvl2 = 250000000; pkpLvl3 = 500000000;
		ptkpSingle = 36000000; ptkpMarried = ptkpAnak = 3000000; ptkp = 0; pkp = 0; 
		if(statPegawai.equalsIgnoreCase("tidak kawin")) {
			if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			}
			else if(gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle;
				pkp = (int) (gajiBersihSetahun - ptkp);								
			}			
		}

		else if(statPegawai.equalsIgnoreCase("kawin")) {
			if(gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle + ptkpMarried + ptkpAnak;
				pkp = (int) (gajiBersihSetahun - ptkp);				
			}
			else if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			}				
		}

		if(pkp >= 0 && pkp <= pkpLvl1) {
			bbnPPh = (persenpkp1 * pkp);
		}
		else if(pkp > pkpLvl1 && pkp <= pkpLvl2) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * (pkp - tier1);
			bbnPPh = (tier1 + tier2); 
		}
		else if(pkp > pkpLvl2 && pkp <= pkpLvl3) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * pkpLvl2;
			tier3 = persenpkp3 * (pkp - (tier1 + tier2));
			bbnPPh = (tier1 + tier2 + tier3);
		}
		else if(pkp > pkpLvl3) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * pkpLvl2;
			tier3 = persenpkp3 * pkpLvl3;
			tier4 = persenpkp4 * (pkp - tier3);
			bbnPPh = (tier1 + tier2 + tier3 + tier4);
		}
		
		return bbnPPh;
	}
	
	public double pphBulanan(double bbnPPh) {
		return bbnPPh/12;
	}
	
	public String toString() {
		return "Besar Nilai Pph : " + pphBulanan(bbnPPh);
	}
}