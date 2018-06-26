package GajiKaryawan;

public class Programmer extends Karyawan implements BPJS {
	private Karyawan karyawan;
	private int jamLembur, fixBug;
	private double lembur, pph, bonus, bpjsKesehatan, bpjsKerja, totalPenghasilan, tunjangan, gajiSebulan, thp,
					potongNaker, potongSehat, potonganBPJSSehat, potonganBPJSNaker, bonuss;
	
	public Programmer() {
	}
	
	public Programmer(Karyawan karyawan, int jamLembur, int fixBug) {
		this.karyawan = karyawan;
		this.jamLembur = jamLembur;
		this.fixBug = fixBug;
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
	
	public double tunjang() {
		tunjangan = 1000000;
		return tunjangan;
	}
	
	public double bonusan() {
		bonus = fixBug * 20000;
		if(bonus >= 500000) {
			bonuss = 500000;
		}
		else {
			bonuss = bonus;
		}
		return bonuss;
	}
	
	public double totHasil() {
		totalPenghasilan = karyawan.getGapok() + tunjangan;
		return totalPenghasilan;
	}
	
//	@Override
	public double getBPJSKesehatan(double totalPenghasilan) {
//		double potonganBPJSSehat;
		potonganBPJSSehat = totHasil() * persenbpjsKesehatan;
		return potonganBPJSSehat;
	}
	
//	@Override
	public double getBPJSKetenagaKerjaan(double totalPenghasilan) {
//		double potonganBPJSNaker;
		potonganBPJSNaker = totHasil() * persenbpjsKetenagaKerjaan;
		return potonganBPJSNaker;
	}
	
	public double tehape() {
		thp = gajiSebulan - (potonganBPJSSehat + potonganBPJSNaker) + lembur;
		return thp;
	}
	
	public double bulanan() {
		gajiSebulan = karyawan.getGapok() + tunjangan + bonus;
		return gajiSebulan;
	}
	
	public double lemburan() {
		lembur = 1.5 * 1.0/173.0 * gajiSebulan;
		return lembur;
	}
	
	
	public String toString() {
		return "Besar nilai lembur\t\t : Rp "+ String.format("%.2f", lembur) +
				"\nBesar nilai Bonus\t\t : Rp "+ String.format("%.2f", getBonus())+
				"\nBesar nilai BPJS Kesehatan\t : Rp "+ String.format("%.2f", potonganBPJSSehat)+
				"\nBesar nilai BPJS Ketenaga Kerjaan : Rp "+ String.format("%.2f", potonganBPJSNaker)+
				"\nTunjangan\t\t\t : Rp " + String.format("%.2f", tunjangan);
	}

	public double getTotalGaji() {
		return bulanan() + lemburan() + bonusan() + tunjang();
	}
	
	public double getBebanGaji() {
		return getBPJSKesehatan(totHasil()) + getBPJSKetenagaKerjaan(totHasil());
	}
	
	public double getTotalBersih() {
		return getTotalGaji() - getBebanGaji();
	}
}
