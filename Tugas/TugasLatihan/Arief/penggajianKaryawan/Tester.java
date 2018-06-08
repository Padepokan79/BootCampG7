package penggajianKaryawan;

public class Tester extends Karyawan implements BPJS{
	private Karyawan karyawan;
	private int jamLembur, fixBug;
	private double lembur, pph, bonus, bpjsKesehatan, bpjsKerja, totalPenghasilan, tunjangan, gajiSebulan, thp,
					potongNaker, potongSehat, potonganBPJSSehat, potonganBPJSNaker;
	
	public Tester() {
	}
	public Tester(Karyawan karyawan, int jamLembur, int fixBug) {
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
	double tunjang() {
		tunjangan = 1000000;
		return tunjangan;
	}
	double bonusan() {
		bonus = fixBug * 20000;
		return bonus;
	}
	double totHasil() {
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
	
	double tehape() {
		thp = gajiSebulan - (potonganBPJSSehat + potonganBPJSNaker) + lembur;
		return thp;
	}
	
	double bulanan() {
		gajiSebulan = karyawan.getGapok() + tunjangan + bonus;
		return gajiSebulan;
	}
	
	double lemburan() {
		lembur = 1.5 * 1.0/173.0 * gajiSebulan;
		return lembur;
	}
	
	public String toString() {
		return karyawan.toString() + "\nBesar nilai lembur : " + lembur + "\nBesar nilai PPH : " + getPph() + "\nBesar nilai Bonus : "+
				getBonus() + "\nBesar nilai BPJS Kesehatan : " + potonganBPJSSehat + "\nBesar nilai BPJS Ketenaga Kerjaan : " + potonganBPJSNaker + 
				"\nTunjangan " + tunjangan;
	}
}