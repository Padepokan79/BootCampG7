package Gaji;

import org.omg.CORBA.MARSHAL;

public class Programmer extends Karyawan implements BPJS, TunjanganTransport, TunjanganMenikah {
	private Karyawan karyawan;
	private int jamLembur, fixBug; 
	private double lembur, pph, bonus, bpjsKesehatan, bpjsKerja, totalPenghasilan, tunjangan, gajiBersihSebulan, gajiKotorSebulan,
					thp, potonganKetenagaKerjaan, potonganKesehatan, potonganBPJSSehat, potonganBPJSKetenagaKerjaan, gajiBersihSetahun,
					tunjanganTransport, tunjanganMenikah;
	private boolean menikah;
	//Pph
	private String statPegawai;
	private int ptkpSingle, ptkpMarried, ptkpAnak, jumAnak, keluarga, pkpLvl1, pkpLvl2, pkpLvl3, pkpLvl4;
	private double tier1, tier2, tier3, ptkp, pkp, tier4;
	private double persenpkp1, persenpkp2, persenpkp3, persenpkp4, bbnPPh;
	
	public Programmer() {
	}
	public Programmer(Karyawan karyawan, int jamLembur, int fixBug, boolean menikah) {
		this.karyawan = karyawan;
		this.jamLembur = jamLembur;
		this.fixBug = fixBug;
		this.menikah = menikah;
	}
	public Karyawan getKaryawan() {
		return karyawan;
	}
	public double getLembur() {
		return lembur;
	}
	public double getPph() {
		return pph;
	}
	public double getBonus() {
		return bonus;
	}
	public double getBpjsKesehatan() {
		return bpjsKesehatan;
	}
	public double getBpjsKerja() {
		return bpjsKerja;
	}
	
	public boolean isMenikah() {
		return menikah;
	}
	public void setMenikah(boolean menikah) {
		this.menikah = menikah;
	}
	
	double tunjangan() {
		double tnjG = 0;
		if (karyawan.getGrade().equalsIgnoreCase("Junior")) {
			tnjG = 200000;
		} else if (karyawan.getGrade().equalsIgnoreCase("Middle")) {
			tnjG = 300000;
		} else if (karyawan.getGrade().equalsIgnoreCase("Senior")) {
			tnjG = 500000;
		} 
		return tunjangan=tunjanganMenikah+tnjG+tunjanganTransport;
	}
	
	double bonusan() {
		bonus = fixBug * 20000;
		if (bonus >=500000) {
			bonus = 500000;
		}
		return bonus;
	}
	
	double totalHasil() {
		totalPenghasilan = karyawan.getGapok() + tunjangan;
		return totalPenghasilan;
	}
	
	@Override
	public double getBPJSKetenagaKerjaan(double totalPenghasilan) {
		potonganBPJSSehat = totalHasil() * persenbpjsKesehatan;
		return potonganBPJSSehat;
	}
	
	@Override
	public double getBPJSKesehatan(double totalPenghasilan) {
		potonganBPJSKetenagaKerjaan = totalHasil() * persenbpjsKetenagaKerjaan;
		return potonganBPJSKetenagaKerjaan;
	}
	
	double thp () {
		thp = gajiBersihSebulan - pph;
		return thp;
	}
	
	double bulananKotor() { //gajikotor
		gajiKotorSebulan = karyawan.getGapok() + tunjangan + bonus;
		return gajiKotorSebulan;
	}
	
	double bulananBersih() { //gajibersih
		gajiBersihSebulan = karyawan.getGapok() + tunjangan + bonus - - (potonganBPJSSehat+potonganBPJSKetenagaKerjaan);
		return gajiBersihSebulan;
	}
	
	double lemburan() {
		lembur = 1.5 * 1.0/173 * gajiKotorSebulan;
		return lembur;
	}

	
	@Override
	public double getTunjanganTransport(String penempatanKerja) {
		if (penempatanKerja.contentEquals("Jakarta")) {
			tunjanganTransport = besarTunjanganTransport;			
		} else {
			tunjanganTransport = 0;
		}
		return tunjanganTransport;
	}
	
	@Override
	public double getTunjanganMenikah(boolean menikah) {
		if (menikah == true) {
			tunjanganMenikah = persenTunjanganMenikah*karyawan.getGapok();
		} else {
			tunjanganMenikah = 0;
		}
		return tunjanganMenikah;
	}
	
	public double hitungPph (boolean menikah) {
		gajiBersihSetahun = gajiBersihSebulan*12;
		persenpkp1 = 0.05; persenpkp2 = 0.15; persenpkp3 = 0.25; persenpkp4 = 0.3;
		pkpLvl1 = 50000000; pkpLvl2 = 250000000; pkpLvl3 = 500000000;
		ptkpSingle = 36000000; ptkpMarried = ptkpAnak = 3000000; ptkp = 0; pkp = 0; 
		if(menikah == false) {
			if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			} else if(gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle;
				pkp = gajiBersihSetahun - ptkp;								
			}			
		} else if(menikah == true) {
			if(gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle + ptkpMarried + ptkpAnak;
				pkp = gajiBersihSetahun - ptkp;				
			} else if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			}				
		} if(pkp >= 0 && pkp <= pkpLvl1) {
			bbnPPh = (persenpkp1 * pkp);
		} else if(pkp > pkpLvl1 && pkp <= pkpLvl2) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * (pkp - tier1);
			bbnPPh = (tier1 + tier2); 
		} else if(pkp > pkpLvl2 && pkp <= pkpLvl3) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * pkpLvl2;
			tier3 = persenpkp3 * (pkp - (tier1 + tier2));
			bbnPPh = (tier1 + tier2 + tier3);
		} else if(pkp > pkpLvl3) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * pkpLvl2;
			tier3 = persenpkp3 * pkpLvl3;
			tier4 = persenpkp4 * (pkp - tier3);
			bbnPPh = (tier1 + tier2 + tier3 + tier4);
		}
		return bbnPPh/12;
	}
	
	public String toString() {
		return karyawan.toString()+"\nBesar uang lembur : "+getLembur()+"\nBesar Gaji kotor : "+gajiKotorSebulan+"\nBesar nilai PPH : "+
				pph+"\nBesar nilai Bonus : "+getBonus()+"\nBesar nilai BPJS Kesehatan : "+potonganBPJSSehat+
				"\nBesar nilai BPJS Ketenaga Kerjaan : "+
				potonganBPJSKetenagaKerjaan+"\nTunjangan : "+tunjangan+"\nBesar take home pay : "+thp;
	}
}
